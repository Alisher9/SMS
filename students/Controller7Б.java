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

public class Controller7Б implements Initializable {

    @FXML
    private TableView<StudentsModel> tbData;
    @FXML
    public TableColumn<StudentsModel, Integer> studentId;

    @FXML
    public TableColumn<StudentsModel, String> firstName;

    @FXML
    public TableColumn<StudentsModel, String> lastName;

    public Controller7Б()
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
            new StudentsModel(1,"Аян ", "Амантай  "),
            new StudentsModel(2,"Аружан  ", "Айтпай   "),
            new StudentsModel(3,"Мансур ", "Бакытов  "),
            new StudentsModel(4,"Ұлжан ", "Бәкібай "),
            new StudentsModel(5,"Мақыш", "Борамбай "),
            new StudentsModel(6,"Серіжан", "Болат "),
            new StudentsModel(7,"Гүлнәз", "Ганбатқызы "),
            new StudentsModel(8,"Елнар ", "Ермұханбет"),
            new StudentsModel(9,"Зерде", "Жагсалаг қызы"),
            new StudentsModel(10,"Сабина ", "Жилкыбаева "),
            new StudentsModel(11,"Аружан", "Жұмабай "),
            new StudentsModel(12,"Мерей", "Жұмағұл  "),
            new StudentsModel(13,"Ибрахим", "Қазбек "),
            new StudentsModel(14,"Ясмин", "Құбаш  "),
            new StudentsModel(15,"Жүсіп", "Мейрам "),
            new StudentsModel(16,"Темирлан ", "Мухатов "),
            new StudentsModel(17,"Фарида", "Мусалимова "),
            new StudentsModel(18,"Сұлтан", "Оразалы "),
            new StudentsModel(19,"Қажымұқан ", "Сагындык "),
            new StudentsModel(20,"Кәмилә", "Смат  "),
            new StudentsModel(21,"Жансая", "Хасанова "),
            new StudentsModel(22,"Адиль", "Шакимов "),
            new StudentsModel(23,"Иранғайып", "Шайғапбас "),
            new StudentsModel(24,"Расул ", "Шаяхмет ")
    );


}
