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

public class Controller5В implements Initializable {

    @FXML
    private TableView<StudentsModel> tbData;
    @FXML
    public TableColumn<StudentsModel, Integer> studentId;

    @FXML
    public TableColumn<StudentsModel, String> firstName;

    @FXML
    public TableColumn<StudentsModel, String> lastName;

    public Controller5В()
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
            new StudentsModel(1,"Дайана  ", "Абенова   "),
            new StudentsModel(2,"Ақбота    ", "Аманжол    "),
            new StudentsModel(3,"Бижан    ", "Амирхан    "),
            new StudentsModel(4,"Назерке    ", "Арабданова    "),
            new StudentsModel(5,"Ердос    ", "Бектемір    "),
            new StudentsModel(6,"Али    ", "Боранбай    "),
            new StudentsModel(7,"Ансарым    ", "Ерғанат    "),
            new StudentsModel(8,"Ақелік  ", "Ержан    "),
            new StudentsModel(9,"Дарина    ", "Еркибаева    "),
            new StudentsModel(10,"Әнел    ", "Жұмағали    "),
            new StudentsModel(11,"Мұртаза    ", "Закерия     "),
            new StudentsModel(12,"Ақерке    ", "Игілік    "),
            new StudentsModel(13,"Қадырхан   ", "Иманғазы   "),
            new StudentsModel(14,"Бексултан    ", "Иманзаипов     "),
            new StudentsModel(15,"Куаныш   ", "Кунанбаев    "),
            new StudentsModel(16,"Әнуар    ", "Құрманбай    "),
            new StudentsModel(17,"Аяжан    ", "Молдагалымова    "),
            new StudentsModel(18,"Ермурат   ", "Нурмуханов     "),
            new StudentsModel(19,"Ақнұр   ", "Нұртай   "),
            new StudentsModel(20,"Ерасыл   ", "Саттаров    "),
            new StudentsModel(21,"Аделя    ", "Сейлханова     "),
            new StudentsModel(22,"Аида    ", "Слан     "),
            new StudentsModel(23,"Айымжан    ", "Темірхан    "),
            new StudentsModel(24,"Дания    ", "Шабанбаева     ")
    );


}
