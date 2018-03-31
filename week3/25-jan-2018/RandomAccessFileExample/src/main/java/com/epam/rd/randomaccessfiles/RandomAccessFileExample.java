/**
 * This program implements RandomAccessFile.
 */
package com.epam.rd.randomaccessfiles;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Krishnakanth Yachareni
 * @since 25-01-2018
 */
public class RandomAccessFileExample {

    /**
     * @param file
     *            file path
     * @param positon
     *            position in a file to write data.
     * @param data
     *            content
     * @throws IOException
     *             io exception.
     */
    public void writeToRandomAccessFile(final String file, final int positon,
            final String data) throws IOException {
        // create instance of RandomAccessFile
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        // position set
        raf.seek(positon);
        // write data to file.
        raf.writeUTF(data);
        raf.close();
    }

    /**
     * @param file
     *            file path.
     * @param position
     *            position in a file to read data.
     * @return data read from a file.
     * @throws IOException
     *             io exception.
     */
    public String readFromRandomAccessFile(final String file,
            final int position) throws IOException {
        String data = null;
        // create instance for RandomAccessFile
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        // position set
        raf.seek(position);
        // reading line from file.
        data = raf.readLine();
        raf.close();
        return data;
    }

    /**
     * @param args
     *            main args
     */
    public static void main(final String[] args) {
        // Data to write in a file.
        String data = "EPAM Systems Pvt Limited, India";
        RandomAccessFileExample obj = new RandomAccessFileExample();
        try {
            /*
             * calling writeToRandomAccessFile to write data into a RandomFile,
             * position 100.
             */
            obj.writeToRandomAccessFile("E:\\RandomFile.txt", 100, data);
            /*
             * calling readFromRandomAccessFile to read data from a RandomFile.
             * position 100.
             */
            String dataF = obj.readFromRandomAccessFile("E:\\RandomFile.txt",
                    100);
            System.out.println(dataF);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
