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

public class Controller8Ә implements Initializable {

    @FXML
    private TableView<StudentsModel> tbData;
    @FXML
    public TableColumn<StudentsModel, Integer> studentId;

    @FXML
    public TableColumn<StudentsModel, String> firstName;

    @FXML
    public TableColumn<StudentsModel, String> lastName;

    public Controller8Ә()
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
            new StudentsModel(1,"Дильназ  ", "Ахмедиева    "),
            new StudentsModel(2,"Асем  ", "Балтагулова     "),
            new StudentsModel(3,"Салима  ", "Бейсембина    "),
            new StudentsModel(4,"Тамирлан ", "Дүйсембі   "),
            new StudentsModel(5,"Алишер ", "Жандаулет   "),
            new StudentsModel(6,"Мухаммедәли ", "Жиксимбай   "),
            new StudentsModel(7,"Таир ", "Исамбаев   "),
            new StudentsModel(8,"Ирада  ", "Ильясова "),
            new StudentsModel(9,"Риза ", "Қабдолла  "),
            new StudentsModel(10,"Амир  ", "Канатов   "),
            new StudentsModel(11,"Ислам ", "Қайролла   "),
            new StudentsModel(12,"Сабина ", "Қайыртас   "),
            new StudentsModel(13,"Аружан", "Маусымбаева  "),
            new StudentsModel(14,"Данель ", "Мингазутдинова    "),
            new StudentsModel(15,"Саят", "Мушкин   "),
            new StudentsModel(16,"Диляра  ", "Мырзагалиева   "),
            new StudentsModel(17,"Айшагүл", "Руслан  "),
            new StudentsModel(18,"Алдияр ", "Рымбек   "),
            new StudentsModel(19,"Фариза  ", "Сағдат   "),
            new StudentsModel(20,"Алтынай ", "Сатбек    "),
            new StudentsModel(21,"Азиза ", "Серғазы  "),
            new StudentsModel(22,"Бибинур  ", "Сламбол   "),
            new StudentsModel(23,"Ақмарал ", "Сұраған   "),
            new StudentsModel(24,"Айсұлу ", "Тамаргалиева   "),
            new StudentsModel(25,"Жасмин ", "Тұрсынхан    "),
            new StudentsModel(26,"Айсұлу  ", "Хонгонбай    ")
    );


}
