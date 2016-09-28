/*
  file name:AddallDetails.java
  Created by:Bhushan Ranjane
  Create Date:-14 -09-2016
  Purpose:Clinic Management manages every task in the clinic  
*/
package com.ClinicManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class AddallDetails {

	Scanner sc = new Scanner(System.in);
	
	//create the array list for doctor details
	ArrayList<Doctor> doc = new ArrayList<Doctor>();
	//create the array list for patient details 
	ArrayList<Patient> pat = new ArrayList<Patient>();

	//create function to add doctor details
	public ArrayList<Doctor> addDoctor() {
		System.out.println("Number of doctors in Hospital");
		int count = sc.nextInt();

		//enter the doctor details till it reach the max limit
		for (int doctcount = 0; doctcount < count; doctcount++) 
		{
			Doctor docc = new Doctor();
			System.out.println("Enter the Doctor Details");

			// Enter Doctor Name here
			System.out.println("Enter doctor name");
			docc.setDoctorName(sc.next());

			// Enter Doctor Id here
			System.out.println("Enter Doctor Id");
			docc.setDoctorId(sc.nextInt());

			//Enter Specialization of the doctor
			System.out.println("Specialization of the Doctor is");
			docc.setSpecializtion(sc.next());

			//Enter Availability of the doctor
			System.out.println("Enter the Availabilty of the doctor");
			docc.setAvailability(sc.next());

			doc.add(docc);
		}
		return doc;
	}

	//create function to displayDoctor Details
	public void displayDoctor(ArrayList<Doctor> doc) {
		for (Doctor doctor : doc) {
			System.out.println("Doctor Name:- " + doctor.getDoctorName() + " "
					+ "Doctor Id :-" + doctor.getDoctorId() + " "
					+ " Specializtion :-" + doctor.getSpecializtion() + " "
					+ " Availability :- " + doctor.getAvailability());
		}
	}

	//create a function to add patient details
	public ArrayList<Patient> addPatient() {

		System.out.println("Enter the Number of Patient "); // Enter Patient name here
		int numberofPatient = sc.nextInt();
		
		for (int patientCount = 0; patientCount < numberofPatient; patientCount++) {
			Patient patient = new Patient();
			
			//Enter the patient name
			System.out.println("Enter the patient Name ");
			patient.setPatientName(sc.next());

			//Enter the patient ID
			System.out.println("Enter the Patient id");
			patient.setPatientId(sc.nextInt());

			//Enter the patient Mobile Number
			System.out.println("Enter the Patient Mobile Number");
			patient.setMobileNo(sc.nextInt());

			//Enter the patient Age
			System.out.println("Enter the Age Of Patient");
			patient.setPatientAge(sc.nextInt());

			pat.add(patient);
		}
		return pat;
	}

	// function to Display the Patient details
	public void displayPatient(ArrayList<Patient> pat)
	{ 
		for (Patient patient : pat)
		{
			System.out.println("Patient Name is:- " + patient.getPatientName()
					+ " " + "PatientId is:- " + patient.getPatientId() + " "
					+ " " + "Patient Mobile no :-" + patient.getMobileNo()
					+ " " + " Patient age is :-" + patient.getPatientAge());
		}
	}
}
