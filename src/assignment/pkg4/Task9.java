/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg4;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */

public class Task9 extends Application{
    @Override
    public void start(Stage stage){
        stage.setTitle("Programmingisntfun");
        //Текст слегка изменен для большего соответствия действительности
        Text text = new Text("Programmins is almost fun");
        //Здесь хранятся названия шрифтов
        List<String> str = Font.getFamilies();
        //Создаем кнопку список
        ObservableList<String> fonts = FXCollections.observableArrayList(Font.getFamilies());
        ComboBox<String> fontsComboBox = new ComboBox<String>(fonts);
        //Уст значение по умолч
        fontsComboBox.setValue("Arial");
        //Список размеров 1 - 100
        List<String> sizes = new ArrayList<String>();
        //генератор списка
        for(int i = 1;i <= 100;i++){
            sizes.add(Integer.toString(i));
        }
        //Комбо бокс или кнопка список как я называю
        ObservableList<String> sizesCB = FXCollections.observableArrayList(sizes);
        ComboBox<String> sizesComboBox = new ComboBox<String>(sizesCB);
        sizesComboBox.setValue("10");
        //События комбосписков
        sizesComboBox.setOnAction(event -> text.setFont(Font.font(fontsComboBox.getValue(),Double.parseDouble(sizesComboBox.getValue()))));
        fontsComboBox.setOnAction(event -> text.setFont(Font.font(fontsComboBox.getValue(),Double.parseDouble(sizesComboBox.getValue()))));
        //Чек бокс1
        CheckBox bold = new CheckBox("Bold");
        bold.setAllowIndeterminate(true);
        bold.setOnAction(event -> text.setFont(Font.font(fontsComboBox.getValue(),FontWeight.BOLD,Double.parseDouble(sizesComboBox.getValue()))));
        //Чек бокс2
        CheckBox italic = new CheckBox("Italic");
        italic.setAllowIndeterminate(true);
        italic.setOnAction(event -> text.setFont(Font.font(fontsComboBox.getValue(),FontPosture.ITALIC,Double.parseDouble(sizesComboBox.getValue()))));
        //ЧЛейблы имя шрифта и размер шрифта
        Label font_name = new Label("Font Name");
        Label font_size = new Label("Font Size");
        Group p = new Group();
        //Горизонтальные боксы
        HBox hbx1 = new HBox(5,font_name,fontsComboBox,font_size,sizesComboBox);
        HBox hbx2 = new HBox(5,text);
        HBox hbx3 = new HBox(5,bold,italic);
        VBox vbx = new VBox(hbx1,hbx2,hbx3);
        hbx3.setAlignment(Pos.BOTTOM_CENTER);
        p.getChildren().addAll(vbx);
        Scene scene = new Scene(p,600,300);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
