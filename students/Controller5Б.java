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

public class Controller5Б implements Initializable {

    @FXML
    private TableView<StudentsModel> tbData;
    @FXML
    public TableColumn<StudentsModel, Integer> studentId;

    @FXML
    public TableColumn<StudentsModel, String> firstName;

    @FXML
    public TableColumn<StudentsModel, String> lastName;

    public Controller5Б()
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
            new StudentsModel(1,"Бақытжан ", "Ақтас  "),
            new StudentsModel(2,"Ақбота   ", "Алтай   "),
            new StudentsModel(3,"Жәңгір   ", "Алтынбек   "),
            new StudentsModel(4,"Инабат   ", "Байзолова   "),
            new StudentsModel(5,"Марал   ", "Бердибекқызы   "),
            new StudentsModel(6,"Бекзат   ", "Болат   "),
            new StudentsModel(7,"Әділ   ", "Дүйсембі   "),
            new StudentsModel(8,"Алима  ", "Жами   "),
            new StudentsModel(9,"Аружан   ", "Жұмағазы   "),
            new StudentsModel(10,"Нуржан   ", "Исин   "),
            new StudentsModel(11,"Ануар   ", "Камалиденов   "),
            new StudentsModel(12,"Айлин   ", "Қабдулсалам   "),
            new StudentsModel(13,"Халима  ", "Қазбек  "),
            new StudentsModel(14,"Расул   ", "Қашкен   "),
            new StudentsModel(15,"Асель  ", "Оразаева   "),
            new StudentsModel(16,"Фарида   ", "Сатенова   "),
            new StudentsModel(17,"Сара   ", "Темірбек   "),
            new StudentsModel(18,"Алуа  ", "Темірболат   "),
            new StudentsModel(19,"Дария  ", "Тохтар  "),
            new StudentsModel(20,"Ардақ  ", "Турарқызы   "),
            new StudentsModel(21,"Мағжан    ", "Хамархан    "),
            new StudentsModel(22,"Мади    ", "Хамзин    "),
            new StudentsModel(23,"Әдемі   ", "Хамит   "),
            new StudentsModel(24,"Шынасыл   ", "Хуанганұлы    ")
    );


}
