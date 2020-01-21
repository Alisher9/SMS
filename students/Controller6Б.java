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

public class Controller6Б implements Initializable {

    @FXML
    private TableView<StudentsModel> tbData;
    @FXML
    public TableColumn<StudentsModel, Integer> studentId;

    @FXML
    public TableColumn<StudentsModel, String> firstName;

    @FXML
    public TableColumn<StudentsModel, String> lastName;

    public Controller6Б()
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
            new StudentsModel(1,"Даяна ", "Алигожина  "),
            new StudentsModel(2,"Дильназ  ", "Алиева  "),
            new StudentsModel(3,"Қарақат  ", "Ахмеди  "),
            new StudentsModel(4,"Әділет   ", "Әбікен "),
            new StudentsModel(5,"Диана ", "Джумашева "),
            new StudentsModel(6,"Нұрмұхамед ", "Еркінбай "),
            new StudentsModel(7,"Хамза ", "Егінбай "),
            new StudentsModel(8,"Фатима ", "Ерғалиева "),
            new StudentsModel(9,"Мөлдір ", "Зекен "),
            new StudentsModel(10,"Азалия ", "Какишева "),
            new StudentsModel(11,"Сабира ", "Каирбаева "),
            new StudentsModel(12,"Нурислам ", "Касен  "),
            new StudentsModel(13,"Динара ", "Каиржанова "),
            new StudentsModel(14,"Аяулым ", "Қайса  "),
            new StudentsModel(15,"Алан ", "Қанапия "),
            new StudentsModel(16,"Малика  ", "Касен "),
            new StudentsModel(17,"Нұрғиса ", "Махсутхан "),
            new StudentsModel(18,"Нұрасыл ", "Нұрғали "),
            new StudentsModel(19,"Әбілмансұр  ", "Пішенбай "),
            new StudentsModel(20,"Кенжеғали ", "Сембай  "),
            new StudentsModel(21,"Гүлназ ", "Сағит "),
            new StudentsModel(22,"Тамирлан ", "Уатаев "),
            new StudentsModel(23,"Эльмира", "Рахжанова "),
            new StudentsModel(24,"Нурай ", "Шакиртова "),
            new StudentsModel(25,"Нұрдаулет", "Сарсембайұлы ")
    );


}
