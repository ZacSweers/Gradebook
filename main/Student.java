package main;

import java.util.ArrayList;

public class Student {

	private String studentName;
	private String schoolID;
	private String schoolName;
	private int[] studentBirthday = new int[3];
	private ArrayList<Semester> stuSemesters = new ArrayList<Semester>();
	
	Student() {
		
	}
	
	public void setName(String name) {
		this.studentName = name;
	}
	
	public void setSchoolID(String id) {
		this.schoolID = id;
	}
	
	public void setSchoolName(String name) {
		this.schoolName = name;
	}
	
	public void setBDay(int day, int month, int year) {
		this.studentBirthday[0] = day;
		this.studentBirthday[1] = month;
		this.studentBirthday[2] = year;
	}
	
	public String getName() {
		return this.studentName;
	}
	
	public String getSchoolName() {
		return this.schoolName;
	}
	
	public String getSchoolID() {
		return this.schoolID;
	}
	
	public ArrayList<Semester> getSemesters() {
		return this.stuSemesters;
	}
	
	public void newSemester(int ye, String sea, int hou) {
		this.stuSemesters.add(new Semester(ye, hou, sea));
	}
	
	
}
