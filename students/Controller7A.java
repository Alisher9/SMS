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

public class Controller7A implements Initializable {

    @FXML
    private TableView<StudentsModel> tbData;
    @FXML
    public TableColumn<StudentsModel, Integer> studentId;

    @FXML
    public TableColumn<StudentsModel, String> firstName;

    @FXML
    public TableColumn<StudentsModel, String> lastName;

    public Controller7A()
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
            new StudentsModel(1,"Самрук  ", "Айтмагамбетова    "),
            new StudentsModel(2,"Айша   ", "Амерханова    "),
            new StudentsModel(3,"Шыңғыс  ", "Асығатұлы    "),
            new StudentsModel(4,"Нұрасыл    ", "Бактыбаев  "),
            new StudentsModel(5,"Фатима  ", "Бекет   "),
            new StudentsModel(6,"Әйгерім  ", "Бекмұрат  "),
            new StudentsModel(7,"Рахман  ", "Елемес  "),
            new StudentsModel(8,"Ерасыл  ", "Жанат  "),
            new StudentsModel(9,"Аркен  ", "Жұмабай   "),
            new StudentsModel(10,"Анеля  ", "Исеева   "),
            new StudentsModel(11,"Нұрсәуле  ", "Көбей   "),
            new StudentsModel(12,"Ринат  ", "Қабдуахит    "),
            new StudentsModel(13,"Мөлдір  ", "Қаламбек   "),
            new StudentsModel(14,"Мұхаммедалин  ", "Қаирзат   "),
            new StudentsModel(15,"Дания  ", "Магауина   "),
            new StudentsModel(16,"Нази   ", "Нурмагамбетова   "),
            new StudentsModel(17,"Нұрсұлтан  ", "Оразалы  "),
            new StudentsModel(18,"Ильзара  ", "Отарбаева  "),
            new StudentsModel(19,"Айсұлтан   ", "Сагындык  "),
            new StudentsModel(20,"Аяжан ", "Сергазина   "),
            new StudentsModel(21,"Алмат  ", "Серік   "),
            new StudentsModel(22,"Әли   ", "Смағұл      "),
            new StudentsModel(23,"Нурат ", "Татенов   "),
            new StudentsModel(24,"Айтолқын ", "Хауметхали  ")
    );


}
