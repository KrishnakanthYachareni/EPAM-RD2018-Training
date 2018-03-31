/**
 * This package has implementation of basic files commands like list
 * files/directory.
 */
package com.epam.rd.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * The CommandsDemo class has main method.
 * @author Krishnakanth_Yachare
 */
public final class CommandsDemo {
    /**
     * Default constructor.
     */
    private CommandsDemo() {
    }

    /**
     * @param args string array.
     */
    public static void main(final String[] args) {
        CommandsDemo cmd = new CommandsDemo();
        // creating instances for classes
        FileListImplement fli = new FileListImplement();
        MakeDirectory md = new MakeDirectory();

        // Arguments validation.
        try {
            if (args.length == 1 && args[0].equals("ls")) {

                fli.showCurrentDirectoryFiles("");
            } else if (args.length == 2 && args[0].equals("ls")) {
                fli.showCurrentDirectoryFiles(args[1]);
            } else if (args.length == 2 && args[0].equals("mkdir")) {
                md.makeDirectory(args[1]);
            } else if (args.length == 3 && args[0].equals("cp")) {
                // calling walkFileTree of Files.
                Files.walkFileTree(Paths.get(args[1]),
                        new CopyDirec(Paths.get(args[1]), Paths.get(args[2])));
            } else {
                System.out.println("No command Found");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println(e.getLocalizedMessage());
        }
    }

}
