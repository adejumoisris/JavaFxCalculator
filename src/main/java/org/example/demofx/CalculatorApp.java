package org.example.demofx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculatorApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        TextField num1Field = new TextField();
        TextField num2Field = new TextField();
        Label resultLabel = new Label("Result ");

        Button addButton = new Button();
        Button subtractButton = new Button();
        Button multiplicationButton = new Button();
        Button divisionButton = new Button();

        addButton.setOnAction(e-> calculate(num1Field, num2Field, resultLabel ,"+"));
        subtractButton.setOnAction(e-> calculate(num1Field, num2Field, resultLabel ,"-"));
        multiplicationButton.setOnAction(e-> calculate(num1Field, num2Field, resultLabel ,"-"));
        divisionButton.setOnAction(e-> calculate(num1Field, num2Field, resultLabel ,"-"));

        HBox inputField = new HBox(10, new Label("Num1:"), num1Field, new Label("Num2:"), num2Field);
        HBox button = new HBox(10, addButton, subtractButton,multiplicationButton, divisionButton);

        VBox root = new VBox(15, inputField, button);

        Scene scene = new Scene(root, 200, 400);
        primaryStage.setTitle("Calculator App");
        primaryStage.setScene(scene);
        primaryStage.show();



    }

    private void calculate(TextField num1Field, TextField num2Field, Label resultlabel, String operation){
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result;
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

    }


    public static void main(String[] args) {
        launch();
    }
}
