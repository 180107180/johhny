/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg4;

import javafx.application.Application;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
/**
 *
 * @author Dell
 */
/*
public class Task1 extends Application{
    public static void main(String[] args){
        Application.launch(args);
    }
    @Override
    public void start(Stage stage){
        //Head
        Circle c1 = new Circle();
        c1.setCenterX(200);
        c1.setCenterY(200);
        c1.setRadius(100);
        c1.setStroke(Color.RED);
        c1.setFill(Color.YELLOW);
        //Mouth
        Arc c2 = new Arc();
        c2.setCenterX(200);
        c2.setCenterY(240);
        c2.setRadiusX(50);
        c2.setRadiusY(30);
        c2.setStartAngle(180);
        c2.setLength(190);
        c2.setFill(Color.YELLOW);
        c2.setStroke(Color.BLUE);
        c2.setType(ArcType.OPEN);
        //Left eye
        Circle eye_l = new Circle(160,160,15);
        eye_l.setStroke(Color.BLUE);
        eye_l.setFill(Color.YELLOW);
        //Right eye
        Circle eye_r = new Circle(240,160,15);
        eye_r.setStroke(Color.BLUE);
        eye_r.setFill(Color.YELLOW);
        //Text
        Text tx = new Text("Smiley Face");
        tx.setLayoutX(150);
        tx.setLayoutY(360);
        tx.setFont(Font.font("calibri",FontWeight.BLACK,FontPosture.REGULAR,20));
        //Pane
        Pane p1 = new Pane();
        p1.getChildren().add(c1);
        p1.getChildren().add(c2);
        p1.getChildren().add(eye_l);
        p1.getChildren().add(eye_r);
        p1.getChildren().add(tx);
        //Scene
        Scene sc1 = new Scene(p1,400,400);
        sc1.setFill(Color.YELLOW);
        //Stage
        stage.setTitle("Task1");
        stage.setScene(sc1);
        stage.show();
    }
}
*/