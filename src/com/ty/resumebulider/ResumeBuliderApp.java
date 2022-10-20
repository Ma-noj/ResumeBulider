package com.ty.resumebulider;

import java.time.LocalDate;

import com.ty.resumebulider.resume.PersonalInfomation;
import com.ty.resumebulider.student.Student;
import com.ty.resumebulider.teacher.Teacher;

public class ResumeBuliderApp {

	public static void main(String[] args) {
		Teacher t1 = new Teacher();

		PersonalInfomation p1 = new PersonalInfomation();
		p1.setAdrnumber("Abc13252673kjgk");
		LocalDate l1 = LocalDate.of(1998, 5, 5);
		p1.setDOB(l1);
		p1.setAge();
		p1.setName("Manoj");
		p1.setEmail("Manoj@abc.com");
		p1.setPhonenumber(9836251728l);

		t1.setInfo(p1);
		t1.setAchievements("Nothing");
		t1.setExperience("5years");
		t1.setQualification("B.E in ISE");

		t1.bioDate();
		
		System.out.println("**************************************************************************");

		Student s1 = new Student();

		s1.setInfo(p1);
		s1.setresults("Pass");
		s1.setdescipline("Good");
		s1.bioDate();
	}

}
