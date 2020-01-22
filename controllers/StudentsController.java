package home.controllers;

import home.model.StudentsModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentsController implements Initializable {

    @FXML
    private TableView<StudentsModel> tbData;
    @FXML
    public TableColumn<StudentsModel, Integer> studentId;

    @FXML
    public TableColumn<StudentsModel, String> firstName;

    @FXML
    public TableColumn<StudentsModel, String> lastName;

    public StudentsController()
    {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        studentId.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        tbData.setItems(studentsModels);
    }

    private ObservableList<StudentsModel> studentsModels = FXCollections.observableArrayList(
            new StudentsModel(1,"Shokan", "Kaldybayev"),
            new StudentsModel(2,"Alisher", "Sattarbek"),
            new StudentsModel(3,"Askhat", "Rymbayev"),
            new StudentsModel(4,"Abzal", "Sapabek"),
            new StudentsModel(5,"Shokan", "Kaldybayev"),
            new StudentsModel(6,"Alisher", "Sattarbek"),
            new StudentsModel(7,"Askhat", "Rymbayev"),
            new StudentsModel(8,"Abzal", "Sapabek"),
            new StudentsModel(9,"Shokan", "Kaldybayev"),
            new StudentsModel(10,"Alisher", "Sattarbek"),
            new StudentsModel(11,"Askhat", "Rymbayev"),
            new StudentsModel(12,"Abzal", "Sapabek"),
            new StudentsModel(13,"Shokan", "Kaldybayev"),
            new StudentsModel(14,"Alisher", "Sattarbek"),
            new StudentsModel(15,"Askhat", "Rymbayev"),
            new StudentsModel(16,"Abzal", "Sapabek"),
            new StudentsModel(17,"Shokan", "Kaldybayev"),
            new StudentsModel(18,"Alisher", "Sattarbek"),
            new StudentsModel(19,"Askhat", "Rymbayev"),
            new StudentsModel(20,"Abzal", "Sapabek")
    );


}
