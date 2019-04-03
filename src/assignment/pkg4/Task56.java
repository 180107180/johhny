///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package assignment.pkg4;
//
//import javafx.application.Application;
//import javafx.event.EventHandler;
//import javafx.geometry.Pos;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.stage.Stage;
////
///**
// *
// * @author Dell
// */
//
//public class Task56 extends Application{
//    //Размеры окна
//    private double w = 400,h = 400;
//    //Координаты центра окружности
//    private int centerX = (int)w / 2,centerY = (int) h / 2;
//    //Радиус окружности
//    private int radius = 10;
//    /*
//    @Пометка: Удалить код ниже,он не нужен.
//    */
//    public void paintCircle(Group p){
//        Circle circle = new Circle(centerX,centerY,radius);
//        circle.setFill(Color.WHITE);
//        circle.setStroke(Color.RED);
//        p.getChildren().clear();
//        p.getChildren().add(circle);
//    }
//    @Override
//    public void start(Stage stage){
//        /*
//        Объявление различных переменных
//        Создавать класс для круга было лень,так что я создал его здесь
//        */
//        Label text = new Label("");
//        text.setLayoutX(200);
//        text.setLayoutY(380);
//        stage.setTitle("Game");
//        Circle circle = new Circle(centerX,centerY,radius);
//        circle.setFill(Color.RED);
//        circle.setStroke(Color.RED);
//        Group p = new Group(circle,text);
//        Scene scene = new Scene(p,w,h);
//        scene.setFill(Color.YELLOW);
//        scene.setOnMouseMoved(new EventHandler<MouseEvent>(){
//            @Override
//            public void handle(MouseEvent e){
//                /*
//                Когда курсор близок к мячу,мяч бежит от него как Форрест от машины тренера
//                */
//                //Проверяем расположение курсора,если его координаты + 50 больше или равны координате центров Мяча,то мяч перемещается на 5 единиц
//                //По иксу
//                if(e.getX() + 50 >= circle.getCenterX()){
//                    centerX +=5;
//                    circle.setCenterX(centerX);
//                }
//                //По игреку
//                if(e.getY() + 50 >= circle.getCenterY()){
//                    centerY +=5;
//                    circle.setCenterY(centerY);
//                }
//                /*
//                Когда мяч выходит за границы окна
//                */
//                if(circle.getCenterX() > w){
//                    centerX -= w;
//                    circle.setCenterX(centerX);
//                }
//                if(circle.getCenterY() > h){
//                    centerY -= h;
//                    circle.setCenterY(centerY);
//                }
//                
//            }
//        });
//        p.setOnMousePressed(new EventHandler<MouseEvent>(){
//            @Override
//            public void handle(MouseEvent event){
//                text.setText("Keep Trying !!!!!");
//            }}
//        );
//        stage.setScene(scene);
//        stage.show();
//    }
//    public static void main(String[] args){
//        launch(args);
//    }
//}
