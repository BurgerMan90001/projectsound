package com.example.projectsound;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

class WriterAndReader {
    SceneController sceneController = new SceneController();
    void writer() {
        List<String> lines = Arrays.asList(String.valueOf(sceneController.getImageSwitchButtonClicks()), "The second line");
        Path file = Paths.get("save-file.txt");
        try {
            Files.write(file, lines, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}