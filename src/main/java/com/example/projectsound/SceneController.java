package com.example.projectsound;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    ImageView myImageView;
    @FXML
    Button myButton;
    @FXML
    Button artistButton;
    @FXML
    Button mainMenuButton;
    Image myImage1 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("gamer1.jpg")));
    Image myImage2 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("BLEH.jpg")));
    // methods are the button clicks !!
    public void displayImage() {

        if (myImageView.getImage() == myImage1) {
            myImageView.setImage(myImage2);
        } else {
            myImageView.setImage(myImage1);
        }


    }

    public void switchToMainMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainMenu.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void switchToArtistPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("artistPage.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public int getButtonClicks() {
        int buttonClicks = 0;
        return buttonClicks;
    }

}
