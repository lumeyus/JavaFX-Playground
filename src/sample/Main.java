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

public class Main extends Application /* implements EventHandler<ActionEvent> */ {

    Button myFirstButton, mySecondButton;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Welcome Compadre");

        // Button assignments
        myFirstButton = new Button("My First Button!");
        mySecondButton = new Button("My Second Button!");

        // Alternative way of handling events
        myFirstButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Hola Senor!");
            }
        });

        mySecondButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Hi Mister!");
            }
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(myFirstButton);
        layout.getChildren().add(mySecondButton);

        primaryStage.setScene(new Scene(layout, 1200, 720));
        primaryStage.show();
    }
//    First portrayed way to handle events
//    @Override
//    public void handle(ActionEvent actionEvent) {
//        if (actionEvent.getSource() == myButton) {
//            System.out.println("Hola Senor!");
//        }
//    }

    public static void main(String[] args) {
        launch(args);
    }
}
