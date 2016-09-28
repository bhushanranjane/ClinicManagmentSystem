/*
  file name:Appointment.java
  Created by:Bhushan Ranjane
  Create Date:-17-09-2016
  Purpose:Contains the details of Appointment.
*/
package com.ClinicManagement;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Appointment
{
	static int totalnumberofAppointment=0;
	static int nextTotalnumberofAppointment=0;
	Utility u=new Utility();
	
	int patientId;
	int mobileNo;
	int patientAge;
	int doctorId;
	String date;
	private String aptDate;
	private String nxtdate;
	AddallDetails addalldetails=new AddallDetails();
	
	Scanner sc=new Scanner(System.in);
//Use getter and setter
public String getAptDate()
	{
		return aptDate;
	}
public void setAptDate(String aptDate) 
	{
		this.aptDate = aptDate;
	}

public String getNxtdate() {
	return nxtdate;
}
public void setNxtdate(String nxtdate) {
	this.nxtdate = nxtdate;
}


public void scheduleAppointment(ArrayList<Doctor> doctor)
{
	boolean found=false;
	//date format is specified
	String pattern="dd-MM-yyyy";
	SimpleDateFormat sdf=new SimpleDateFormat(pattern);
	
	Calendar calendar = Calendar.getInstance();
	Appointment appointment=new Appointment();
	
	//Display total number of appointment of the same day 
	System.out.println("Number of appointment"+totalnumberofAppointment);
	
	//Display total number of appointment of the next day
	System.out.println("Number of appointment"+nextTotalnumberofAppointment);
	
	//The list of doctors available in hospital 
	System.out.println("The list of doctors availabale in Clinic are :-");
	addalldetails.displayDoctor(doctor);
	
	//Max number of appointment per doctor is 5
	System.out.println("The Max number of appointment you can take is 5");
	//Doctor Name whose appointment you want to take
		
	date=sdf.format(new Date());
	appointment.setAptDate(date);
	
	
		
	System.out.println("Enter The doctor name from the above list to take appointment");
	String doctname=sc.next();
		
		for (Doctor doctor2 : doctor) {
			if(doctor2.getDoctorName().equalsIgnoreCase(doctname))
			{
				found=true;
			}
		}
		
		if(found==true && totalnumberofAppointment<5)
		{
			//If doctor found increase appointment till the limit of 5
			totalnumberofAppointment++;
			System.out.println("Number of appointment"+totalnumberofAppointment);
			System.out.println("The appointment for " + doctname + " "
					+ "your appointment number is " + totalnumberofAppointment+" "+" and your appointment date is "+" "+date);
		}
		else 
		{	//If appointment is full of for the current date than take the appointment of the next date
			nextTotalnumberofAppointment++;
			System.out.println("Number of appointment"+nextTotalnumberofAppointment);
			//add the next date of the calendar
			calendar.add(Calendar.DATE,1);
			System.out.println("The Appointment for the day is Full ");
			// Displays the next date of appointment and appointment number
			System.out.println(" Your Appointment is Schedule for the next date that is "+sdf.format(calendar.getTime())+" and appointment number is "+nextTotalnumberofAppointment);
			
		}
		
}

}