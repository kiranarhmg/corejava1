package com.collection.example.filereader;

import java.io.*;

public class FileReadAndWrite {
    public static void main(String[] args) {
        String fileName = "file1.txt";

        // Write to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Hello, this is a line of text written to the file.");
            writer.newLine();
            writer.write("This is another line of text.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Read from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Contents of the file:");

           while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }


        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
