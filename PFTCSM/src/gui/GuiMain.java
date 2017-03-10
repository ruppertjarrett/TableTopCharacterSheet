/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GuiMain extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        GridPane questionnaire = FXMLLoader.load(getClass().getResource("loadRequest.fxml"));
        stage.setScene(new Scene(questionnaire));
        stage.setResizable(false);
        stage.setTitle("PathFinder Character Sheet Manager");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}