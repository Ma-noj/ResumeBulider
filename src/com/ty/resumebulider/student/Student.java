package com.ty.resumebulider.student;

import com.ty.resumebulider.resume.PersonalInfomation;
import com.ty.resumebulider.resume.Resume;

public class Student implements Resume {
	
	private PersonalInfomation info;
	private String results;
	private String descipline;
	

	public PersonalInfomation getInfo() {
		return info;
	}

	public void setInfo(PersonalInfomation info) {
		this.info = info;
	}

	public String getresults() {
		return results;
	}

	public void setresults(String results) {
		this.results = results;
	}

	public String getdescipline() {
		return descipline;
	}

	public void setdescipline(String descipline) {
		this.descipline = descipline;
	}

	@Override
	public void bioDate() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Student_Resume \n" + info + "\nresults\t\t=\t" + results + "\ndescipline\t=\t" +descipline;
	}
	
	
}
