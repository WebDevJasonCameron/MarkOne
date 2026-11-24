package com.markone.presentation.view;

import com.markone.presentation.controller.ReadFileController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.markone.infrastructure.MarkdownFileReader;

import java.nio.file.Path;

public class MarkOneApp extends Application {

    ReadFileController readFileController = new ReadFileController();
    private TextArea contentArea;

    private void handleReadFileData() {
        contentArea.setText(readFileController.readFileData());
    }

    @Override
    public void start(Stage primaryStage) {

        // TextArea
        contentArea = new TextArea();
        contentArea.setEditable(false);
        contentArea.setWrapText(true);
        contentArea.setPrefHeight(300);

        // Button
        Button button = new Button("Read File");
        button.setOnAction(event -> handleReadFileData());

        // Show
        VBox root = new VBox(10, button, contentArea);
        root.setPadding(new Insets(15));
        primaryStage.setTitle("Mark One");
        primaryStage.setScene(new Scene(root, 500, 400));
        primaryStage.show();
    }



    public static void main(String[] args) {
        Application.launch(args);
    }

}
