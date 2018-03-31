/**
 * A program that has three command line arguments:
 * two input files and an output file.The program should merge the two
 * input files into the given output file. If the output file.
exists, it should ask the user for confirmation.
 */
package com.epam.rd.nio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * The MergeFiles class can merge two files contents into output file.
 * @author Krishnakanth_Yachareni
 */
public class MergeFiles {
    /**
     * Buffer Capacity.
     */
    public static final int BUFFER_CAPACITY = 50;

    /**
     * This method can find the file position in output file, If the file is
     * already exists and then it returns the file position.
     * @param outputFilePath
     *            output file path.
     * @return long file position in output file.
     * @throws IOException
     *             IoException.
     */
    private long existingFilePosition(final String outputFilePath)
            throws IOException {
        // Reading output file.
        BufferedReader br = new BufferedReader(new FileReader(outputFilePath));
        long startingPoint = 0; // or starting position if this file has been
        String line;
        // reading lines in a file and count length then set to startingPoint.
        while ((line = br.readLine()) != null) {
            startingPoint += line.getBytes().length;
        }
        br.close();
        return startingPoint;
    }

    /**
     * This method can write the buffer to Output file channel..
     * @param copyFileChannel
     *            FileChannel It has only READ permissions.
     * @param outputChannel
     *            FileChannel It has only WRITE permissions.
     * @throws IOException
     *             IO Exception.
     */
    private void writeChannel(final FileChannel copyFileChannel,
            final FileChannel outputChannel) throws IOException {
        /*
         * create buffer with capacity of 50 bytes
         */
        ByteBuffer buffer = ByteBuffer.allocate(BUFFER_CAPACITY);
        int bytesRead = copyFileChannel.read(buffer); // read into buffer.
        while (bytesRead != -1) {
            /*
             * make buffer ready for read
             */
            buffer.flip();
            while (buffer.hasRemaining()) {
                // write 1 byte at a time
                outputChannel.write(buffer);
            }
            /*
             * make buffer ready for writing
             */
            buffer.clear();
            bytesRead = copyFileChannel.read(buffer); // read into buffer.
        }
    }

    /**
     * This method can create the FileChannels for given paths then it calls the
     * wrteChannel to write the buffer into output file channel.
     * @param firstFile
     *            file path one.
     * @param secondFile
     *            file path two.
     * @param outputFile
     *            output file path.
     * @throws IOException
     *             IOException.
     */
    private void mergeFiles(final String firstFile, final String secondFile,
            final String outputFile) throws IOException {
        // Buffered reader to ask permissions to the user
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        /*
         * Path of the output
         */
        Path outputFilePath = null;
        // output file position.
        long filePosition = 0;
        /*
         * Creating FileChannel for first file and second file.
         */
        FileChannel firstChannel = FileChannel.open(Paths.get(firstFile),
                StandardOpenOption.READ);
        FileChannel secondChannel = FileChannel.open(Paths.get(secondFile),
                StandardOpenOption.READ);
        /*
         * Validating whether the file is exists or not. If exists it can ask
         * for permission to override existing content.
         */
        if (Files.exists(Paths.get(outputFile))) {
            System.out.println(outputFile
                    + " File is exists...Do you want to repace it?(y/n)");
            char conf = (char) br.read();
            if (conf == 'y') { // yes
                /*
                 * Calling existingFilePosition method to get position in
                 * existing file to append remaining file contents.
                 */
                outputFilePath = Paths.get(outputFile);
                filePosition = existingFilePosition(outputFile);
            }
        } else { // If file not exists new file can create.
            outputFilePath = Files.createFile(Paths.get(outputFile));
            System.out.println(outputFile + " Created....");
        }
        /*
         * set position to output file FileChannel.
         */
        FileChannel thirdChannel = FileChannel
                .open(outputFilePath, StandardOpenOption.WRITE)
                .position(filePosition);
        /*
         * calling writeChannel method to write first file content to output
         * file.
         */
        writeChannel(firstChannel, thirdChannel);
        /*
         * calling writeChannel method to write second file content to output
         * file.
         */
        writeChannel(secondChannel, thirdChannel);
        System.out.println(
                "Files are merged into " + outputFilePath.getFileName());
    }

    /**
     * @param args
     *            string array.
     */
    public static void main(final String[] args) {
        // validate command line arguments.
        if (args.length == 3) {
            // MergeFiles class instance.
            MergeFiles mfils = new MergeFiles();
            try {
                // calling mergeFiles method.
                mfils.mergeFiles(args[0], args[1], args[2]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Pass three arguments");
        }

    }

}
