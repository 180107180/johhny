///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package assignment.pkg4;
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.VBox;
//import javafx.scene.paint.Color;
//import javafx.stage.Stage;
//
///**
// * Код написан в соавторстве с 10 чашками кофе "Nescafe" и корпорацией "SweetDreams Ent."
// * @author Dell
// */
///*
//@Пометка;Добавить лейблы
//*/
//
//public class Task4 extends Application{
//    //из см в дюймы
//    public double cmToInc(String a){
//        return Double.parseDouble(a) * 0.393701;
//    }
//    //из дюймов в см
//    public double incToCm(String a){
//        return Double.parseDouble(a) * 2.54;
//    }
//    //из км в мили
//    public double kmToMl(String a){
//        return Double.parseDouble(a) * 0.621371;
//    }
//    //из милей в км
//    public double mlToKm(String a){
//        return Double.parseDouble(a) * 1.60934;
//    }
//    //из кг в фунт
//    public double kgToLb(String a){
//        return Double.parseDouble(a) * 2.20462;
//    }
//    //из фунта в кг
//    public double lbToKg(String a){
//        return Double.parseDouble(a) * 0.453592;
//    }
//    @Override
//    public void start(Stage stage){
//        //Labels
//        Label cmL = new Label("cm");
//        Label kmL = new Label("km");
//        Label kgL = new Label("kg");
//        Label inchesL = new Label("inches");
//        Label milesL = new Label("miles");
//        Label LbL = new Label("pounds");
//        stage.setTitle("Converter");
//        //Group and Scene
//        Group root = new Group();
//        Scene scene = new Scene(root,380,250,Color.WHITE);
//        //Текстовые поля слева
//        TextField cm = new TextField();
//        TextField km = new TextField();
//        TextField kg = new TextField();
//        //Текстовые поля справа
//        TextField inches = new TextField();
//        TextField miles = new TextField();
//        TextField Lb = new TextField();
//        //Кнопки и обработка событий
//        Button btn1 = new Button("===>");
//        btn1.setOnAction(action -> {
//            inches.setText(Double.toString(cmToInc(cm.getText())));
//        });
//        Button btn2 = new Button("<===");
//        btn2.setOnAction(action -> {
//            cm.setText(Double.toString(incToCm(inches.getText())));
//        });
//        Button btn3 = new Button("===>");
//        btn3.setOnAction(action -> {
//            miles.setText(Double.toString(kmToMl(km.getText())));
//        });
//        Button btn4 = new Button("<===");
//        btn4.setOnAction(action -> {
//            km.setText(Double.toString(mlToKm(miles.getText())));
//        });
//        Button btn5 = new Button("===>");
//        btn5.setOnAction(action -> {
//            Lb.setText(Double.toString(kgToLb(kg.getText())));
//        });
//        Button btn6 = new Button("<===");
//        btn6.setOnAction(action -> {
//            kg.setText(Double.toString(lbToKg(Lb.getText())));
//        });
//        //Вертикальные боксы,в которых рсаположены ә кнопки
//        VBox vbx1 = new VBox(1,btn1,btn2);
//        vbx1.setLayoutY(vbx1.getLayoutY() - 20);
//        VBox vbx2 = new VBox(1,btn3,btn4);
//        vbx2.setLayoutY(vbx2.getLayoutY() - 20);
//        VBox vbx3 = new VBox(1,btn5,btn6);
//        vbx3.setLayoutY(vbx3.getLayoutY() - 20);
//        //Горизонтальные боксы в которых расположены текстовые поля и вертикальные боксы с кнопками
//        HBox hbx1 = new HBox();
//        hbx1.getChildren().addAll(cm,cmL,vbx1,inches,inchesL);
//        hbx1.setSpacing(10);
//        hbx1.setLayoutY(10);
//        hbx1.setPadding(new Insets(1));
//        hbx1.setMargin(cm, new Insets(20, 20, 20, 20)); 
//        hbx1.setMargin(inches, new Insets(20, 20, 20, 20));
//        
//        HBox hbx2 = new HBox();
//
//        hbx2.getChildren().addAll(km,kmL,vbx2,miles,milesL);
//        hbx2.setSpacing(10);
//        hbx2.setLayoutY(60);
//        hbx2.setPadding(new Insets(1));
//        hbx2.setMargin(km, new Insets(20, 20, 20, 20)); 
//        hbx2.setMargin(miles, new Insets(20, 20, 20, 20));
//        
//        HBox hbx3 = new HBox();
//        hbx3.getChildren().addAll(kg,kgL,vbx3,Lb,LbL);
//        hbx3.setSpacing(10);
//        hbx3.setLayoutY(110);
//        hbx3.setPadding(new Insets(1));
//        hbx3.setMargin(kg, new Insets(20, 20, 20, 20)); 
//        hbx3.setMargin(Lb, new Insets(20, 20, 20, 20));
//        //Добавление всех эелементов в группу
//        root.getChildren().addAll(hbx1,hbx2,hbx3);
//        stage.setScene(scene);
//        stage.show();
//    }
//    public static void main(String[] args){
//        launch(args);
//    }
//}
