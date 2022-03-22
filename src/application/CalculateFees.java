package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CalculateFees {

	@FXML
    private TextField year;
    @FXML
    private TextField horses;
    @FXML
    private Label result;
    
	
	
    @FXML
    public void calculateFees(ActionEvent event) throws IOException {
    	
    	if( Integer.parseInt(year.getText()) <=2007 ){
    		if( (Integer.parseInt(horses.getText()) >= 1) && (Integer.parseInt(horses.getText()) <= 3) ) {
    			result.setText("20,000 L.L");
    		}
    		else if( ( Integer.parseInt(horses.getText()) >= 4 ) && (Integer.parseInt(horses.getText()) <= 10 )) {
    			result.setText("30,000 L.L");
    		}
    		else if(( Integer.parseInt(horses.getText()) >= 11 ) && (Integer.parseInt(horses.getText()) <= 20 )) {
    			result.setText("53,000 L.L");
    		}
    		else if(( Integer.parseInt(horses.getText()) >= 21 ) && (Integer.parseInt(horses.getText()) <= 30 )) {
    			result.setText("109,000 L.L");
    		}
    		else if(( Integer.parseInt(horses.getText()) >= 31 ) && (Integer.parseInt(horses.getText()) <= 40 )) {
    			result.setText("140,000 L.L");
    		}
    		else if(( Integer.parseInt(horses.getText()) >= 41 ) && (Integer.parseInt(horses.getText()) <= 50 )) {
    			result.setText("230,000 L.L");
    		}
    		else if(Integer.parseInt(horses.getText()) >= 51 ) {
    			result.setText("288,000 L.L");
    		}
    	}
    	
    	else if( (Integer.parseInt(year.getText()) >=2008) && (Integer.parseInt(year.getText()) <=2015)  ){
    		if( (Integer.parseInt(horses.getText()) >= 1) && (Integer.parseInt(horses.getText()) <= 3) ) {
    			result.setText("40,000 L.L");
    		}
    		else if( ( Integer.parseInt(horses.getText()) >= 4 ) && (Integer.parseInt(horses.getText()) <= 10 )) {
    			result.setText("75,000 L.L");
    		}
    		else if(( Integer.parseInt(horses.getText()) >= 11 ) && (Integer.parseInt(horses.getText()) <= 20 )) {
    			result.setText("120,000 L.L");
    		}
    		else if(( Integer.parseInt(horses.getText()) >= 21 ) && (Integer.parseInt(horses.getText()) <= 30 )) {
    			result.setText("240,000 L.L");
    		}
    		else if(( Integer.parseInt(horses.getText()) >= 31 ) && (Integer.parseInt(horses.getText()) <= 40 )) {
    			result.setText("310,000 L.L");
    		}
    		else if(( Integer.parseInt(horses.getText()) >= 41 ) && (Integer.parseInt(horses.getText()) <= 50 )) {
    			result.setText("510,000 L.L");
    		}
    		else if(Integer.parseInt(horses.getText()) >= 51 ) {
    			result.setText("715,000 L.L");
    		}
    	}
    	else if( (Integer.parseInt(year.getText()) >=2016) && (Integer.parseInt(year.getText()) <=2018)  ){
    		if( (Integer.parseInt(horses.getText()) >= 1) && (Integer.parseInt(horses.getText()) <= 3) ) {
    			result.setText("100,000 L.L");
    		}
    		else if( ( Integer.parseInt(horses.getText()) >= 4 ) && (Integer.parseInt(horses.getText()) <= 10 )) {
    			result.setText("155,000 L.L");
    		}
    		else if(( Integer.parseInt(horses.getText()) >= 11 ) && (Integer.parseInt(horses.getText()) <= 20 )) {
    			result.setText("245,000 L.L");
    		}
    		else if(( Integer.parseInt(horses.getText()) >= 21 ) && (Integer.parseInt(horses.getText()) <= 30 )) {
    			result.setText("505,000 L.L");
    		}
    		else if(( Integer.parseInt(horses.getText()) >= 31 ) && (Integer.parseInt(horses.getText()) <= 40 )) {
    			result.setText("730,000 L.L");
    		}
    		else if(( Integer.parseInt(horses.getText()) >= 41 ) && (Integer.parseInt(horses.getText()) <= 50 )) {
    			result.setText("1,200,000 L.L");
    		}
    		else if(Integer.parseInt(horses.getText()) >= 51 ) {
    			result.setText("1,500,000 L.L");
    		}
    	}
    	
    	else if( (Integer.parseInt(year.getText()) >=2019) && (Integer.parseInt(year.getText()) <=2021)  ){
    		if( (Integer.parseInt(horses.getText()) >= 1) && (Integer.parseInt(horses.getText()) <= 3) ) {
    			result.setText("150,000 L.L");
    		}
    		else if( ( Integer.parseInt(horses.getText()) >= 4 ) && (Integer.parseInt(horses.getText()) <= 10 )) {
    			result.setText("325,000 L.L");
    		}
    		else if(( Integer.parseInt(horses.getText()) >= 11 ) && (Integer.parseInt(horses.getText()) <= 20 )) {
    			result.setText("525,000 L.L");
    		}
    		else if(( Integer.parseInt(horses.getText()) >= 21 ) && (Integer.parseInt(horses.getText()) <= 30 )) {
    			result.setText("1,050,000 L.L");
    		}
    		else if(( Integer.parseInt(horses.getText()) >= 31 ) && (Integer.parseInt(horses.getText()) <= 40 )) {
    			result.setText("1,525,000 L.L");
    		}
    		else if(( Integer.parseInt(horses.getText()) >= 41 ) && (Integer.parseInt(horses.getText()) <= 50 )) {
    			result.setText("2,500,000 L.L");
    		}
    		else if(Integer.parseInt(horses.getText()) >= 51 ) {
    			result.setText("3,100,000 L.L");
    		}
    	}
    	
    	
    	
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
    public void GotoSearchCostumer(ActionEvent event) throws IOException {
	
	
	Parent root = FXMLLoader.load(getClass().getResource("search.fxml"));
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
