/**
 * This application can create 5 persons objects and store its in a file and
 * then read the objects from the file using serialization.
 */
package com.epam.rd.persistentfiles;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * The EmpDemo class has main method create employee objects and can store in a
 * file and read those objects from a file.
 * @author Krishnakanth Yachareni
 * @since 25-01-2018
 */
public final class EmpDemo {
    /**
     * Default constructor.
     */
    private EmpDemo() {
    }

    /**
     * Main method to be called by JVM.
     * @param args
     *            string array
     * @throws IOException
     *             input output exception
     * @throws ClassNotFoundException
     *             exception throws when file is not found.
     */
    public static void main(final String[] args) {
        ObjectOutputStream os = null;
        ObjectInputStream oi = null;
        try {
            // Create ObjectOutputStream
            os = new ObjectOutputStream(new FileOutputStream("E:\\dummy.bin"));
            // creating employee objects
            Employee ob1 = new Employee("Krishnakanth", 21, "Siddipet");
            Employee ob2 = new Employee("Sravanthi", 18, "Hyderabad");
            Employee ob3 = new Employee("Srikanth", 28, "Hyderabad");
            Employee ob4 = new Employee("Robert", 25, "Us");
            Employee ob5 = new Employee("Tony Stark", 32, "Newyork");
            // writing employee objects to file.
            os.writeObject(ob1);
            os.writeObject(ob2);
            os.writeObject(ob3);
            os.writeObject(ob4);
            os.writeObject(ob5);
            // create ObjectInputStream
            oi = new ObjectInputStream(new FileInputStream("E:\\dummy.bin"));

            Object obj = null;
            // Loop to iterate all the objects from a file.
            while ((obj = oi.readObject()) != null) {
                if (obj instanceof Employee) {
                    System.out.println(((Employee) obj));
                }
            }
        } catch (EOFException e) {
            System.err.println("File End is reached.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (oi != null) {
                try {
                    oi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
