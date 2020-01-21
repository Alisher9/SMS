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

public class Controller5A implements Initializable {

    @FXML
    private TableView<StudentsModel> tbData;
    @FXML
    public TableColumn<StudentsModel, Integer> studentId;

    @FXML
    public TableColumn<StudentsModel, String> firstName;

    @FXML
    public TableColumn<StudentsModel, String> lastName;

    public Controller5A()
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
            new StudentsModel(1,"Ернар", "Абылғазы"),
            new StudentsModel(2,"Әлімжан ", "Айтжан "),
            new StudentsModel(3,"Мерей ", "Айтмагамбетова "),
            new StudentsModel(4,"Әйгерім ", "Айтқұл "),
            new StudentsModel(5,"Зейнель ", "Асемсеитова "),
            new StudentsModel(6,"Дана ", "Асылбекова "),
            new StudentsModel(7,"Даяна ", "Ахмет "),
            new StudentsModel(8,"Алижан ", "Балтабаев "),
            new StudentsModel(9,"Мерей ", "Боранбай "),
            new StudentsModel(10,"Нұрай ", "Жалбай "),
            new StudentsModel(11,"Милана ", "Кубекова "),
            new StudentsModel(12,"Мөлдір ", "Қаиргелді "),
            new StudentsModel(13,"Диас", "Манап"),
            new StudentsModel(14,"Айтуған ", "Маулет "),
            new StudentsModel(15,"Жасулан ", "Рисалиев "),
            new StudentsModel(16,"Нурасыл ", "Сартаев "),
            new StudentsModel(17,"Әлім ", "Сейтботал "),
            new StudentsModel(18,"Сұлейман ", "Серікпай "),
            new StudentsModel(19,"Нұрлыхан ", "Слямбек "),
            new StudentsModel(20,"Дильда ", "Темирбай "),
            new StudentsModel(21,"Айтуар  ", "Тотанов  "),
            new StudentsModel(22,"Аружан  ", "Шаймардан  "),
            new StudentsModel(23,"Диас ", "Шакрат "),
            new StudentsModel(24,"Дина  ", "Шәріп  ")
    );


}
