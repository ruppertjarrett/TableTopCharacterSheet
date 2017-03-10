package gui;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import models.CharacterSheet;

public class InitController implements Initializable {

    public static CharacterSheet theSheet = new CharacterSheet();

    @FXML
    private Button cont;

    @FXML
    private TextField userDir;

    public InitController() {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        userDir.setOnKeyReleased(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent k) {
                if (k.getCode() == KeyCode.ENTER) {
                    if (goodToGo()) {
                        continoo();
                    } else {
                        Button closePopup = new Button("OK");
                        Label errorMsg = new Label("There was an issue with your given directory.");
                        closePopup.setMinHeight(25);
                        closePopup.setMinWidth(50);
                        errorMsg.setMinHeight(50);
                        errorMsg.setMinWidth(300);
                        errorMsg.setAlignment(Pos.CENTER);
                        VBox things = new VBox(errorMsg, closePopup);
                        things.setSpacing(10);
                        things.setAlignment(Pos.CENTER);
                        things.setPadding(new Insets(0, 20, 20, 20));
                        Scene root = new Scene(things);
                        Stage issue = new Stage();
                        closePopup.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent e) {
                                issue.close();
                            }
                        }
                        );
                        issue.setScene(root);
                        issue.initModality(Modality.WINDOW_MODAL);
                        issue.show();
                    }
                }
            }
        });
        cont.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (goodToGo()) {
                    continoo();
                } else {
                    Button closePopup = new Button("OK");
                    Label errorMsg = new Label("There was an issue with your given directory.");
                    closePopup.setMinHeight(25);
                    closePopup.setMinWidth(50);
                    errorMsg.setMinHeight(50);
                    errorMsg.setMinWidth(300);
                    errorMsg.setAlignment(Pos.CENTER);
                    VBox things = new VBox(errorMsg, closePopup);
                    things.setSpacing(10);
                    things.setAlignment(Pos.CENTER);
                    things.setPadding(new Insets(0, 20, 20, 20));
                    Scene root = new Scene(things);
                    Stage issue = new Stage();
                    closePopup.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                            issue.close();
                        }
                    }
                    );
                    issue.setScene(root);
                    issue.initModality(Modality.WINDOW_MODAL);
                    issue.show();
                }
            }
        });
    }

    private boolean goodToGo() {
        String thing = userDir.getText();
        System.out.println("User put in: " + thing);
        File userTry = new File(thing);
        return userTry.exists();
    }

    private void continoo() {
        BorderPane root = null;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("gui/GUI_Layout.fxml"));
        } catch (IOException e) {
            System.out.println("File GUI_Layout.fxml not found in gui package.");
            e.printStackTrace();
            return;
        }
        ((Stage) cont.getScene().getWindow()).close();
        Scene scene = new Scene(root, 930, 620);
        Stage stage = new Stage();
        stage.setResizable(true);
        stage.getIcons().add(new Image(getClass().getResourceAsStream("boot.png")));
        stage.setTitle("PathFinder Character Sheet Manager");
        stage.setScene(scene);
        stage.show();
    }
}
