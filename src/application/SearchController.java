package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SearchController {
    
    private CustomersData q = Main.q;


    @FXML
    private Pane costumer;

    @FXML
    private Text FirstName;
    @FXML
    private Text LastName;
    @FXML
    private Text CarPlate;
    @FXML
    private Text Telephone;
    @FXML
    private Text Date;
    
    @FXML
    private TextField SearchText;
    
    
    
    @FXML
    public void Search(ActionEvent event) throws IOException {
	Customer b =q.getcostumerByName(SearchText.getText());
	FirstName.setText(b.getfirstName());
	LastName.setText(b.getlastName());
	CarPlate.setText(b.getcarPlate());
	Telephone.setText(b.gettelephoneNum()+"");
	Date.setText(b.getDate());
	costumer.setVisible(true);
	
    }
    
    @FXML
    public void GoToAddCostumers(ActionEvent event) throws IOException {
	Parent root = FXMLLoader.load(getClass().getResource("Costumers.fxml"));
	Scene scene = new Scene(root, 800, 500);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

	window.setScene(scene);
	window.show();
    }
    @FXML
    public void GoToFees(ActionEvent event) throws IOException {
	
	
	Parent root = FXMLLoader.load(getClass().getResource("Fees.fxml"));
	Scene scene = new Scene(root, 800, 500);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

	window.setScene(scene);
	window.show();
    }
    @FXML
    public void GoToSchedule(ActionEvent event) throws IOException {
	
	
	Parent root = FXMLLoader.load(getClass().getResource("Schedule.fxml"));
	Scene scene = new Scene(root, 800, 500);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

	window.setScene(scene);
	window.show();
    }
    
    @FXML
    public void GoToCheckCostumers(ActionEvent event) throws IOException {
	Parent root = FXMLLoader.load(getClass().getResource("checkCostumers.fxml"));
	Scene scene = new Scene(root, 800, 500);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

	window.setScene(scene);
	window.show();
    }
    


}
