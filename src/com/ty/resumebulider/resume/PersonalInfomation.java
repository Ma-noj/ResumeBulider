package com.ty.resumebulider.resume;

import java.time.LocalDate;

public class PersonalInfomation {
	private String adrnumber;
	private String name;
	private LocalDate dob;
	private int age;
	private String email;
	private long phonenumber;

	public String getAdrnumber() {
		return adrnumber;
	}

	public void setAdrnumber(String adrnumber) {
		this.adrnumber = adrnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDOB() {
		return dob;
	}

	public void setDOB(LocalDate dOB) {
		dob = dOB;
	}

	public int getAge() {
		return age;
	}

	public void setAge() {
		LocalDate d = LocalDate.now();
		age = d.compareTo(dob);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "PersonalInfomation\nadrnumber\t=\t" +adrnumber + "\nname\t\t=\t" + name + "\ndob\t\t=\t" + dob + "\nage\t\t=\t" + age
				+ "\nemail\t\t=\t" + email + "\nphonenumber\t=\t" + phonenumber;
	}
	
	
}
