package JavaFx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField yourPassword;

    @FXML
    private Button searchButton;

    @FXML
    private TextField yourEmail;

    @FXML
    private Button registerButton;

    @FXML
    private TextField putVendorCode;

    @FXML
    private TextField yourName;

    @FXML
    private TextArea backetValue;

    @FXML
    private Button addToBacketButton;

    @FXML
    private TextField putReference;

    @FXML
    private TextArea productDescription;


    @FXML
    void initialize() {
        searchButton.setOnAction(event -> {
            System.out.println("NEKJFJLJOW");
        });
    }
}
