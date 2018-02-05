/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_14_7;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
/**
 *
 * @author Jixer
 */
public class Exercise_14_7 extends Application {
    
    private static int HEIGHT = 400;
    private static int WIDTH = 400;
    
    public void start(Stage primaryStage) {


        GridPane pane = new GridPane();
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                TextField text = new TextField(Integer.toString((int)(Math.random() * 2)));
                text.setMinWidth(WIDTH / 10.0);
                text.setMaxWidth(WIDTH / 10.0);
                text.setMinHeight(HEIGHT / 10.0);
                text.setMaxHeight(HEIGHT / 10.0);
                pane.add(text, b, a);
            }
        }
        
        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(WIDTH);
        primaryStage.setMinHeight(HEIGHT);
        primaryStage.setTitle("10-by-10 Square Matrix");
        primaryStage.show();
        
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
