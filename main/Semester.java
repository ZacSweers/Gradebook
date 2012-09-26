package main;

import java.util.ArrayList;

public class Semester {
//	private When when;
	private ArrayList<Course> courses;
//	private ArrayList<Goal> goals;
	private double GPA;
	private int courseCount;
	private int year;
	private int hours;
	private String season;
	
	
	public Semester() {
		GPA = 0.0;
		courses = new ArrayList<Course>();
		year = 0;
		hours = 0;
		season = "You haven't set the season yet!";
		courseCount = 0;
	}
	
	public Semester(int ye, int hou, String sea) {
		this.year = ye;
		this.hours = hou;
		this.season = sea;
	}
	
	public void setYear(int x) { 
		this.year = x;
	}
	
	public void setSeason(String s) {
		this.season = s;
	}
	
	public int getHours() {
		return this.hours;
	}
	
	public double getGPA() {
		GPA = calc();
		return GPA;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public String getSeason() {
		return this.season;
	}
	
	public String getInfo() {
		return season+" "+year;
	}
	
	public boolean addCourse(String prefix, int number, String name, int hours) {
		Course newCourse = new Course(prefix, number, name, hours);
		this.courses.add(newCourse);
		courseCount++;
		hours += newCourse.getHours();
		return true;
	}
	
	public void printCourses() {
		String ESC = "\033[";
		System.out.print(ESC + "2J"); 
		System.out.println("*************************");
		for (int i = 0; i < courseCount; i++) {
			String s = courses.get(i).shortName();
			System.out.print("* " + i+1 + ". ");
			int whitespace = 20-s.length();
			System.out.print(s);
			for (int j = 0; j < whitespace; j++) {
				System.out.print(" ");
			}
			System.out.print("*\n");
		}
		System.out.println("*************************");
	}
	
	public double calc() {
		double val = 0.0;
		for (int i = 0; i < courseCount; i++) {
			String[] calcd = courses.get(i).getRunningGrade();
			val += Double.parseDouble(calcd[0]);
		}
		val = val/hours;
		return val;
	}
	
}
