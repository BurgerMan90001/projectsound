package com.example.projectsound;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Objects;


public class HelloApplication extends Application {
    JsonSaveFile jsonSaveFile = new JsonSaveFile();

    @Override
    public void start(Stage stage) throws IOException, ParseException {
        jsonSaveFile.write();
        jsonSaveFile.read();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainMenu.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    @Override
    public void stop() throws IOException, ParseException {
      //  jsonSaveFile.read();



    }

    public static void main(String[] args) {

        launch();
    }
}