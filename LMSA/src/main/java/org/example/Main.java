package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage primaryStage) throws Exception {
       BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, 200,200);
        primaryStage.setTitle("Login");
        primaryStage.show();
    }
}