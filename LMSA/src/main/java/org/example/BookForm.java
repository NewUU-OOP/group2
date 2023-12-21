package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BookForm extends Application {

    private String ISBN;
    private String title;
    private String subject;
    private String publisher;
    private String language;
    private int numberOfPages;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Book Information Form");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding( new Insets(10,10,10,10));

        // ISBN
        grid.add(new Label("ISBN:"), 0, 0);
        TextField isbnField = new TextField();
        grid.add(isbnField, 1, 0);

        // Title
        grid.add(new Label("Title:"), 0, 1);
        TextField titleField = new TextField();
        grid.add(titleField, 1, 1);

        // Subject
        grid.add(new Label("Subject:"), 0, 2);
        TextField subjectField = new TextField();
        grid.add(subjectField, 1, 2);

        // Publisher
        grid.add(new Label("Publisher:"), 0, 3);
        TextField publisherField = new TextField();
        grid.add(publisherField, 1, 3);

        // Language
        grid.add(new Label("Language:"), 0, 4);
        TextField languageField = new TextField();
        grid.add(languageField, 1, 4);

        // Number of Pages
        grid.add(new Label("Number of Pages:"), 0, 5);
        TextField pagesField = new TextField();
        grid.add(pagesField, 1, 5);

        // Buttons
        Button saveButton = new Button("Save");
        saveButton.setOnAction(e -> {
            // Handle save action
            saveData();
        });

        Button updateButton = new Button("Update");
        updateButton.setOnAction(e -> {
            // Handle update action
            updateData();
        });

        Button cancelButton = new Button("Cancel");
        cancelButton.setOnAction(e -> {
            // Handle cancel action
            clearFields();
        });

        grid.add(saveButton, 0, 6);
        grid.add(updateButton, 1, 6);
        grid.add(cancelButton, 2, 6);

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private void saveData() {
        // Implement save logic here
        // Retrieve data from text fields and perform necessary actions
        System.out.println("Saving data to DB");
    }

    private void updateData() {
        // Implement update logic here
        // Retrieve data from text fields and perform necessary actions
    }

    private void clearFields() {
        // Implement logic to clear all text fields
        // Set text fields to empty or default values
//        isbnField.clear();
//        titleField.clear();
//        subjectField.clear();
//        publisherField.clear();
//        languageField.clear();
//        pagesField.clear();
    }
}
