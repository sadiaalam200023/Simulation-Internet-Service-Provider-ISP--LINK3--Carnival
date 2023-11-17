/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class LoginSceneController implements Initializable {

    @FXML
    private PasswordField passwordTextField;
    @FXML
    private TextField idTextField;
    @FXML
    private ComboBox<String> selectUserComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       selectUserComboBox.getItems().addAll("Client","Customer Care", "HRM","Accounts Officer","Manager","Network Engineer","Technical Officer","Security Controller");
    }    

    @FXML
    private void singInButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void forgetPasswordButtonOnClicked(ActionEvent event) {
    }
    
}
