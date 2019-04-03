/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg4;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
/**
 *
 * @author Dell
 */

public class Task7 extends Application{
    
    //Ширина и длина окна
    private double w = 250,h = 250;
    //Координаты центра мяча
    private double cX = w / 2,cY = h / 2;
    @Override
    public void start(Stage stage){
        //Задаем название окна
        stage.setTitle("Move a ball using the buttons");
        //Создаем группу в которой будут расположены все элементы
        Group p = new Group();
        //Создаем объект класса Мяч
        Ball ball = new Ball(p,cX,cY,10);
        //Обработка событий клавиши
        p.setOnKeyPressed(new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent key_ev){
                if(key_ev.getCode().equals(KeyCode.UP)){
                    ball.setCenterY(ball.getCenterY() + 10);
                }
                else if(key_ev.getCode().equals(KeyCode.DOWN)){
                    ball.setCenterY(ball.getCenterY() - 10);
                }
                else if(key_ev.getCode().equals(KeyCode.RIGHT)){
                    ball.setCenterX(ball.getCenterX() + 10);
                }
                else if(key_ev.getCode().equals(KeyCode.LEFT)){
                    ball.setCenterX(ball.getCenterX() - 10);
                }
            }
        });
        /*
        Кнопки и обработка их событий
        */

        Button btnUp = new Button("Up");
        btnUp.setOnAction(action -> {
            ball.setCenterY(ball.getCenterY() + 10);
        });
        Button btnDw = new Button("Down");
        btnDw.setOnAction(action -> {
            ball.setCenterY(ball.getCenterY() + 10);
        });
        Button btnRt = new Button("Right");
        btnRt.setOnAction(action -> {
            ball.setCenterX(ball.getCenterX() + 10);
        });
        Button btnLt = new Button("Left");
        btnLt.setOnAction(action -> {
            ball.setCenterX(ball.getCenterX() - 10);
        });
        
        HBox hbx = new HBox(1,btnUp,btnDw,btnRt,btnLt);
        
        p.getChildren().addAll(hbx);
        hbx.setLayoutX(30);
        hbx.setLayoutY(200);
        Scene scene = new Scene(p,w,h);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
