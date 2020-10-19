/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Another
 */
public class VBoxExample extends Application {
    @Override
    public void start(Stage stage){
        TextField textField = new TextField();
        Button playButton = new Button("Play");
        Button stopButton = new Button("Stop");
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setMargin(textField, new Insets(20, 20, 20, 20));
        vbox.setMargin(playButton, new Insets(20, 20, 20, 20));
        vbox.setMargin(stopButton, new Insets(20, 20, 20, 20));
        ObservableList list = vbox.getChildren();
        list.addAll(textField, playButton, stopButton);
        Scene scene = new Scene(vbox);
        stage.setTitle("VBox Example");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
