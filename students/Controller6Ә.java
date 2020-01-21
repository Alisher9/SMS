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

public class Controller6Ә implements Initializable {

    @FXML
    private TableView<StudentsModel> tbData;
    @FXML
    public TableColumn<StudentsModel, Integer> studentId;

    @FXML
    public TableColumn<StudentsModel, String> firstName;

    @FXML
    public TableColumn<StudentsModel, String> lastName;

    public Controller6Ә()
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
            new StudentsModel(1,"Алтынай", "Айбульдинова "),
            new StudentsModel(2,"Әлғазиз ", "Аманжол "),
            new StudentsModel(3,"Ақжан ", "Ардагелдіқызы "),
            new StudentsModel(4,"Фатима ", "Аскарова"),
            new StudentsModel(5,"Надия", "Берік"),
            new StudentsModel(6,"Мөлдір", "Балгабай"),
            new StudentsModel(7,"Акбота", "Бурабай"),
            new StudentsModel(8,"Айымгүл", "Бушумбаева"),
            new StudentsModel(9,"Асылбек", "Ерсін"),
            new StudentsModel(10,"Алибек", "Ертай"),
            new StudentsModel(11,"Қосман", "Жұмабай"),
            new StudentsModel(12,"Алмаз", "Закиров "),
            new StudentsModel(13,"Диана", "Каратаева"),
            new StudentsModel(14,"Аяулым", "Қуандыкова "),
            new StudentsModel(15,"Қажыкелді", "Қадыр"),
            new StudentsModel(16,"Еңлік ", "Қадыр"),
            new StudentsModel(17,"Әділет", "Қаиртас"),
            new StudentsModel(18,"Ақерке", "Құрманалиева"),
            new StudentsModel(19,"Ахмет", "Мұхаметжан"),
            new StudentsModel(20,"Жоламан", "Нағашыбайұлы "),
            new StudentsModel(21,"Камила", "Назымбек"),
            new StudentsModel(22,"Нуриден", "Охиттан"),
            new StudentsModel(23,"Аружан", "Сұраған"),
            new StudentsModel(24,"Алихан", "Рахимбердинов"),
            new StudentsModel(25,"Жансая", "Табулдинова"),
            new StudentsModel(26,"Гауһар", "Тимурхан")
    );


}
