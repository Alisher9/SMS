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

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BellController implements Initializable {

    @FXML
    private javafx.scene.control.Button btnClass;

    @FXML
    private Button btnClass1;

    @FXML
    private void handleButtonClicks(javafx.event.ActionEvent mouseEvent) {
        if (mouseEvent.getSource() == btnClass) {
            loadStage("/home/fxml/Students.fxml");
        } else if (mouseEvent.getSource() == btnClass1) {
            loadStage("/home/fxml/Timetable.fxml");
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
