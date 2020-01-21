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

public class Controller8Б implements Initializable {

    @FXML
    private TableView<StudentsModel> tbData;
    @FXML
    public TableColumn<StudentsModel, Integer> studentId;

    @FXML
    public TableColumn<StudentsModel, String> firstName;

    @FXML
    public TableColumn<StudentsModel, String> lastName;

    public Controller8Б()
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
            new StudentsModel(1,"Арайлым   ", "Альмагамбетова     "),
            new StudentsModel(2,"Дамир   ", "Асылбеков      "),
            new StudentsModel(3,"Інжу   ", "Ауелбек     "),
            new StudentsModel(4,"Шафих  ", "Әбелді    "),
            new StudentsModel(5,"Аяжан  ", "Даирбек    "),
            new StudentsModel(6,"Аяулым  ", "Денден    "),
            new StudentsModel(7,"Дарын  ", "Ермек    "),
            new StudentsModel(8,"Арнур   ", "Жагипаров  "),
            new StudentsModel(9,"Анель  ", "Жилжанова   "),
            new StudentsModel(10,"Даниял  ", "Қанатұлы    "),
            new StudentsModel(11,"Адалбек ", "Марат    "),
            new StudentsModel(12,"Камила  ", "Маратова    "),
            new StudentsModel(13,"Ермұрат ", "Макишев   "),
            new StudentsModel(14,"Амина  ", "Мукашбаева     "),
            new StudentsModel(15,"Амирхан ", "Мухаметов    "),
            new StudentsModel(16,"Алтынай   ", "Мұхаметқан    "),
            new StudentsModel(17,"Диана ", "Нурахмет   "),
            new StudentsModel(18,"Айдина  ", "Рамазанова    "),
            new StudentsModel(19,"Нұршапағат   ", "Саулет    "),
            new StudentsModel(20,"Бексұлтан  ", "Серік     "),
            new StudentsModel(21,"Сатжол ", "Тилеуберди   "),
            new StudentsModel(22,"Арлан   ", "Толешов    "),
            new StudentsModel(23,"Асылхан  ", "Төкен    "),
            new StudentsModel(24,"Гүлжан  ", "Тулеу   "),
            new StudentsModel(25,"Камила  ", "Туркубаева     "),
            new StudentsModel(26,"Ақжарқын  ", "Ходон     "),
            new StudentsModel(27,"Расул   ", "Шарен ")
    );


}
