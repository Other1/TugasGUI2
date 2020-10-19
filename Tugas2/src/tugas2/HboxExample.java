/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Another
 */
public class HboxExample extends Application{
    @Override
    public void start(Stage stage){
        TextField textField = new TextField();
        Button playButton = new Button("Play");
        Button stopButton = new Button("Stop");
        HBox hbox = new HBox();
        hbox.setSpacing(-20);
        HBox.setMargin(textField, new Insets(20, 20, 20, 20));
        HBox.setMargin(playButton, new Insets(20, 20, 20, 20));
        HBox.setMargin(stopButton, new Insets(20, 20, 20, 20));
        ObservableList list = hbox.getChildren();
        list.addAll(textField, playButton, stopButton);
        Scene scene = new Scene (hbox);
        stage.setTitle("Hbox Example");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]){
       launch(args);
    }
}
