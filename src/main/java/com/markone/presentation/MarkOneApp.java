package com.markone.presentation;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import com.markone.infrastructure.MarkdownFileReader;

import java.nio.file.Path;

public class MarkOneApp extends Application {

    final private Path filePath = Path.of("targetMarkdownFile.md");
    MarkdownFileReader markdownFileReader = new MarkdownFileReader();
    private String data;
    private TextArea contentArea;

    private void initializeData() {
        data = markdownFileReader.parseData(filePath);
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

        // Header
        Text text = new Text(10, 40, data);
        text.setFont(new Font(40));
        primaryStage.setTitle("Mark One");



        // Show
        primaryStage.setScene(new Scene(new Group(text)));
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
