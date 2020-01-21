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

public class Controller11A implements Initializable {

    @FXML
    private TableView<StudentsModel> tbData;
    @FXML
    public TableColumn<StudentsModel, Integer> studentId;

    @FXML
    public TableColumn<StudentsModel, String> firstName;

    @FXML
    public TableColumn<StudentsModel, String> lastName;

    public Controller11A()
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
            new StudentsModel(1,"Эрназ    ", "Абдираимов "),
            new StudentsModel(2,"Жұпаргүл     ", "Айнұр  "),
            new StudentsModel(3,"Әли       ", "Айтым "),
            new StudentsModel(4,"Диляра     ", "Алпыспай "),
            new StudentsModel(5,"Күлімжан      ", "Асқар "),
            new StudentsModel(6,"Абулкаир     ", "Багдатов  "),
            new StudentsModel(7,"Елжан     ", "Бекенов  "),
            new StudentsModel(8,"Гүлзат      ", "Бекмұхамбет "),
            new StudentsModel(9,"Рифат     ", "Габдулмаликов "),
            new StudentsModel(10,"Алдияр     ", "Ергаипов  "),
            new StudentsModel(11,"Ұлжан    ", "Ермағамбет  "),
            new StudentsModel(12,"Ақтоты    ", "Жомарт  "),
            new StudentsModel(13,"Мадина    ", "Жумаканова  "),
            new StudentsModel(14,"Аруана    ", "Кабиденова   "),
            new StudentsModel(15,"Сая  ", "Құлатай    "),
            new StudentsModel(16,"Сабина  ", "Муканова   "),
            new StudentsModel(17,"Адия  ", "Мұхаметқан  "),
            new StudentsModel(18,"Бибісара  ", "Өндіріс  "),
            new StudentsModel(19,"Нуржан  ", "Нурманов "),
            new StudentsModel(20,"Амина   ", "Омарова    "),
            new StudentsModel(21,"Саяжан   ", "Оналбаева   "),
            new StudentsModel(22,"Назерке   ", "Рашитова   "),
            new StudentsModel(23,"Жібек  ", "Сағит  "),
            new StudentsModel(24,"Ерасыл  ", "Тасбулат    "),
            new StudentsModel(25,"Абай    ", "Тлектес    "),
            new StudentsModel(26,"Нариман   ", "Тулютай   "),
            new StudentsModel(27,"Авезхан   ", "Урдабеков     ")

    );


}
