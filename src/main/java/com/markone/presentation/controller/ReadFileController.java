package com.markone.presentation.controller;

import com.markone.infrastructure.MarkdownFileReader;
import javafx.scene.control.TextArea;

import java.nio.file.Path;

public class ReadFileController {

    // ATTs
    final private Path filePath = Path.of("targetMarkdownFile.md");
    MarkdownFileReader markdownFileReader = new MarkdownFileReader();

    public String readFileData() {
        return markdownFileReader.parseData(filePath);
    }


}
