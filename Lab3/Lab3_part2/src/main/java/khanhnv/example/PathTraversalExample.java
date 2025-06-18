package khanhnv.example;

import java.io.*;
import java.util.logging.Logger;

public class PathTraversalExample {
    private static final Logger logger = Logger.getLogger(PathTraversalExample.class.getName());

    public static void main(String[] args) {
        String userInput = "../secret.txt";
        File file = new File(userInput);

        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                logger.info("Reading file: " + file.getPath());
                // Optionally read lines
                String line;
                while ((line = reader.readLine()) != null) {
                    // processing...
                }
            } catch (IOException e) {
                logger.severe("Error reading file: " + e.getMessage());
            }
        } else {
            logger.warning("File not found: " + file.getPath());
        }
    }
}
