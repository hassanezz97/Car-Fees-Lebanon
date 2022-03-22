package application;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Customer {

    private final IntegerProperty ID;
    private final StringProperty  firstName;
    private final StringProperty  lastName;
    private final StringProperty  carPlate;
    private final IntegerProperty  telephoneNum;
    private final StringProperty date;
    private final BooleanProperty paid;


    public Customer(int ID,String firstName, String lastName, String carPlate, int telephoneNum, String date, Boolean paid) {
	this.ID = new SimpleIntegerProperty();
	this.firstName = new SimpleStringProperty();
	this.lastName = new SimpleStringProperty();
	this.carPlate = new SimpleStringProperty();
	this.telephoneNum = new SimpleIntegerProperty();
	this.date = new SimpleStringProperty();
	this.paid = new SimpleBooleanProperty();
	
	setID(ID);
	setfirstName(firstName);
	setlastName(lastName);
	setcarPlate(carPlate);
	settelephoneNum(telephoneNum);
	setDate(date);
	setPaid(paid);

    }

    public final StringProperty firstNameProperty() {
	return firstName;
    }

    public final String getfirstName() {
    	return firstName.get();
        }
    public final void setfirstName(String fname) {
    	firstName.set(fname);
    }

    public final IntegerProperty IDProperty() {
	return ID;
    }
    public final int getID() {
    	return ID.get();
     }

    public final void setID(int iD) {
	ID.set(iD);
    }

    public final StringProperty lastNameProperty() {
	return lastName;
    }
    public final String getlastName() {
    	return lastName.get();
     }

    public final void setlastName(String lname) {
    	lastName.set(lname);
    }
    

    public final IntegerProperty telephoneNumProperty() {
	return telephoneNum;
    }
    public final int gettelephoneNum() {
    	return telephoneNum.get();
     }

    public final void settelephoneNum(int tnum) {
    	telephoneNum.set(tnum);
    }

    public final StringProperty carPlateProperty() {
    	return carPlate;
        }
    public final String getcarPlate() {
	return carPlate.get();
    }
    
    public final void setDate(String datenum) {
    	date.set(datenum);	
    }
    
    public final String getDate() {
    	return date.get();
        }

    public final BooleanProperty PaidProperty() {
    	return paid;
        }
        public final Boolean getPaid() {
        	return paid.get();
         }

        public final void setPaid(Boolean isPaid) {
    	paid.set(isPaid);
        }

    public final void setcarPlate(String platenum) {
    	carPlate.set(platenum);
    }
    
    public String toString() {
	return "Costumer:\nID: "+ID+"\nName: "+firstName+"\nLast name: "+lastName+"\nCarPlate: "+carPlate+"\nTelephone: "+telephoneNum+"\nDate: "+date;
    }

}
