package com.markone.infrastructure;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownFileReader {

    private String data = "";

    public String getData(Path filePath) {
        String content = "";
        try {
            content = Files.readString(filePath);
            System.out.println(content);
        } catch (IOException e) {
            System.err.println("Failed to read file: " + e.getMessage());
        }
        return content;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
