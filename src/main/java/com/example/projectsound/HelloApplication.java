package com.example.projectsound;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;


public class HelloApplication extends Application {
    JsonSaveFile jsonSaveFile = new JsonSaveFile();

    @Override
    public void start(Stage stage) throws IOException {
        jsonSaveFile.write();

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainMenu.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    @Override
    public void stop() {


    }

    public static void main(String[] args) {
        launch();
    }
}