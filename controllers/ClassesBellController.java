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


public class ClassesBellController implements Initializable{

    @FXML
    private Button btn5A;

    @FXML
    private Button btn5Ә;

    @FXML
    private Button btn5Б;

    @FXML
    private Button btn5В;

    @FXML
    private Button btn6A;

    @FXML
    private Button btn6Ә;

    @FXML
    private Button btn6Б;

    @FXML
    private Button btn7A;

    @FXML
    private Button btn7Ә;

    @FXML
    private Button btn7Б;

    @FXML
    private Button btn8A;

    @FXML
    private Button btn8Ә;

    @FXML
    private Button btn8Б;

    @FXML
    private Button btn9A;

    @FXML
    private Button btn9Б;

    @FXML
    private Button btn10A;

    @FXML
    private Button btn10Б;

    @FXML
    private Button btn11;


    @FXML
    private void handleButtonClicks(javafx.event.ActionEvent mouseEvent) {
        if (mouseEvent.getSource() == btn5A) {
            loadStage("/home/bells/5A.fxml");
        } else if (mouseEvent.getSource() == btn5Ә) {
            loadStage("/home/bells/5Ә.fxml");
        } else if (mouseEvent.getSource() == btn5Б) {
            loadStage("/home/bells/5Б.fxml");
        } else if (mouseEvent.getSource() == btn5В) {
            loadStage("/home/bells/5В.fxml");
        } else if (mouseEvent.getSource() == btn6A) {
            loadStage("/home/bells/6A.fxml");
        } else if (mouseEvent.getSource() == btn6Ә) {
            loadStage("/home/bells/6Ә.fxml");
        } else if (mouseEvent.getSource() == btn6Б) {
            loadStage("/home/bells/6Б.fxml");
        } else if (mouseEvent.getSource() == btn7A) {
            loadStage("/home/bells/7A.fxml");
        } else if (mouseEvent.getSource() == btn7Ә) {
            loadStage("/home/bells/7Ә.fxml");
        } else if (mouseEvent.getSource() == btn7Б) {
            loadStage("/home/bells/7Б.fxml");
        } else if (mouseEvent.getSource() == btn8A) {
            loadStage("/home/bells/8A.fxml");
        } else if (mouseEvent.getSource() == btn8Ә) {
            loadStage("/home/bells/8Ә.fxml");
        } else if (mouseEvent.getSource() == btn8Б) {
            loadStage("/home/bells/8Б.fxml");
        } else if (mouseEvent.getSource() == btn9A) {
            loadStage("/home/bells/9A.fxml");
        } else if (mouseEvent.getSource() == btn9Б) {
            loadStage("/home/bells/9Б.fxml");
        } else if (mouseEvent.getSource() == btn10A) {
            loadStage("/home/bells/10A.fxml");
        } else if (mouseEvent.getSource() == btn10Б) {
            loadStage("/home/bells/10Б.fxml");
        } else if (mouseEvent.getSource() == btn11) {
            loadStage("/home/bells/11.fxml");
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
