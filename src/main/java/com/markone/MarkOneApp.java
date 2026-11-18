package com.markone;

import javafx.application.Application;
import javafx.scene.text.Text;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MarkOneApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // TODO: Set the window title to "Mark One"
        Text text = new Text(10, 40, "Hello World");
        text.setFont(new Font(40));
        primaryStage.setTitle("Mark One");

        // TODO: make the window visible
        primaryStage.setScene(new Scene(new Group(text)));
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
