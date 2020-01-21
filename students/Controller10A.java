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

public class Controller10A implements Initializable {

    @FXML
    private TableView<StudentsModel> tbData;
    @FXML
    public TableColumn<StudentsModel, Integer> studentId;

    @FXML
    public TableColumn<StudentsModel, String> firstName;

    @FXML
    public TableColumn<StudentsModel, String> lastName;

    public Controller10A()
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
            new StudentsModel(1,"Лиана   ", "Ахмедеева        "),
            new StudentsModel(2,"Айдана    ", "Ахмедеева         "),
            new StudentsModel(3,"Жандос     ", "Әубәкір        "),
            new StudentsModel(4,"Диас   ", "Болат       "),
            new StudentsModel(5,"Диляра    ", "Базарбаева       "),
            new StudentsModel(6,"Дильназ   ", "Дауенова       "),
            new StudentsModel(7,"Алихан   ", "Камзин       "),
            new StudentsModel(8,"Мамыржан    ", "Каримов     "),
            new StudentsModel(9,"Нурлыбек   ", "Кабылдинов      "),
            new StudentsModel(10,"Ерасыл   ", "Қаирбаев       "),
            new StudentsModel(11,"Назерке  ", "Құрманбай       "),
            new StudentsModel(12,"Аружан   ", "Манарбекова       "),
            new StudentsModel(13,"Аружан  ", "Мухамеджан      "),
            new StudentsModel(14,"Мейрамбек  ", "Наурызбай        "),
            new StudentsModel(15,"Камила ", "Орал       "),
            new StudentsModel(16,"Аманжол    ", "Рахметоллаев       "),
            new StudentsModel(17,"Нұртілеу  ", "Сайдхан      "),
            new StudentsModel(18,"Сания   ", "Сансызбай       "),
            new StudentsModel(19,"Ельдина    ", "Уразбаева       "),
            new StudentsModel(20,"Нурсерик   ", "Хуантхан        ")
    );


}
