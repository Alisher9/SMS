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

public class Controller5Ә implements Initializable {

    @FXML
    private TableView<StudentsModel> tbData;
    @FXML
    public TableColumn<StudentsModel, Integer> studentId;

    @FXML
    public TableColumn<StudentsModel, String> firstName;

    @FXML
    public TableColumn<StudentsModel, String> lastName;

    public Controller5Ә()
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
            new StudentsModel(1,"Амина ", "Аукеева "),
            new StudentsModel(2,"Амирали  ", "Алькенов  "),
            new StudentsModel(3,"Мадина  ", "Аубакирова  "),
            new StudentsModel(4,"Камила  ", "Батталова  "),
            new StudentsModel(5,"Сериктес  ", "Бельгибаев  "),
            new StudentsModel(6,"Жаһангір  ", "Балтабай  "),
            new StudentsModel(7,"Нурсултан  ", "Дильмагамбетов  "),
            new StudentsModel(8,"Алижан ", "Жайбаев  "),
            new StudentsModel(9,"Ділназ  ", "Серік  "),
            new StudentsModel(10,"Бағүстар  ", "Сапш  "),
            new StudentsModel(11,"Сағындық  ", "Тоқаш  "),
            new StudentsModel(12,"Санжар  ", "Тлеген  "),
            new StudentsModel(13,"Айсана ", "Еренгаипова "),
            new StudentsModel(14,"Жанерке  ", "Егинбаева  "),
            new StudentsModel(15,"Нурия ", "Дюсенбай  "),
            new StudentsModel(16,"Махаббат  ", "Жанаталап  "),
            new StudentsModel(17,"Диана  ", "Файзолла  "),
            new StudentsModel(18,"Иманғали ", "Хатариұлы  "),
            new StudentsModel(19,"Амина ", "Хамельбайқызы "),
            new StudentsModel(20,"Алихан  ", "Рахимов  "),
            new StudentsModel(21,"Нұрдәулет   ", "Нұрлан   "),
            new StudentsModel(22,"Әлинур   ", "Марден   "),
            new StudentsModel(23,"Салим  ", "Молдашев  "),
            new StudentsModel(24,"Әділжан   ", "Қосман   ")
    );


}
