package assignment.pkg4;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Task3 extends Application{
    private double w = 250,h = 250;
    private double cX = w / 2,cY = h / 2;
    @Override
    public void start(Stage stage){
        stage.setTitle("Move a ball using the buttons");
        Group p = new Group();
        
        Ball ball = new Ball(p,cX,cY,10);
        
        Button btnUp = new Button("Up");
        btnUp.setOnAction(action -> {
            ball.setCenterY(ball.getCenterY() - 10);
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
