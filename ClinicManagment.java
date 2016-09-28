/*
  file name:ClinicManagment.java
  Created by:Bhushan Ranjane
  Create Date:-14-09-2016
  Purpose:Clinic Management manages every task in the clinic  
*/
package com.ClinicManagement;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import com.ClinicManagement.Appointment;

public class ClinicManagment
{
	public static void main(String args[]) throws ParseException
	{
 		Scanner sc=new Scanner(System.in);
		Utility u=new Utility();
		//create the object of class Search details 
		SearchDeatils search=new SearchDeatils();
		//Create the Hash map to store key value
		HashMap<Appointment,Integer> hash=new HashMap<Appointment,Integer>();
		//create the object of class AddallDetails
		AddallDetails a=new AddallDetails();
		//create the array list of doctor
		Appointment appointment=new Appointment();
		
		ArrayList<Doctor> doctor=new ArrayList<Doctor>();
		//create the array list of patient
		ArrayList<Patient> patient=new ArrayList<Patient>();
		
		char ch;
		
		do
		{
			System.out.println(" Welcome to ClinicManagement System ");
			System.out.println("Select Your Operation from the list of operations:");
			System.out.println("1.Add Doctor");
			System.out.println("2.Add Patient");
			System.out.println("3.Print doctor");
			System.out.println("4.Print Patients");
			System.out.println("5.Take Appoinment");
			System.out.println("6.Print Appoinment");
			System.out.println("7.Search Doctor by name ,id or Availability");
			System.out.println("8.Search Patients by name ,id ");
			System.out.println("Enter Your Choice here ");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:{
				//call add Doctor function from Add all details class 
				doctor=a.addDoctor();
				
				break;
			}
			case 2:
			{
				//call add patient function to add all patient
				patient=a.addPatient();
				
				break;
			}
			case 3:
			{
				
				//displays all doctor details
				System.out.println("All doctor details are");
				a.displayDoctor(doctor);
				break;
			}
			case 4:
			{
				//displays all patient details
				System.out.println("All Patient details are");
				a.displayPatient(patient);
				
				break;
			}
			case 5:
			{
				//Schedule the appointment for the available doctors
				appointment.scheduleAppointment(doctor);
	
				break;
			}
			case 6:
			{
				//Display the list of Appointments for the day
				System.out.println("The Apppointments Scheduled for today are:");
				System.out.println(hash);
				break;
			}
			case 7:
			{
				char ch1=0;
				do
				{
					//Search for the doctor Starts Here
					System.out.println("1.Search Doctor by Name ");
					System.out.println("2.Search Doctor By Id");
					System.out.println("3.Search Doctor by Specialization ");
					System.out.println("Press 1 to search By Name.  Press 2 to search By Id. Press 3 to search by Specialization ");
					int searchChoice=sc.nextInt();
					
					switch(searchChoice)
					{
					
					case 1:
					{
						//Search the doctor by his name
						System.out.println("Enter the doctor Name to search Doctor");
						String dname=sc.next();
						//call search doctor name function to search doctor by name
						search.SearchDocName(doctor,dname);
						break;
					}
					case 2:
					{
						//search the doctor by his id
						System.out.println("Enter the Doctor Id to search Doctor");
						int doctid=sc.nextInt();
						//call search doctor Id function to search doctor by Id
						search.SearchDoctId(doctor, doctid);
						break;
					}
					case 3:{
						//Search the doctor by Specialization
						System.out.println("Search Doctor by Specialization");
						String docSpec=sc.next();
						//call search doctor Specialization function to search doctor by Specialization
						search.SearchDocSpec(doctor, docSpec);
						break;
					}
					default:
						System.out.println("You have entered Wrong Choice");
					}
					System.out.println("Do you want to Continue with Doctor Search");
					ch1=u.inputString().charAt(0);
				}while(ch1=='y' ||ch1=='Y');
			break;
			}
			case 8:
			{
				//Search for the patient begins here
				char ch2=0;
				do
				{
					System.out.println("Search of the patient begins from here ");
					System.out.println("1.Search Patient by name ");
					System.out.println("2.Search Patient by Id");
					System.out.println("3.Search Patient by Mobile Number");
					System.out.println("4.Search Patient by Age");
					System.out.println("Enter Your Choice Here");
					int patchoice=sc.nextInt();
					
					switch(patchoice)
					{
					case 1:
					{
						//Search Patient by his name
						System.out.println("Enter the Patient name to search Patient ");
						String patname=sc.next();
						//call Search Patient Name function to search Patient by name
						search.SearchPatName(patient, patname);
						break;
					
					}
					case 2:
					{
						//search Patient by his Id
						System.out.println("Enter the patient Id to Search Patient");
						int patid=sc.nextInt();
						//call Search Patient Id function to search Patient by ID
						search.SearchPatId(patient, patid);
						break;
					}
					case 3:
					{
						//search Patient by his Mobile number
						System.out.println("Enter the mobile number to Search patient");
						int patmob=sc.nextInt();
						//call Search Patient mobile function to search Patient by his mobile number
						search.SearchPatMob(patient, patmob);
						break;
					}
					case 4:
					{
						//Search Patient by his Age
						System.out.println("Enter the Age of the Patient to Search ");
						int patage=sc.nextInt();
						//call Search Patient Age function to search Patient by his Age
						search.SearchpatAge(patient, patage);
						break;
					}
					default:
						System.out.println("Your Have Entered invalid choice ");
						break;
					}
					System.out.println("Do you want to continue With Patient Search");
					ch2=u.inputString().charAt(0);
					
				}while(ch2=='y' ||ch2=='Y');
			}
			
			}
			System.out.println("\nDo you want to continue with Clinic management System \n");
	        ch = sc.next().charAt(0);
			
			
		}
		while(ch=='y' ||ch=='Y');
		
		
	}
}