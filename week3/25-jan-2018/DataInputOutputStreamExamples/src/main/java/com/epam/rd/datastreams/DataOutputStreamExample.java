/**
 * This is Example of DataInputStream and DataOutputStream
 */
package com.epam.rd.datastreams;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.util.ArrayList;
import java.util.List;

import com.epam.rd.streams.InputValidationException;
import com.epam.rd.streams.PushBackEvenOdd;

/**
 * The DataOutputStreamExample class is create data output stream instance and
 * write data object 0 to file.
 * @author Krishnakanth Yachareni.
 * @since 25-01-2018
 */
public class DataOutputStreamExample {
    /**
     * DataOutputStream object.
     */
    private DataOutputStream dataOutput;

    /**
     * Constructor can an initialize DataOutputStream.
     * @param outputFile
     *            is path of the file in memory.
     * @throws IOException
     *             io exception
     */
    public DataOutputStreamExample(final String outputFile) throws IOException {
        dataOutput = new DataOutputStream(new FileOutputStream(outputFile));
    }

    /**
     * This can write student data to a file.
     * @param student
     *            student object.
     * @throws IOException
     *             io exception.
     */
    public void write(final Student student) throws IOException {
        dataOutput.writeUTF(student.getName());
        dataOutput.writeBoolean(student.isGender());
        dataOutput.writeInt(student.getAge());
        dataOutput.writeFloat(student.getGrade());
    }

    /**
     * This method close the DataOuptutStream.
     * @throws IOException
     *             io exception.
     */
    public void save() throws IOException {
        dataOutput.close();
    }

    /**
     * Main method to be called by JVM.
     * @param args
     *            main args.
     */
    public static void main(final String[] args) {
        // Array list
        List<Student> listStudent = new ArrayList<>();
        // Adding Student objects to list.
        listStudent.add(new Student("Krishnakanth", true, 21, 80.5f));
        listStudent.add(new Student("Yachareni", false, 22, 95.0f));
        listStudent.add(new Student("Sravanthi", false, 18, 79.8f));

        try {
            if (args.length == 1) {
                // DataOutputStream instance
                DataOutputStreamExample writer = new DataOutputStreamExample(
                        args[0]);
                // Loop iteration.
                for (Student student : listStudent) {
                    writer.write(student);
                }
                // calling save method to close the stream object.
                writer.save();
            } else {
                throw new InputValidationException(
                        "Pass only one exact path directory");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InputValidationException e) {
            System.err.println(e.getLocalizedMessage());
        }

    }
}
