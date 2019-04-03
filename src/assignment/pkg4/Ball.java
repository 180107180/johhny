package assignment.pkg4;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Ball {
    private double centerX = 100,centerY = 100;
    private double radius = 10;
    private Circle c;
    public void setCenterX(double centerX){
        this.c.setCenterX(centerX);
    }
    public void setCenterY(double centerY){
        this.c.setCenterY(centerY);
    }
    public double getCenterX(){
        return this.c.getCenterX();
    }
    public double getCenterY(){
        return this.c.getCenterY();
    }
    public Ball(Group a,double cX,double cY,double radius){
        this.centerX = cX;
        this.centerY = cY;
        this.radius = radius;
        c = new Circle(cX,cY,radius);
        c.setFill(Color.WHITE);
        c.setStroke(Color.BLACK);
        a.getChildren().add(c);
    }
    public Ball(Pane a,double cX,double cY,double radius){
        this.centerX = cX;
        this.centerY = cY;
        this.radius = radius;
        c = new Circle(cX,cY,radius);
        c.setFill(Color.WHITE);
        c.setStroke(Color.BLACK);
        a.getChildren().add(c);
    }
}