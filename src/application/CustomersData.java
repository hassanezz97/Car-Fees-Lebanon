package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CustomersData {
    private static final String URL = "jdbc:derby:customersa12db;create=true";

    private Connection connection; // manages connection
    private PreparedStatement selectAllcustomers;
    private PreparedStatement insertNewcustomer;
    private PreparedStatement getcustomerByName;

    // constructor
    public CustomersData() {
	try {
	    System.out.println("Starting The App");
	    connection = DriverManager.getConnection(URL);

	    createTable();

	    // create query that selects all entries in customers
	    selectAllcustomers = connection.prepareStatement("SELECT * FROM customersa12");

	    // create query that selects a book with a specific name
	    getcustomerByName = connection.prepareStatement("SELECT * FROM customersa12 WHERE carPlate = ? ");

	    // create insert that adds a new entry into the database
	    insertNewcustomer = connection
		    .prepareStatement("INSERT INTO customersa12 " + "(firstName, lastName, carPlate, telephoneNumber, date, paid) " + "VALUES (?, ?, ?, ?, ?, ?)");
	} catch (SQLException sqlException) {
	    sqlException.printStackTrace();
	    System.exit(1);
	}
    } // end PersonQueries constructor

    public void clearAllCustomers() {
	try {
	    Statement statement = connection.createStatement();
	    statement.executeUpdate("DELETE FROM customersa12");
	} catch (SQLException sqlException) {
	    sqlException.printStackTrace();
	    close();
	}

    }
  

    public Customer getcostumerByName(String carPlate) {
	ArrayList<Customer> results = null;
	ResultSet resultSet = null;

	try {
	    // executeQuery returns ResultSet containing matching entries
		getcustomerByName.setString(1, carPlate);
	    resultSet = getcustomerByName.executeQuery();
	    results = new ArrayList<Customer>();

	    while (resultSet.next()) {
		results.add(new Customer(resultSet.getInt("ID"), resultSet.getString("firstName"), resultSet.getString("lastName"),
			resultSet.getString("carPlate"), resultSet.getInt("telephoneNumber"),resultSet.getString("date"), resultSet.getBoolean("paid")));
	    }
	   
	} catch (SQLException sqlException) {
	    sqlException.printStackTrace();
	} finally {
	    try {
		resultSet.close();
	    } catch (SQLException sqlException) {
		sqlException.printStackTrace();
		close();
	    }
	}

	System.out.println(carPlate);
	return results.get(0);
    }

    // select all of the addresses in the database
    public ArrayList<Customer> getAllCustomers() {
	ArrayList<Customer> results = null;
	ResultSet resultSet = null;

	try {
	    // executeQuery returns ResultSet containing matching entries
	    resultSet = selectAllcustomers.executeQuery();
	    results = new ArrayList<Customer>();

	    while (resultSet.next()) {
		results.add(new Customer(resultSet.getInt("ID"), resultSet.getString("firstName"), resultSet.getString("lastName"),
			resultSet.getString("carPlate"), resultSet.getInt("telephoneNumber"),resultSet.getString("date"), resultSet.getBoolean("paid") ));
	    
	    }
	} catch (SQLException sqlException) {
	    sqlException.printStackTrace();
	} finally {
	    try {
		resultSet.close();
	    } catch (SQLException sqlException) {
		sqlException.printStackTrace();
		close();
	    }
	}

	return results;
    }

    // add an entry
    public int addCostumer(String firstName, String lastName, String carPlate, int telephoneNumber, String date, Boolean paid) {
	int result = 0;

	// set parameters, then execute insertNewPerson
	try {
		insertNewcustomer.setString(1, firstName);
		insertNewcustomer.setString(2, lastName);
		insertNewcustomer.setString(3, carPlate);
		insertNewcustomer.setInt(4, telephoneNumber);
		insertNewcustomer.setString(5, date);
		insertNewcustomer.setBoolean(6, paid);

	    // insert the new entry; returns # of rows updated
	    result = insertNewcustomer.executeUpdate();
	} catch (SQLException sqlException) {
	    sqlException.printStackTrace();
	    close();
	}

	return result;
    }

    public void createTable() throws SQLException {
	try {
	    Statement statement = connection.createStatement();
	    statement.executeUpdate("CREATE TABLE customersa12(" + " ID INT NOT NULL GENERATED ALWAYS AS IDENTITY "
		    + " , FirstNAME VARCHAR(50) NOT NULL " + " , LASTNAME VARCHAR(50) NOT NULL "
		    + " , CARPLATE VARCHAR(50) NOT NULL " + " , TELEPHONENUMBER INT NOT NULL " + 
		    " , DATE INT NOT NULL " + ",  PAID BOOLEAN DEFAULT false " +")");

	} catch (SQLException se) {
	    if (!se.getSQLState().equals("X0Y32"))
		throw se;
	}
    }

    // close the database connection
    public void close() {
	try {
	    connection.close();
	} catch (SQLException sqlException) {
	    sqlException.printStackTrace();
	}
    }

	public int addCostumer(String text, String text2, String text3, Object setText, int parseInt) {
		// TODO Auto-generated method stub
		return 0;
	}
}
