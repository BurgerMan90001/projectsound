package com.example.projectsound;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ArtistPage artistPage = new ArtistPage();
        Song song1 = new Song("Test","Artist",3.76,1976);
        artistPage.addSong(song1);
    //    SceneController sceneController = new SceneController();

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainMenu.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        WriterAndReader writerAndReader = new WriterAndReader();
        writerAndReader.writer();

    }

    public static void main(String[] args) {
        launch();
    }
}