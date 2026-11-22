package com.markone.presentation;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.markone.infrastructure.MarkdownFileReader;

import java.nio.file.Path;

public class MarkOneApp extends Application {

    final private Path filePath = Path.of("targetMarkdownFile.md");
    MarkdownFileReader markdownFileReader = new MarkdownFileReader();
    private TextArea contentArea;

    private void initializeData() {
        contentArea.setText(markdownFileReader.parseData(filePath));
    }

    @Override
    public void start(Stage primaryStage) {

        // TextArea automatically provides scrollbars for large files
        contentArea = new TextArea();
        contentArea.setEditable(false);
        contentArea.setWrapText(true);
        contentArea.setPrefHeight(300);

        // Add Button
        Button button = new Button("Read File");
        button.setOnAction(event -> initializeData());

        VBox root = new VBox(10, button, contentArea);
        root.setPadding(new Insets(15));

        // Header
        primaryStage.setTitle("Mark One");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
