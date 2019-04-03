/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg4;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Dell
 */
/*
public class Task8 extends Application{
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a clock and a label
        
        ClockPane1 clock = new ClockPane1();
        String timeString = clock.getHour() + ":" + clock.getMinute() 
          + ":" + clock.getSecond();
        Label lblCurrentTime = new Label(timeString);
        Button stop = new Button("Stop");
        Button start = new Button("Start");
        // Place clock and label in border pane
        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane.setBottom(lblCurrentTime);
        BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);
        
        
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setTitle("DisplayClock"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
        

      /**
       * The main method is only needed for the IDE with limited
       * JavaFX support. Not needed for running from the command line.
       */
/*
    public static void main(String[] args) {
      //launch(args);
    }
}
*/