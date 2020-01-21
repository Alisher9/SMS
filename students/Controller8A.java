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

public class Controller8A implements Initializable {

    @FXML
    private TableView<StudentsModel> tbData;
    @FXML
    public TableColumn<StudentsModel, Integer> studentId;

    @FXML
    public TableColumn<StudentsModel, String> firstName;

    @FXML
    public TableColumn<StudentsModel, String> lastName;

    public Controller8A()
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
            new StudentsModel(1,"Дариға ", "Айтен   "),
            new StudentsModel(2,"Мариям  ", "Айткулова    "),
            new StudentsModel(3,"Айқын ", "Алыбай   "),
            new StudentsModel(4,"Ділнәз ", "Аутанова  "),
            new StudentsModel(5,"Ансар", "Баймуханов  "),
            new StudentsModel(6,"Райса", "Бекнияз  "),
            new StudentsModel(7,"Алдияр", "Дауенов  "),
            new StudentsModel(8,"Самира ", "Жанжаксинова "),
            new StudentsModel(9,"Алибек", "Искандер "),
            new StudentsModel(10,"Жанель ", "Карипбаева  "),
            new StudentsModel(11,"Әли", "Конгоркольджанов  "),
            new StudentsModel(12,"Әмірбек", "Кәлім   "),
            new StudentsModel(13,"Ерхан", "Қантай  "),
            new StudentsModel(14,"Дәрия", "Қадырова   "),
            new StudentsModel(15,"Аружан", "Қанатқызы  "),
            new StudentsModel(16,"Дильназ ", "Манапова  "),
            new StudentsModel(17,"Айым", "Окпина  "),
            new StudentsModel(18,"Балжан", "Сағындық  "),
            new StudentsModel(19,"Арслан ", "Смагулов  "),
            new StudentsModel(20,"Жасқанат", "Сүйенішұлы   "),
            new StudentsModel(21,"Алина", "Татенова  "),
            new StudentsModel(22,"Үміт ", "Темірболатова  "),
            new StudentsModel(23,"Нурмухамед", "Туленов  "),
            new StudentsModel(24,"Жанель ", "Тлеуғабыл  "),
            new StudentsModel(25,"Ерасыл", "Хуанғанұлы   "),
            new StudentsModel(26,"Аружан ", "Шамбасова   ")
    );


}
