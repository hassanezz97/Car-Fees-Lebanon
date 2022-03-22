package application;

import java.io.IOException;
import java.sql.SQLException;

import application.CustomersData;
import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddCustomer {
	  private CustomersData q = Main.q;
	    @FXML
	    private TextField firstName;
	    @FXML
	    private TextField lastName;
	    @FXML
	    private TextField carPlate;
	    @FXML
	    private TextField telephoneNumber;
	    @FXML
	    private TextField dateinp;
	    @FXML
	    private Label Success;
	    @FXML
	    private Label fnamelabel;
	    @FXML
	    private Label lnamelabel;
	    @FXML
	    private Label carplatelabel;
	    @FXML
	    private Label telephonelabel;
	    @FXML
	    private Label datelabel;
	    @FXML
	    private Label ispaid;

	    
	    @FXML
	    public void AddCostumer(ActionEvent event) throws IOException, SQLException {

		if (!(firstName.getText().equals("") || lastName.getText().equals("") || carPlate.getText().equals("")
			|| telephoneNumber.getText().equals(""))) {
			String carNum = carPlate.getText();
			
			int carNumAfterCode = Integer.parseInt(carNum.substring(1, carNum.length()));
			//Adding the date according to the car plate number:
			if(carNum.charAt(0) == 'A') {
				if(carNumAfterCode >=1 && carNumAfterCode <= 160000) {
					dateinp.setText("3");
				}
				else if(carNumAfterCode >=160001 && carNumAfterCode <= 500000) {
					dateinp.setText("4");
				}
				else if(carNumAfterCode >=500001 && carNumAfterCode <= 1300000) {
					dateinp.setText("5");
				}
				else if(carNumAfterCode >=1300001 && carNumAfterCode <= 1800000) {
					dateinp.setText("6");
				}
				else if(carNumAfterCode >=1800001 && carNumAfterCode <= 7999999) {
					dateinp.setText("7");
				}
				
				
			}
			
			else if(carPlate.getText().charAt(0) == 'B'){
				
				if( (carNumAfterCode >=200 && carNumAfterCode <= 100000) || (carNumAfterCode >=100001 && carNumAfterCode <= 235000)) {
					dateinp.setText("3");
				}
				else if(carNumAfterCode >=235001 && carNumAfterCode <= 280000) {
					dateinp.setText("4");
				}
				else if(carNumAfterCode >=280001 && carNumAfterCode <= 325000) {
					dateinp.setText("5");
				}
				else if(carNumAfterCode >=325001 && carNumAfterCode <= 370000) {
					dateinp.setText("6");
				}
				else if(carNumAfterCode >=370001 && carNumAfterCode <= 405000) {
					dateinp.setText("7");
				}
				else if(carNumAfterCode >=405001 && carNumAfterCode <= 440000) {
					dateinp.setText("8");
				}
				else if(carNumAfterCode >=440001 && carNumAfterCode <= 475000) {
					dateinp.setText("9");
				}
				else if(carNumAfterCode >=475001 && carNumAfterCode <= 510000) {
					dateinp.setText("10");
				}
				else if(carNumAfterCode >=510001 && carNumAfterCode <= 545000) {
					dateinp.setText("11");
				}
				else if(carNumAfterCode >=545001 && carNumAfterCode <= 590000) {
					dateinp.setText("12");
				}
				
			}
			
			else if(carPlate.getText().charAt(0) == 'G'){
				if( (carNumAfterCode >=200 && carNumAfterCode <= 100000) || (carNumAfterCode >=100001 && carNumAfterCode <= 160000)) {
					dateinp.setText("3");
				}
				else if(carNumAfterCode >=160001 && carNumAfterCode <= 180000) {
					dateinp.setText("4");
				}
				else if(carNumAfterCode >=180001 && carNumAfterCode <= 190000) {
					dateinp.setText("5");
				}
				else if(carNumAfterCode >=190001 && carNumAfterCode <= 220000) {
					dateinp.setText("6");
				}
				else if(carNumAfterCode >=220001 && carNumAfterCode <= 310000) {
					dateinp.setText("7");
				}
				else if(carNumAfterCode >=310001 && carNumAfterCode <= 400000) {
					dateinp.setText("8");
				}
				else if(carNumAfterCode >=400001 && carNumAfterCode <= 490000) {
					dateinp.setText("9");
				}
				else if(carNumAfterCode >=490001 && carNumAfterCode <= 560000) {
					dateinp.setText("10");
				}
				else if(carNumAfterCode >=560001 && carNumAfterCode <= 630000) {
					dateinp.setText("11");
				}
				else if(carNumAfterCode >=630001 && carNumAfterCode <= 699999) {
					dateinp.setText("12");
				}
				
			}
			
			else if(carPlate.getText().charAt(0) == 'T' ){
				if( (carNumAfterCode >=200 && carNumAfterCode <= 100000) || (carNumAfterCode >=100001 && carNumAfterCode <= 140000)) {
					dateinp.setText("3");
				}
				else if(carNumAfterCode >=140001 && carNumAfterCode <= 150000) {
					dateinp.setText("4");
				}
				else if(carNumAfterCode >=150001 && carNumAfterCode <= 160000) {
					dateinp.setText("5");
				}
				else if(carNumAfterCode >=160001 && carNumAfterCode <= 180000) {
					dateinp.setText("6");
				}
				else if(carNumAfterCode >=180001 && carNumAfterCode <= 190000) {
					dateinp.setText("7");
				}
				else if(carNumAfterCode >=190001 && carNumAfterCode <= 220000) {
					dateinp.setText("8");
				}
				else if(carNumAfterCode >=220001 && carNumAfterCode <= 310000) {
					dateinp.setText("9");
				}
				else if(carNumAfterCode >=310001 && carNumAfterCode <= 400000) {
					dateinp.setText("10");
				}
				else if(carNumAfterCode >=400001 && carNumAfterCode <= 490000) {
					dateinp.setText("11");
				}
				
			}
			else if(carPlate.getText().charAt(0) == 'O'){
				if( (carNumAfterCode >=200 && carNumAfterCode <= 100000) || (carNumAfterCode >=100001 && carNumAfterCode <= 140000)) {
					dateinp.setText("3");
				}
				else if(carNumAfterCode >=140001 && carNumAfterCode <= 150000) {
					dateinp.setText("4");
				}
				else if(carNumAfterCode >=150001 && carNumAfterCode <= 160000) {
					dateinp.setText("5");
				}
				else if(carNumAfterCode >=160001 && carNumAfterCode <= 180000) {
					dateinp.setText("6");
				}
				else if(carNumAfterCode >=180001 && carNumAfterCode <= 210000) {
					dateinp.setText("7");
				}
				else if(carNumAfterCode >=210001 && carNumAfterCode <= 240000) {
					dateinp.setText("8");
				}
				else if(carNumAfterCode >=240001 && carNumAfterCode <= 250000) {
					dateinp.setText("9");
				}
				else if(carNumAfterCode >=250001 && carNumAfterCode <= 310000) {
					dateinp.setText("10");
				}
				else if(carNumAfterCode >=310001 && carNumAfterCode <= 400000) {
					dateinp.setText("11");
				}
				else if(carNumAfterCode >=400001 && carNumAfterCode <= 490000) {
					dateinp.setText("12");
				}
				
			}
			else if(carPlate.getText().charAt(0) == 'Z'){
				if( (carNumAfterCode >=200 && carNumAfterCode <= 100000) || (carNumAfterCode >=100001 && carNumAfterCode <= 120000)) {
					dateinp.setText("3");
				}
				else if(carNumAfterCode >=120001 && carNumAfterCode <= 125000) {
					dateinp.setText("4");
				}
				else if(carNumAfterCode >=125001 && carNumAfterCode <= 130000) {
					dateinp.setText("5");
				}
				else if(carNumAfterCode >=130001 && carNumAfterCode <= 135000) {
					dateinp.setText("6");
				}
				else if(carNumAfterCode >=135001 && carNumAfterCode <= 140000) {
					dateinp.setText("7");
				}
				else if(carNumAfterCode >=140001 && carNumAfterCode <= 145000) {
					dateinp.setText("8");
				}
				else if(carNumAfterCode >=145001 && carNumAfterCode <= 155000) {
					dateinp.setText("9");
				}
				else if(carNumAfterCode >=155001 && carNumAfterCode <= 265000) {
					dateinp.setText("10");
				}
				else if(carNumAfterCode >=265001 && carNumAfterCode <= 375000) {
					dateinp.setText("11");
				}
				else if(carNumAfterCode >=375001 && carNumAfterCode <= 490000) {
					dateinp.setText("12");
				}
				
			}
			else if(carPlate.getText().charAt(0) == 'S' || carPlate.getText().charAt(0) == 'N'){
				if( (carNumAfterCode >=200 && carNumAfterCode <= 100000) || (carNumAfterCode >=100001 && carNumAfterCode <= 120000)) {
					dateinp.setText("3");
				}
				else if(carNumAfterCode >=120001 && carNumAfterCode <= 125000) {
					dateinp.setText("4");
				}
				else if(carNumAfterCode >=125001 && carNumAfterCode <= 130000) {
					dateinp.setText("5");
				}
				else if(carNumAfterCode >=130001 && carNumAfterCode <= 135000) {
					dateinp.setText("6");
				}
				else if(carNumAfterCode >=135001 && carNumAfterCode <= 140000) {
					dateinp.setText("7");
				}
				else if(carNumAfterCode >=140001 && carNumAfterCode <= 155000) {
					dateinp.setText("8");
				}
				else if(carNumAfterCode >=155001 && carNumAfterCode <= 265000) {
					dateinp.setText("9");
				}
				else if(carNumAfterCode >=265001 && carNumAfterCode <= 375000) {
					dateinp.setText("10");
				}
				else if(carNumAfterCode >=375001 && carNumAfterCode <= 490000) {
					dateinp.setText("11");
				}
				
				
			}
			else if(carPlate.getText().charAt(0) == 'M'){
				if(carNumAfterCode >=200 && carNumAfterCode <= 100000) {
					dateinp.setText("3");
				}
				else if(carNumAfterCode >=410001 && carNumAfterCode <= 415000) {
					dateinp.setText("10");
				}
				else if(carNumAfterCode >=650001 && carNumAfterCode <= 665000) {
					dateinp.setText("11");
				}
				else if(carNumAfterCode >=665001 && carNumAfterCode <= 675000) {
					dateinp.setText("12");
				}
				
			}


			
			
		    int result = q.addCostumer(firstName.getText(), lastName.getText(), carPlate.getText(), Integer.parseInt(telephoneNumber.getText()), dateinp.getText(), Boolean.parseBoolean(ispaid.getText()));
		    
		    if (result == 1) {
		    	
			System.out.println("Customer Added");
		    Success.setText("Customer Added Successfully.");
		    fnamelabel.setText(null);
		    lnamelabel.setText(null);
		    carplatelabel.setText(null);
		    telephonelabel.setText(null);
		    }
		    else {
			System.out.println("Error Costumer not added!");}

		}
		else if (firstName.getText().isEmpty() && lastName.getText().isEmpty() && carPlate.getText().isEmpty()
				&& telephoneNumber.getText().isEmpty()) {
			fnamelabel.setText("Text Field Required!");
			lnamelabel.setText("Text Field Required!");
			carplatelabel.setText("Text Field Required!");
			telephonelabel.setText("Text Field Required!");
			
		}
		else if (firstName.getText().isEmpty() ) {
			fnamelabel.setText("Text Field Required!");
			
		}
		else if (lastName.getText().isEmpty()) {
			lnamelabel.setText("Text Field Required!");
			
		}
		else if (carPlate.getText().isEmpty()) {
			carplatelabel.setText("Text Field Required!");
			
		}
		else if (telephoneNumber.getText().isEmpty()) {
			telephonelabel.setText("Text Field Required!");
			
		}
		

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
    public void GotoSearchCostumer(ActionEvent event) throws IOException {
	
	
	Parent root = FXMLLoader.load(getClass().getResource("Search.fxml"));
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
    

}
