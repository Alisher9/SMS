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

public class Controller9Б implements Initializable {

    @FXML
    private TableView<StudentsModel> tbData;
    @FXML
    public TableColumn<StudentsModel, Integer> studentId;

    @FXML
    public TableColumn<StudentsModel, String> firstName;

    @FXML
    public TableColumn<StudentsModel, String> lastName;

    public Controller9Б()
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
            new StudentsModel(1,"Анель   ", "Антмухаметова       "),
            new StudentsModel(2,"Нұрбота    ", "Ахылбекқызы        "),
            new StudentsModel(3,"Томирис    ", "Боранбаева       "),
            new StudentsModel(4,"Рамазан   ", "Дәуренбекұлы      "),
            new StudentsModel(5,"Айым    ", "Досмағамбетова      "),
            new StudentsModel(6,"Арай   ", "Жанат      "),
            new StudentsModel(7,"Арайлым   ", "Жанбырбай      "),
            new StudentsModel(8,"Маржан    ", "Жилқайдар    "),
            new StudentsModel(9,"Адия   ", "Жумабекова     "),
            new StudentsModel(10,"Мағзум   ", "Имантай      "),
            new StudentsModel(11,"Даулет  ", "Калиев      "),
            new StudentsModel(12,"Амина   ", "Кудиярова      "),
            new StudentsModel(13,"Айдын  ", "Қабыш     "),
            new StudentsModel(14,"Дәнекер  ", "Қалиасқарұлы       "),
            new StudentsModel(15,"Асылтан ", "Люлятов      "),
            new StudentsModel(16,"Дильзат    ", "Нурмагамбетова      "),
            new StudentsModel(17,"Дильназ  ", "Рахимбекова     "),
            new StudentsModel(18,"Еділ   ", "Сағындық      "),
            new StudentsModel(19,"Данеля    ", "Саргазакова      "),
            new StudentsModel(20,"Адилет   ", "Сейткулов       "),
            new StudentsModel(21,"Әйгерім  ", "Тәкіш  "),
            new StudentsModel(22,"Алия    ", "Турганова   "),
            new StudentsModel(23,"Айғаным   ", "Хафез ")
    );


}
