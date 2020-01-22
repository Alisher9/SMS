package home.controllers;

import home.model.StudentsModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SchoolInfoController implements Initializable {

    @FXML
    private Button btnBack;

    @FXML
    private TableView<StudentsModel> tbData;

    @FXML
    public TableColumn<StudentsModel, Integer> studentId;

    @FXML
    public TableColumn<StudentsModel, String> firstName;

    @FXML
    public TableColumn<StudentsModel, String> lastName;

    @FXML
    private PieChart pieChart;
//
//    @FXML private javafx.scene.control.Button closeButton;
//
//    @FXML
//    private void closeButtonAction(){
//        // get a handle to the stage
//        Stage stage = (Stage) closeButton.getScene().getWindow();
//        // do what you have to do
//        stage.close();
//    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        loadChart();
        loadStudents();
    }

    private void loadChart()
    {

        PieChart.Data slice1 = new PieChart.Data("Оқушы", 435);
        PieChart.Data slice2 = new PieChart.Data("Қызметкер"  , 36);
        PieChart.Data slice3 = new PieChart.Data("Мұғалім" , 65);

        pieChart.getData().add(slice1);
        pieChart.getData().add(slice2);
        pieChart.getData().add(slice3);

    }


    private ObservableList<StudentsModel> studentsModels = FXCollections.observableArrayList(
            new StudentsModel(1,"КЕНЖЕБАЕВА ДӘМЕТКЕН КАМАРИДЕНОВНА", "Информатика"),
            new StudentsModel(2,"КАМАЛОВА НҰРГҮЛ ЕРҒАЛЫМҚЫЗЫ", "Информатика"),
            new StudentsModel(3,"ТЛЕУЛЕСОВА АСЕМ АСКАРОВНА ", "Информатика"),
            new StudentsModel(4,"АБИТАЕВА ГАУХАР КАЛЕЛОВНА ", "Математика"),
            new StudentsModel(5,"ХАНАПИЯ БАХЫТГҮЛ ", "Математика"),
            new StudentsModel(6,"АМРЕНОВА АЙНАГУЛЬ САРСЕМБАЕВНА", "Математика"),
            new StudentsModel(7,"ФАЗЫЛЗЯНОВА АРАЙЛЫМ ЕРБОЛОВНА", "Математика"),
            new StudentsModel(8,"НАЗРИДЕНОВ СЕРИК НАЗРИДЕНОВИЧ", "Математика"),
            new StudentsModel(9,"ТУСЕНОВ АЛИБЕК СЕМБЕКУЛЫ", "Математика"),
            new StudentsModel(10,"БЕЙСЕНБИНОВА САЛТАНАТ БОЛАТОВНА ", "Биология"),
            new StudentsModel(11,"ЖАРЫЛҒАСЫМ ЕРАСЫЛ ҚУАНЫШҰЛЫ", "Физика"),
            new StudentsModel(12,"КАШКИНБАЕВА АЙМАН САБИТОВНА", "Физика"),
            new StudentsModel(13,"КАСАМБАЕВА АЙЫМГҮЛ ЛҰҚПАНҚЫЗЫ", "География"),
            new StudentsModel(14,"РЫСҚҰЛБЕК МӨЛДІР ЕЛДОСҚЫЗЫ", "Химия"),
            new StudentsModel(15,"БАЙЖЫРЫКОВА САУЛЕ КАБЫЛДАҚЫЗЫ", "Дене шыныктыру"),
            new StudentsModel(16,"ИСКАКОВ АРМАН САБЫРҰЛЫ ", "Дене шыныктыру"),
            new StudentsModel(17,"БОРАНАЛИН КУАТ ҚАНАТҰЛЫ ", "Дене шыныктыру"),
            new StudentsModel(18,"АКЖОЛОВ СЕМБАЙ КИНЖЕБАЕВИЧ", "Алғашқы Әскери Дайындық"),
            new StudentsModel(19,"АСАИНОВ БОЛАТ НУРЖАНОВИЧ", "Еңбек, Сызу, Бейнелеу"),
            new StudentsModel(20,"СЕЙСЕНБИНОВА ДИЛЯРА МЕНДИГАЛИҚЫЗЫ", "Ән-күй"),
            new StudentsModel(21,"АКШАЛОВА ЗАКЕН БЕКМУХАМБЕТОВНА", "Хореография"),
            new StudentsModel(22,"ТОЛУБАЕВА ГҮЛІМЖАН ОРАЛБЕКҚЫЗЫ", "Технология"),
            new StudentsModel(23,"КАСЫБАЕВА МАЙРА БАҒДАТҚЫЗЫ", "Қазақ тілі мен әдебиеті"),
            new StudentsModel(24,"АБАЕВА АЛМАГҮЛ ТҰРЛЫХАНҚЫЗЫ", "Қазақ тілі мен әдебиеті"),
            new StudentsModel(25,"ОКПИНА БАҚТЫГҮЛ МАУЛИТҚЫЗЫ", "Қазақ тілі мен әдебиеті"),
            new StudentsModel(26,"МУХАМЕТЖАНОВА РАЙГҮЛ ЖЕТПІСҚЫЗЫ", "Қазақ тілі мен әдебиеті"),
            new StudentsModel(27,"АХМЕТОВА ГҮЛЗИНА ҚАБДЫРАХМАНҚЫЗЫ", "Қазақ тілі мен әдебиеті"),
            new StudentsModel(28,"БАЙРОН МӘРЕС ЖҰМАШҰЛЫ", "Қазақ тілі мен әдебиеті"),
            new StudentsModel(29,"КАРІМЖАН ЖАРЫЛГАПБЕРДІ ТӨЛЕПБЕРГЕНҰЛЫ", "Тарих"),
            new StudentsModel(30,"МҰХТАР ДАСТАН БЕКБОЛАТҰЛЫ", "Тарих"),
            new StudentsModel(31,"САРСЕНОВ ТУЛЕГЕН МАМРАСИЛОВИЧ", "Тарих"),
            new StudentsModel(32,"САДЕНОВА ОРЫНТАЙ БАТБЕКОВНА", "Орыс тілі мен әдебиеті"),
            new StudentsModel(33,"БЕКЕНОВА ҚОРЛАН ҚАБЫКЕНОВНА", "Орыс тілі мен әдебиеті"),
            new StudentsModel(34,"АБЫЛКАДИРОВА ГАЙНИ ТЛЕУЛЕСОВНА", "Орыс тілі мен әдебиеті"),
            new StudentsModel(35,"ИСКАКОВА ДИНАРА СЕРИКОВНА", "Ағылшын тілі"),
            new StudentsModel(36,"ЖАНГАБУЛОВА ЖАЗРИА ЕРАЛИЕВНА", "Ағылшын тілі"),
            new StudentsModel(37,"СУЛЕЙМЕНОВ РАШИД ХУСНАДИНОВИЧ", "Ағылшын тілі"),
            new StudentsModel(38,"БАЙМУХАМБЕТОВА А.", "Ағылшын тілі")
    );

    private void loadStudents()
    {
        studentId.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        tbData.setItems(studentsModels);
    }
//    public void backPressed(MouseEvent mouseEvent) throws IOException {
//        Button button = (Button) mouseEvent.getSource();
//        if ((button).getText().equals("Артқа")) {
//            Stage current = (Stage) button.getScene().getWindow();
//            Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
//            current.setScene(new Scene(root));
//            current.setMaximized(true);
//            current.show();
//        }
//    }
     @FXML
     private void backPressed(javafx.event.ActionEvent mouseEvent) {
         if (mouseEvent.getSource() == btnBack) {
             loadStage("/home/fxml/Home.fxml");
         }
         Stage stage = (Stage) btnBack.getScene().getWindow();
         stage.close();
     }
      private void loadStage(String fxml) {
             try {
                 Parent root = FXMLLoader.load(getClass().getResource(fxml));
                 Stage stage = new Stage();
                 stage.setScene(new Scene(root));
                 stage.getIcons().add(new Image("/home/icons/icon.png"));
                 stage.initModality(Modality.APPLICATION_MODAL);
                 stage.show();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
}
