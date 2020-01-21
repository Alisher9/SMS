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

public class Controller10Б implements Initializable {

    @FXML
    private TableView<StudentsModel> tbData;
    @FXML
    public TableColumn<StudentsModel, Integer> studentId;

    @FXML
    public TableColumn<StudentsModel, String> firstName;

    @FXML
    public TableColumn<StudentsModel, String> lastName;

    public Controller10Б()
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
            new StudentsModel(1,"Аружан    ", "Альмухамбетова"),
            new StudentsModel(2,"Зарина     ", "Аулабаева "),
            new StudentsModel(3,"Ділназ      ", "Әсембай"),
            new StudentsModel(4,"Карина    ", "Бағдат"),
            new StudentsModel(5,"Молдир     ", "Бейбитова"),
            new StudentsModel(6,"Меруерт    ", "Бушумбаева "),
            new StudentsModel(7,"Назерке    ", "Ерғали "),
            new StudentsModel(8,"Дариға     ", "Жақсыжан"),
            new StudentsModel(9,"Зинира    ", "Жұмағали"),
            new StudentsModel(10,"Абылай    ", "Ибраймов "),
            new StudentsModel(11,"Даяна   ", "Касенова "),
            new StudentsModel(12,"Марьям    ", "Карманова "),
            new StudentsModel(13,"Айгүл   ", "Құрмет "),
            new StudentsModel(14,"Айнагүл   ", "Құрмет  "),
            new StudentsModel(15,"Ибрагим ", "Марат   "),
            new StudentsModel(16,"Кәмилә ", "Мүлік  "),
            new StudentsModel(17,"Риза ", "Оспанова "),
            new StudentsModel(18,"Айшат ", "Смагулова "),
            new StudentsModel(19,"Бибігүл ", "Табулдинова"),
            new StudentsModel(20,"Гүлназ  ", "Темірбай   "),
            new StudentsModel(21,"Зейнел  ", "Темірболат  "),
            new StudentsModel(22,"Ерқанат  ", "Тлеубек  "),
            new StudentsModel(23,"Мерейлім ", "Уәлихан "),
            new StudentsModel(24,"Жибек ", "Шамшидин   ")

    );


}
