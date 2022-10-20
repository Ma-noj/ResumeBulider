package com.ty.resumebulider.teacher;

import com.ty.resumebulider.resume.PersonalInfomation;
import com.ty.resumebulider.resume.Resume;

public class Teacher implements Resume {

	private PersonalInfomation info;
	private String qualification;
	private String experience;
	private String achievements;

	public PersonalInfomation getInfo() {
		return info;
	}

	public void setInfo(PersonalInfomation info) {
		this.info = info;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getAchievements() {
		return achievements;
	}

	public void setAchievements(String achievements) {
		this.achievements = achievements;
	}

	@Override
	public void bioDate() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Teacher_Resume\n" + info + "\nqualification\t=\t" + qualification + "\nexperience\t=\t" + experience
				+ "\nachievements\t=\t" + achievements;
	}
	
	

}
