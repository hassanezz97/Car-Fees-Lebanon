package application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;
public class LogIn {

    public LogIn() {

    }

    @FXML
    private Button button;
    @FXML
    private Label wrongLogIn;
    @FXML
    private TextField email;
    @FXML
    private PasswordField password;



    public void userLogIn(ActionEvent event) throws IOException {
        checkLogin();
    }

    private void checkLogin() throws IOException {
        Main m = new Main();
        if(email.getText().toString().equals("aeservice") && password.getText().toString().equals("aliezz")) {
            wrongLogIn.setText("Success!");

            m.changeScene("Costumers.fxml");
        }

        else if(email.getText().isEmpty() && password.getText().isEmpty()) {
            wrongLogIn.setText("Please enter your data.");
        }


        else {
            wrongLogIn.setText("Wrong username or password!");
        }
    }


}