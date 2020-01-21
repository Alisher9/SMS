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

public class Controller7Ә implements Initializable {

    @FXML
    private TableView<StudentsModel> tbData;
    @FXML
    public TableColumn<StudentsModel, Integer> studentId;

    @FXML
    public TableColumn<StudentsModel, String> firstName;

    @FXML
    public TableColumn<StudentsModel, String> lastName;

    public Controller7Ә()
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
            new StudentsModel(1,"Дамир   ", "Айтбаев       "),
            new StudentsModel(2,"Назым    ", "Амангельдинова     "),
            new StudentsModel(3,"Томирис   ", "Азамат     "),
            new StudentsModel(4,"Амир     ", "Баймуханов    "),
            new StudentsModel(5,"Джамиль   ", "Бегимов    "),
            new StudentsModel(6,"Расул   ", "Даирбек  "),
            new StudentsModel(7,"Асхат   ", "Дюсембаев   "),
            new StudentsModel(8,"Данара   ", "Жандилова    "),
            new StudentsModel(9,"Карина   ", "Жанкаринова    "),
            new StudentsModel(10,"Айша   ", "Жиксимбай     "),
            new StudentsModel(11,"Айым   ", "Жұмабай    "),
            new StudentsModel(12,"Айдана   ", "Кизатова     "),
            new StudentsModel(13,"Фариза   ", "Колыбаева    "),
            new StudentsModel(14,"Ақерке  ", "Кали    "),
            new StudentsModel(15,"Гүлжан   ", "Канатова    "),
            new StudentsModel(16,"Аслан    ", "Манарбек    "),
            new StudentsModel(17,"Санжар   ", "Мухамеджан   "),
            new StudentsModel(18,"Алибек   ", "Нұрпеисов    "),
            new StudentsModel(19,"Бейбарыс   ", "Рафаилов  "),
            new StudentsModel(20,"Асылжан  ", "Сағат   "),
            new StudentsModel(21,"Нурали   ", "Смагулов     "),
            new StudentsModel(22,"Айша    ", "Теміртас       "),
            new StudentsModel(23,"Махаббат  ", "Уахит    "),
            new StudentsModel(24,"Дарья  ", "Шарупич   ")
    );


}
