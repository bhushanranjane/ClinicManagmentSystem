/*
  file name:Doctor.java
  Created by:Bhushan Ranjane
  Create Date:-12-09-2016
  Purpose:To set and get all the Doctor Related details 
*/
package com.ClinicManagement;


public class Doctor 
{
	private String doctorName;
	private String Specializtion;
	private int doctorId;
	private String availability;
		
	public String getDoctorName() 
	{
		return doctorName;
	}

	public void setDoctorName(String doctorName)
	{
		this.doctorName = doctorName;
	}

	public String getSpecializtion() 
	{
		return Specializtion;
	}

	public void setSpecializtion(String specializtion) 
	{
		Specializtion = specializtion;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) 
	{
		this.doctorId = doctorId;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	
	
}
