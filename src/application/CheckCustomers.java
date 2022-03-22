package application;

import java.awt.Button;
import java.io.IOException;
import java.net.URL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.mail.FetchProfile.Item;
import javax.swing.JOptionPane;
import javax.swing.text.Element;

import application.CustomersData;
import application.Main;
import application.Customer;
import javafx.beans.property.IntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.css.PseudoClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class CheckCustomers {
	
	private CustomersData q = Main.q;

    @FXML
    private TableView table;


    @FXML
    private TableColumn firstName;
    @FXML
    private TableColumn lastName;
    @FXML
    private TableColumn carPlate;
    @FXML
    private TableColumn telephoneNumber;
    @FXML
    private TableColumn date;
    @FXML
    private TableColumn isPaid;

 
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
    public void GoToFees(ActionEvent event) throws IOException {
	Parent root = FXMLLoader.load(getClass().getResource("Fees.fxml"));
	Scene scene = new Scene(root, 800, 500);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

	window.setScene(scene);
	window.show();
    }

    @FXML
    public void initialize() {
    	

	firstName.setCellValueFactory(new PropertyValueFactory<Customer, String>("firstName"));
	lastName.setCellValueFactory(new PropertyValueFactory<Customer, String>("lastName"));
	carPlate.setCellValueFactory(new PropertyValueFactory<Customer, String>("carPlate"));
	telephoneNumber.setCellValueFactory(new PropertyValueFactory<Customer, Integer>("telephoneNum"));
	date.setCellValueFactory(new PropertyValueFactory<Customer, String>("date"));
	isPaid.setCellValueFactory(new PropertyValueFactory<Customer, Boolean>("paid"));
	table.setItems(FXCollections.observableArrayList(q.getAllCustomers()));
	

    }

    @FXML
    public void DeleteCostumers(ActionEvent event) throws IOException {
	
	q.clearAllCustomers();
	table.setItems(FXCollections.observableArrayList(new ArrayList<Customer>()));
	System.out.println("All Costumers Deleted.");

    }

   
    
    @FXML
    public void DeleteSelectedCostumers(ActionEvent event) throws IOException, SQLException  {
        Connection c = DriverManager.getConnection("jdbc:derby:customersa12db;create=true");
        Customer cost = (Customer) table.getSelectionModel().getSelectedItem();
        int action = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this item?");
        if(cost != null)
        {
        	 PreparedStatement statement = c.prepareStatement("DELETE FROM customersa12 WHERE carPlate = ?");
        	    statement.setString(1, cost.getcarPlate());
        	    statement.executeUpdate();
        	    initialize();
        	    System.out.println(cost.getfirstName() + " " +cost.getlastName() +" with car plate number: "+cost.getcarPlate()+ " got deleted.");
        		
        	    
        		
        }
    }
    
    
    
    @FXML
    public void CostumerPaid(ActionEvent event) throws IOException, SQLException{
    	
//    	 Customer cost = (Customer) table.getSelectionModel().getSelectedItem();
//    	 cost.setis_Paid(true);
//    	 System.out.println( cost.getis_Paid());
//    	 ArrayList<Customer> results = q.getAllCustomers();	
//    	 //TableRow<Customer> row = new TableRow<>();
//    	  for(int i=0;i<results.size();i++) {
//    		  if (results.get(i).getis_Paid() == true) {
//    			  System.out.println(results.get(i).getfirstName());
//    		  }
//    	  }
//    	
//    	  
    	
    	  Connection c = DriverManager.getConnection("jdbc:derby:customersa12db;create=true");
    	 Customer cost = (Customer) table.getSelectionModel().getSelectedItem();
        
         if(cost != null)
         {
         	
         	PreparedStatement statement = c.prepareStatement("UPDATE customersa12 SET PAID = true WHERE ID = " +cost.getID());
         	statement.executeUpdate();
         	initialize();
         	 
           
         		
         }
        
    }
    
    
    @FXML
    public void CostumerUnPaid(ActionEvent event) throws IOException, SQLException{
      
    	
    	  Connection c = DriverManager.getConnection("jdbc:derby:customersa12db;create=true");
    	 Customer cost = (Customer) table.getSelectionModel().getSelectedItem();
        
         if(cost != null)
         {
         	
         	PreparedStatement statement = c.prepareStatement("UPDATE customersa12 SET PAID = false WHERE ID = " +cost.getID());
         	statement.executeUpdate(); 
         	initialize();
         	 
           
         		
         }
        
    }

        
    }

