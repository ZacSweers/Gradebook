package main;

import java.util.ArrayList;

public class Course {
	private String prefix;
	private int number;
	private String name;
	private int hours;
	private String type;
	private double runningGrade;
	private String runningLetter;
	private ArrayList<GradeType> types = new ArrayList<GradeType>();
	
	public Course() {
		this.prefix = "Not set!";
		this.number = 0;
		this.name = "Not set!";
		this.hours = 0;
		this.type = "Not set!";
		this.runningGrade = 0.0;
		this.runningLetter = "N/A";
	}
	
	public Course(String pre, int num, String nam, int ho) {
		this.prefix = pre;
		this.number = num;
		this.name = nam;
		this.hours = ho;
	}
	
	public void setHours(int i) {
		this.hours = i;
	}
	
	public void setName(String s) {
		this.name = s;
	}
	
	public void setNumber(int i) {
		this.number = i;
	}
	
	public void setPrefix(String s) {
		this.prefix = s;
	}
	
	public void setType(String s) {
		this.type = s;
	}
	
	public int getHours() {
		return this.hours;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPrefix() {
		return this.prefix;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String shortName() {
		return this.prefix + " " + this.number;
	}
	
	// Gets the projected grade
	// GradeType gives average relative to weight of class
	public String[] getRunningGrade() {
		double total = 0.0;
		for(GradeType i : types) {
			double ave = i.getAverage();
			if (ave != 0.0) {
				total += ave;
			}
		}
		return gradeFinder(total);
		
	}
	
	//Calculates the grade, need to change this to a hashmap
	public String[] gradeFinder(double var) {
		String[] ret = new String[2];
		ret[0] = "0.0";
		ret[1] = "F";
		if (var > 93.333) { 
				ret[0] = "4.0";
				ret[1] = "A";
				return ret;
		}
		if (var > 90.000) {
				ret[0] = "3.666";
				ret[1] = "A-";
				return ret;
			}
		if (var > 86.666) {
				ret[0] = "3.333";
				ret[1] = "B+";
				return ret;
			}
		if (var > 83.333) {
				ret[0] = "3.0";
				ret[1] = "B";
				return ret;
			}
		if (var > 80.000) {
				ret[0] = "2.666";
				ret[1] = "B-";
				return ret;
			}
		if (var > 76.333) {
				ret[0] = "2.333";
				ret[1] = "C+";
				return ret;
			}
		if (var > 73.333) {
				ret[0] = "2.000";
				ret[1] = "C";
				return ret;
			}
		if (var > 70.000) {
				ret[0] = "1.666";
				ret[1] = "C-";
				return ret;
			}
		if (var > 66.666) {
				ret[0] = "1.333";
				ret[1] = "D+";
				return ret;
			}
		if (var > 63.333) {
				ret[0] = "1.000";
				ret[1] = "D";
				return ret;
			}
		if (var > 60.000) {
				ret[0] = "0.666";
				ret[1] = "D-";
				return ret;
			}
		return ret;
	}
}
