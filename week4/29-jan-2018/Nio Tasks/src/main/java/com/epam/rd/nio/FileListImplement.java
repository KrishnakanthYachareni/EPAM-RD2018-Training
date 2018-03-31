/**
 * This package has implementation of basic files commands like list
 * files/directory.
 */
package com.epam.rd.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

/**
 * The FileListImplement class can print list of current directory files on
 * console.
 * @author Krishnakanth_Yachareni
 * @since 29-01-2018.
 */
public class FileListImplement {
    /**
     * This Method can show the list of files in current directory.
     * @param path
     *            file path.
     * @throws IOException
     *             io exception
     */
    public void showCurrentDirectoryFiles( String path)
            throws IOException {
        /*
         * This will set current directory path if no path is provided.
         */
        if (path.isEmpty()) {
            path = System.getProperty("user.home");
        }
        /*
         * Convert path to Path and then convert it into Stream type of Path
         * from directory.
         */
        Path pathDir = Paths.get(path);
        Stream<Path> fileArr = Files.list(pathDir);

        System.out.println("Directoy of " + path);
        System.out.println("File Creation Time\t\t"
                + "Last Modified Time\t\tLastAccessTime\t\t\tFile Name");
        /*
         * Iterate Path Stream to get each file properties then it will get
         * printed.
         */
        // Use method reference to iterate stream Path.
        Iterable<Path> iterable = fileArr::iterator;
        for (Path files : iterable) {
            // BasicFileAttributes is nio interface is used to get file
            // attributes like creation time..etc.
            BasicFileAttributes basicFileAttributes = Files
                    .getFileAttributeView(files, BasicFileAttributeView.class)
                    .readAttributes();
            System.out.print(basicFileAttributes.creationTime() + "\t");
            System.out.print(basicFileAttributes.lastModifiedTime() + "\t");
            System.out.print(basicFileAttributes.lastAccessTime() + "\t");
            System.out.println(files.getFileName());
        }

    }
}
