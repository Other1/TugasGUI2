/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Another
 */
public class MyApp1 extends Application{
    @Override
    public void start(Stage window){
    VBox root = new VBox();
    Scene scene1 = new Scene(root, 400, 400);
    window.setTitle("MyApp1");
    window.setScene(scene1);
    window.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
