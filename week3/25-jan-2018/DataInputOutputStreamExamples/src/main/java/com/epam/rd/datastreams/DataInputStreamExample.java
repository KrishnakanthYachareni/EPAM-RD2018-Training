/**
 * This is Example of DataInputStream and DataOutputStream
 */
package com.epam.rd.datastreams;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.util.ArrayList;
import java.util.List;

import com.epam.rd.streams.InputValidationException;
import com.epam.rd.streams.PushBackEvenOdd;

/**
 * The DataInputStreamExample class can create data input stream instance and
 * read data from file.
 * @author Krishnakanth Yachareni.
 * @since 25-01-2018
 */
public class DataInputStreamExample {
    /**
     * DataInputStream object.
     */
    private DataInputStream dataInput;

    /**
     * @param inputFile
     *            file path.
     * @throws IOException
     *             io exception
     */
    public DataInputStreamExample(final String inputFile) throws IOException {
        dataInput = new DataInputStream(new FileInputStream(inputFile));
    }

    /**
     * This method can iterate in a file and can get student object then add
     * list.
     * @return Array list with student object.
     * @throws IOException
     *             io exception.
     */
    public List<Student> readAll() throws IOException {
        List<Student> listStudent = new ArrayList<>();
        try {
            while (true) {
                String name = dataInput.readUTF();
                boolean gender = dataInput.readBoolean();
                int age = dataInput.readInt();
                float grade = dataInput.readFloat();
                Student student = new Student(name, gender, age, grade);
                listStudent.add(student);
            }
        } catch (EOFException ex) {
            // reach end of file
        }
        dataInput.close();
        return listStudent;
    }

    /**
     * Main method to be called by JVM.
     * @param args
     *            args
     */
    public static void main(final String[] args) {
        try {
            if (args.length == 1) {
                // Instance of DataInputStreamExample and read file path.
                DataInputStreamExample reader = new DataInputStreamExample(
                        args[0]);
                // Calling readAll method to read student data from the file.
                List<Student> listStudent = reader.readAll();
                // Iterate loop to print student data.
                for (Student student : listStudent) {
                    System.out.print(student.getName() + "\t");
                    System.out.print(student.isGender() + "\t");
                    System.out.print(student.getAge() + "\t");
                    System.out.println(student.getGrade());
                }
            } else {
                throw new InputValidationException(
                        "Pass only one exact path directory");
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (InputValidationException e) {
            System.err.println(e.getLocalizedMessage());
        }
    }

}
