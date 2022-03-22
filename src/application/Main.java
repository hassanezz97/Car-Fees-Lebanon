package application;
	
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

import org.quartz.CronExpression;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import application.CustomersData;
import application.EmailUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	public static CustomersData q = new CustomersData();
	  private static Stage stg;
	@Override
	 public void start(Stage primaryStage) throws Exception{
      stg = primaryStage;
      primaryStage.setResizable(false);
      Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
      primaryStage.setTitle("AE Car Services");
      Scene scene = new Scene(root, 800, 500);
      scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
      primaryStage.setScene(scene);
      primaryStage.show();
  }

  public void changeScene(String fxml) throws IOException {
      Parent pane = FXMLLoader.load(getClass().getResource(fxml));
      stg.getScene().setRoot(pane);
  }


  public static void main(String[] args) {
	  
	  int month =  Calendar.getInstance().get(Calendar.MONTH) + 1;
	//  System.out.println("Current month is: "+ month);
	  ArrayList<Customer> results = q.getAllCustomers();	
	 
	  /* for(int i=0;i<results.size();i++) {
	
		 		int date = Integer.parseInt(results.get(i).getDate());
	if(date == month) {
		System.out.println("Sending email");
		  try {
				JobDetail job1 = JobBuilder.newJob(Job1.class)
						.withIdentity("job1", "group1").build();
				job1.getJobDataMap().put("fname", results.get(i).getfirstName());
				job1.getJobDataMap().put("lname", results.get(i).getlastName());
				job1.getJobDataMap().put("carplate", results.get(i).getcarPlate());
				job1.getJobDataMap().put("telephone", results.get(i).gettelephoneNum());
				job1.getJobDataMap().put("month", results.get(i).getDate());
				
				Trigger trigger1 = TriggerBuilder.newTrigger()
						.withIdentity("cronTrigger1", "group1")
						.withSchedule(CronScheduleBuilder.cronSchedule(String.format("0 35 14 17 %s ? *", date)))
		                
						.build();
				
				
				Scheduler scheduler1 = new StdSchedulerFactory().getScheduler();
				scheduler1.start();
				scheduler1.scheduleJob(job1, trigger1);

				Thread.sleep(100000);
				
				scheduler1.shutdown();

				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		
	} 
	 
	
	  
	}*/
	 launch(args);
		
	 
      
  }
}
