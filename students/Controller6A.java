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

public class Controller6A implements Initializable {

    @FXML
    private TableView<StudentsModel> tbData;
    @FXML
    public TableColumn<StudentsModel, Integer> studentId;

    @FXML
    public TableColumn<StudentsModel, String> firstName;

    @FXML
    public TableColumn<StudentsModel, String> lastName;

    public Controller6A()
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
            new StudentsModel(1,"Жансая  ", "Абжанова    "),
            new StudentsModel(2,"Муслим    ", "Альфиров     "),
            new StudentsModel(3,"Үміт    ", "Амеркен     "),
            new StudentsModel(4,"Нүрали    ", "Алигожин     "),
            new StudentsModel(5,"Ильяс    ", "Болатов     "),
            new StudentsModel(6,"Айнар    ", "Боранбай     "),
            new StudentsModel(7,"Томирис    ", "Дукембаева     "),
            new StudentsModel(8,"Нұрилла  ", "Ермекқызы      "),
            new StudentsModel(9,"Даниял    ", "Жусупов     "),
            new StudentsModel(10,"Нұрәли     ", "Кобей     "),
            new StudentsModel(11,"Перизат    ", "Қалиасқарқызы      "),
            new StudentsModel(12,"Асанәлі    ", "Қаратай     "),
            new StudentsModel(13,"Айтуар   ", "Қожахмет    "),
            new StudentsModel(14,"Кәмила    ", "Марат       "),
            new StudentsModel(15,"Жанбота   ", "Маратова      "),
            new StudentsModel(16,"Диана    ", "Махамбетова     "),
            new StudentsModel(17,"Шұғыла    ", "Медеу     "),
            new StudentsModel(18,"Адель   ", "Мухамедьярова      "),
            new StudentsModel(19,"Ерсұлтан   ", "Оразалы    "),
            new StudentsModel(20,"Нұрали   ", "Оспан     "),
            new StudentsModel(21,"Дильназ    ", "Раисова      "),
            new StudentsModel(22,"Гульсанат    ", "Рахимбекова      "),
            new StudentsModel(23,"Сабина    ", "Сагындыкова     "),
            new StudentsModel(24,"Мирхат    ", "Саметов       "),
            new StudentsModel(25,"Мирас    ", "Тойганбаев      "),
            new StudentsModel(26,"Аружан    ", "Хабидуллаева      ")
    );


}
