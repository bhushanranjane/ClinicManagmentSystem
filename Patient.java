/*
  file name:Patient.java
  Created by:Bhushan Ranjane
  Create Date:-12-09-2016
  Purpose:To set and get all the Patient Related details 
*/
package com.ClinicManagement;

public class Patient
{
	private String patientName;
	private int patientId;
	private int mobileNo;
	private int patientAge;
	
	
	public String getPatientName()
	{
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
}
