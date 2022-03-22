module FCR {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires javafx.base;
	requires java.desktop;
	requires java.mail;
	requires activation;
	requires quartz;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml, javafx.base;
	
	exports application;

}
