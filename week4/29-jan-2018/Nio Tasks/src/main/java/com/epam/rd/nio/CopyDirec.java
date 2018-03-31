/**
 * This package has implementation of basic files commands like list
 * files/directory.
 */
package com.epam.rd.nio;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * This program copies a whole directory (including its sub files and sub
 * directories) to another, using the Java NIO API.
 * @author Krishnakanth Yachareni
 */
public class CopyDirec extends SimpleFileVisitor<Path> {
    /**
     * source directory path.
     */
    private Path sourceDir;
    /**
     * Target directory path.
     */
    private Path targetDir;

    /**
     * Constructor initialize the paths.
     * @param sourcDir
     *            source path
     * @param targDir
     *            target path
     */
    public CopyDirec(final Path sourcDir, final Path targDir) {
        this.sourceDir = sourcDir;
        this.targetDir = targDir;
    }

    @Override
    public final FileVisitResult visitFile(final Path file,
            final BasicFileAttributes attributes) {
        /*
         * Invoked for a file in a directory.
         */
        try {
            Path targetFile = targetDir.resolve(sourceDir.relativize(file));
            Files.copy(file, targetFile);
            System.out.println("Copied " + targetFile);
        } catch (IOException ex) {
            System.err.println(ex);
        }

        return FileVisitResult.CONTINUE;
    }

    @Override
    public final FileVisitResult preVisitDirectory(final Path dir,
            final BasicFileAttributes attributes) {
        /*
         * It can invoked for a directory before entries in the directory are
         * visited.then it can create the directory.
         */
        try {
            Path newDir = targetDir.resolve(sourceDir.relativize(dir));
            Files.createDirectory(newDir);
        } catch (IOException ex) {
            System.err.println(ex);
        }

        return FileVisitResult.CONTINUE;
    }
}
