package application;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


public class Job1 implements Job{ 
	
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println("Time is " + new Date());
		JobDataMap dataMap = context.getJobDetail().getJobDataMap();
		String firstname = dataMap.getString("fname");
		String lastname = dataMap.getString("lname");
		String carPlate = dataMap.getString("carplate");
		int telephoneNum = dataMap.getInt("telephone");
		String Date = dataMap.getString("month");
		EmailUtil.sendEmail("testsystem971@gmail.com","Reminder Email For a Customer","This email is to inform you that '" + firstname + " " + lastname +"' with the car number: " + carPlate +" and telephone number: " + telephoneNum + " should pay his mechanic taxis this month: " + Date);
		
		} 
}
