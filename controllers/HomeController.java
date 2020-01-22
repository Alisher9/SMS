package home.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    @FXML
    private Button btnSchool;

    @FXML
    private Button btnStudents;

    @FXML
    private Button btnTimetable;

    @FXML
    private Button btnBell;

    @FXML
    private Button btnSchedule;

    @FXML
    private Button btnAwards;

    //my bad - the freaking mouse event
    @FXML
    private void handleButtonClicks(javafx.event.ActionEvent mouseEvent) {
        if (mouseEvent.getSource() == btnSchool) {
            loadStage("/home/fxml/SchoolInfo.fxml");
        } else if (mouseEvent.getSource() == btnStudents) {
            loadStage("/home/fxml/ClassesStudents.fxml");
        } else if (mouseEvent.getSource() == btnTimetable) {
            loadStage("/home/fxml/Timetable.fxml");
        } else if (mouseEvent.getSource() == btnBell) {
            loadStage("/home/fxml/Bell.fxml");
        } else if (mouseEvent.getSource() == btnSchedule) {
            loadStage("/home/fxml/ClassesBell.fxml");
        } else if (mouseEvent.getSource() == btnAwards) {
            loadStage("/home/fxml/Awards.fxml");

        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    private void loadStage(String fxml) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxml));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.getIcons().add(new Image("/home/icons/icon.png"));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
