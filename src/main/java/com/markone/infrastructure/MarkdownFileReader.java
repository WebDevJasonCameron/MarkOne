package com.markone.infrastructure;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownFileReader {

    public static void main(String[] args) {
        Path filePath = Path.of("targetMarkdownFile.md");

        try {
            String content = Files.readString(filePath);
            System.out.println(content);
        } catch (IOException e) {
            System.err.println("Failed to read file: " + e.getMessage());
        }
    }

}
