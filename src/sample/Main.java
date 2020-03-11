package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.Random;
import algorithms.insertionsort;

public class Main extends Application /* implements EventHandler<ActionEvent> */ {

    Button myFirstButton;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Welcome Compadre");

        // Initialize list to sort
        int[] myList;
        Random rand = new Random(); // to fill array with random values
        int upperBound = 10;
        myList = new int[] {rand.nextInt(upperBound), rand.nextInt(upperBound), rand.nextInt(upperBound), rand.nextInt(upperBound), rand.nextInt(upperBound), rand.nextInt(upperBound), rand.nextInt(upperBound), rand.nextInt(upperBound), rand.nextInt(upperBound), rand.nextInt(upperBound)};
        printIntList(myList); // print to view contents pre-sort
        // Button assignments
        myFirstButton = new Button("Sort Button");
        // Easiest way to handle events (Lambda Expressions)
        myFirstButton.setOnAction(e -> {
            int[] newList = myList;
            insertionsort insertionsorter = new insertionsort();
            newList = insertionsorter.sortNumbers(newList);
            printIntList(newList); // print after sort
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(myFirstButton);
        primaryStage.setScene(new Scene(layout, 1200, 720));
        primaryStage.show();
    }
//    One way to handle events
//    @Override
//    public void handle(ActionEvent actionEvent) {
//        if (actionEvent.getSource() == myButton) {
//            System.out.println("Hola Senor!");
//        }
//    }

//    // Alternative way of handling events (anonymous inner classes)
//        myFirstButton.setOnAction(new EventHandler<ActionEvent>() {
//        @Override
//        public void handle(ActionEvent actionEvent) {
//            System.out.println("Hola Senor!");
//        }
//    });

    // prints list of int
    public void printIntList(int[] list){
        for (int number: list) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
