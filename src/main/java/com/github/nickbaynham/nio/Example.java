package com.github.nickbaynham.nio;

import java.io.IOException;
import java.nio.file.*;

public class Example {
    private static final String DIRECTORY = "C:\\Users\\nbaynham\\Documents\\oca2";
    private static final String FILE_NAME = "myfile.txt";
    private static final String CONTENT = "Test file Content 2.";

    public static void main(String[] args) {
        Path path = Paths.get(DIRECTORY);
        if (Files.notExists(path)) {
            System.out.println("destination directory doesn't exist.");
        } else {
            System.out.println("file will be overwritten!");
            try {
                path = Paths.get(DIRECTORY + "\\" + FILE_NAME);
                Files.write(path, CONTENT.getBytes());
            } catch (IOException e) {
                System.out.println("Unable to write to file: " + FILE_NAME);
                e.printStackTrace();
            }
        }
    }
}
