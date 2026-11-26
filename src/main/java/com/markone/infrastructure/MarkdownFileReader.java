package com.markone.infrastructure;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownFileReader {

    // ATTs

    // METHs
    public String readData(Path filePath) {
        String content = "";
        try {
            content = Files.readString(filePath);
            System.out.println(content);
        } catch (IOException e) {
            System.err.println("Failed to read file: " + e.getMessage());
        }
        return content;
    }

}
