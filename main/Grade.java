package main;

import java.util.Date;

public class Grade {
	private String name;
	private double grade;
	private Datee date;
	
	public Grade() {
		this.name = "Not set";
		this.grade = 0.0;
	}
	
	public Grade(String s, double d, Datee e) {
		this.name = s;
		this.grade = d;
		this.date = e;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getGrade() {
		return this.grade;
	}
	
	public Datee getDate() {
		return this.date;
	}
	
	public void setName(String s) {
		this.name = s;
	}
	
	public void setGrade(double d) {
		this.grade = d;
	}
	
	public void setDate(int mo, int da, int ye) {
		this.date = new Datee(mo, da, ye);
	}
	
	public String toString() {
		return date.toString() + "/t" + name + "\t" + grade;
	}
}
