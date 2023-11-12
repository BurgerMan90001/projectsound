module com.example.projectsound {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;


    opens com.example.projectsound to javafx.fxml;
    exports com.example.projectsound;
}