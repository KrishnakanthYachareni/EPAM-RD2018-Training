/**
 * This package has implementation of basic files commands like list
 * files/directory.
 */
package com.epam.rd.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * The FileListImplement class can print list of current directory files on
 * console.
 * @author Krishnakanth_Yachareni
 * @since 29-01-2018.
 */
public class MakeDirectory {
    /**
     * @param path
     *            directory path
     * @throws NoSuchFileException
     *             exception when file not found.
     * @throws IOException
     *             io exception.
     */
    public void makeDirectory(final String path)
            throws NoSuchFileException, IOException {
        /*
         * nio Path creating
         */
        Path gPath = Paths.get(path);
        // checking whether the path exists or not.
        if (Files.notExists(gPath)) {
            // creating directory.
            Files.createDirectories(gPath);
            System.out.println(gPath.getFileName() + "file has created.");
        } else {
            throw new NoSuchFileException(" Directory is already exists");
        }
    }
}
