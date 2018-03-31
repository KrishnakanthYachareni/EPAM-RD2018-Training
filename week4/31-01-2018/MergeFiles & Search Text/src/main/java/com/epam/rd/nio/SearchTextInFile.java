/**
 * This package has a program that accepts two command line parameters: a file
 * path and a string.The code should read the specified file and print the lines
 * containing the given string.
 */
package com.epam.rd.nio;

import java.nio.file.Paths;
import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

/**
 * The SearchTextInFile class has searchText method to search word in a file it
 * returns the lines containing the word.
 * @author Krishnakanth_Yachareni
 */
public class SearchTextInFile {

    /**
     * @param text
     *            Line in a file.
     * @param match
     *            search word.
     * @return true or false returns true if word match else false.
     */
    public boolean searchWordInString(final String text, final String match) {
        String[] sentence = text.split(" ");
        for (String word : sentence) {
            if (word.equalsIgnoreCase(match)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param sourcePath
     *            file path.
     * @param text
     *            search word in file.
     * @return String.
     * @throws IOException
     *             io exception when file not found.
     * @throws NoSuchFileException
     *             raise this exception when file path is not found.
     */
    private String searchText(final String sourcePath, final String text)
            throws IOException, NoSuchFileException {
        // Initialize the string variable to store searched text.
        String searchedLine = "";
        // Convert String to File Path.
        Path path = Paths.get(sourcePath);
        // Convert Files to Stream array to get text from the file.
        Stream<String> streamArray = Files.lines(path);
        /*
         * Iterator to iterate the stream string and if given text is found it
         * will set that lines to string.
         */
        Iterable<String> iterable = streamArray::iterator;
        for (String line : iterable) {
            // calling method to search word in string.
            if (searchWordInString(line, text)) {
                searchedLine += line + "\n";
            }
        }
        /*
         * If No lines are found default text can set to string.
         */
        if (searchedLine.isEmpty()) {
            searchedLine = "No Text Found";
        }
        streamArray.close();
        return searchedLine;
    }

    /**
     * The Main method can accept two arguments.
     * @param args
     *            string array command line arguments.
     * @throws IOException
     */
    public static void main(final String[] args) {
        /*
         * Instance of SearchTextInFile class.
         */
        SearchTextInFile searchTextInFile = new SearchTextInFile();
        /*
         * Restrict to accept only two command line arguments.
         */
        if (args.length == 2) {
            try {
                /*
                 * calling searchText method to search lines.
                 */
                String line = searchTextInFile.searchText(args[0], args[1]);
                // Printing the String.
                System.out.println(line);
            } catch (NoSuchFileException e) {
                System.err.println("No File Found");
            } catch (IOException e) {
                System.err.println("Io exception");
            }
        } else {
            System.out.println("Pass two valid arguments");
        }
    }

}
