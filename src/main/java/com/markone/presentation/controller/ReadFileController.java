package com.markone.presentation.controller;

import com.markone.domain.interfaces.MarkdownStructure;
import com.markone.domain.markdown.parsers.Parser;
import com.markone.infrastructure.MarkdownFileReader;
import javafx.scene.control.TextArea;

import java.nio.file.Path;

public class ReadFileController {

    // ATTs
    final private Path filePath = Path.of("targetMarkdownFile.md");
    MarkdownFileReader markdownFileReader = new MarkdownFileReader();

    public String readFileData() {
        String output = markdownFileReader.readData(filePath);
        MarkdownStructure markdownStructure = new Parser(output).parse();
        return markdownStructure.toString();
    }


}
