package com.prowings.languageBasics.Cloning;

public class Family {

	String fatherName;
	String motherName;

	public Family() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Family(String fatherName, String motherName) {
		super();
		this.fatherName = fatherName;
		this.motherName = motherName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	@Override
	public String toString() {
		return "Family [fatherName=" + fatherName + ", motherName=" + motherName + "]";
	}

}
