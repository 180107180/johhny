/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
package assignment.pkg4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */
/*
public class Task_3 extends Application{
    private int centerX = 125,centerY = 125;
    private int radius = 10;
    private Pane pane;

    @Override
    public void start(Stage stage){
        
        Circle c1 = new Circle(centerX,centerY,radius);
        c1.setFill(Color.WHITE);
        c1.setStroke(Color.BLACK);
        
        Label label = new Label();
        Pane pane = new Pane();
        
        Button bUp = new Button("Up");
        bUp.relocate(50,200);
        Button bDw = new Button("Down");
        bDw.relocate(90,200);
        Button bRt = new Button("Right");
        bRt.relocate(130,200);
        Button bLt = new Button("Left");
        bLt.relocate(170,200);
        bUp.setOnAction(new EventHandler<ActionEvent>(){
        @Override
        public void handle(ActionEvent event){
            centerY += 10;
            Circle c1 = new Circle(centerX,centerY,radius);
            c1.setFill(Color.WHITE);
            c1.setStroke(Color.BLACK);
            pane.getChildren().clear();
            pane.getChildren().addAll(bUp,bDw,bRt,bLt,c1);
        }
        });
        bDw.setOnAction(new EventHandler<ActionEvent>(){
        @Override
        public void handle(ActionEvent event){
            centerY -= 10;
            Circle c1 = new Circle(centerX,centerY,radius);
            c1.setFill(Color.WHITE);
            c1.setStroke(Color.BLACK);
            pane.getChildren().clear();
            pane.getChildren().addAll(bUp,bDw,bRt,bLt,c1);
        }
        });
        bRt.setOnAction(new EventHandler<ActionEvent>(){
        @Override
        public void handle(ActionEvent event){
            centerX += 10;
            Circle c1 = new Circle(centerX,centerY,radius);
            c1.setFill(Color.WHITE);
            c1.setStroke(Color.BLACK);
            pane.getChildren().clear();
            pane.getChildren().addAll(bUp,bDw,bRt,bLt,c1);
        }
        });
        bLt.setOnAction(new EventHandler<ActionEvent>(){
        @Override
        public void handle(ActionEvent event){
            centerX -= 10;
            Circle c1 = new Circle(centerX,centerY,radius);
            c1.setFill(Color.WHITE);
            c1.setStroke(Color.BLACK);
            pane.getChildren().clear();
            pane.getChildren().addAll(bUp,bDw,bRt,bLt,c1);
        }
        });
        pane.getChildren().addAll(bUp,bDw,bRt,bLt,c1);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setTitle("Move Ball");
        stage.setWidth(250);
        stage.setHeight(250);
        stage.show();
    }
    public static void main(String[] args){
    launch(args);
    }
}
*/