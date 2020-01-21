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

public class Controller9A implements Initializable {

    @FXML
    private TableView<StudentsModel> tbData;
    @FXML
    public TableColumn<StudentsModel, Integer> studentId;

    @FXML
    public TableColumn<StudentsModel, String> firstName;

    @FXML
    public TableColumn<StudentsModel, String> lastName;

    public Controller9A()
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
            new StudentsModel(1,"Саида   ", "Абдрахманова      "),
            new StudentsModel(2,"Ділназ    ", "Амангелді       "),
            new StudentsModel(3,"Ернур    ", "Асаинов      "),
            new StudentsModel(4,"Асылхан   ", "Ахмадиев     "),
            new StudentsModel(5,"Дания   ", "Байзоллаева     "),
            new StudentsModel(6,"Нариман   ", "Бахыт     "),
            new StudentsModel(7,"Фариза   ", "Бекмұхамбет     "),
            new StudentsModel(8,"Жалғас    ", "Бейсенбай   "),
            new StudentsModel(9,"Тамерлан   ", "Валихан    "),
            new StudentsModel(10,"Алишер   ", "Даулетбай     "),
            new StudentsModel(11,"Айдар  ", "Елтай     "),
            new StudentsModel(12,"Камила   ", "Жакупова     "),
            new StudentsModel(13,"Аружан  ", "Жаншукова    "),
            new StudentsModel(14,"Динара  ", "Жаманбаева      "),
            new StudentsModel(15,"Ақдәулет ", "Каббар     "),
            new StudentsModel(16,"Мәлике    ", "Қайдар     "),
            new StudentsModel(17,"Мансур  ", "Каримов    "),
            new StudentsModel(18,"Еркін   ", "Мукарам     "),
            new StudentsModel(19,"Малика    ", "Мусалимова     "),
            new StudentsModel(20,"Нұрсая   ", "Олжатай      "),
            new StudentsModel(21,"Рахат  ", "Сеилханов "),
            new StudentsModel(22,"Адия    ", "Татиева  "),
            new StudentsModel(23,"Аружан   ", "Темірболат"),
            new StudentsModel(24,"Мархабат   ", "Тоқсан"),
            new StudentsModel(25,"Алихан   ", "Шарипов")
    );


}
