package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GradeType {
	
	private String[] defaults = new String[8];
	private int thisType;
	private String thisTypeS;
	private ArrayList<Grade> grades = new ArrayList<Grade>();
	private int gradeCount;
	private int weight;
	
	
	public GradeType() {
		this.defaults[0] = "Exams";
		this.defaults[1] = "Midterms";
		this.defaults[2] = "Final";
		this.defaults[3] = "Homework";
		this.defaults[4] = "Assignments";
		this.defaults[5] = "Projects";
		this.defaults[6] = "Extra credit";
		this.defaults[7] = "Quizzes";
		this.thisTypeS = "Not set";
		this.gradeCount = 0;
	}
	
	public void setDefaultType(int i) {
		this.thisType = i;
		this.thisTypeS = defaults[i];
	}
	
	public void setType(String s) {
		this.thisTypeS = s;
	}
	
	// Set the weight of the course, in percentage
	public void setWeight(int i) {
		this.weight = i;
	}
	
	public void addGrade(Datee d, String name, double val) {
		Grade neo = new Grade(name, val, d);
		grades.add(neo);
		System.out.println("Successfully added " + neo.toString());
	}
	
	public double getAverage() {
		double val = 0.0;
		int count = 0;
		for (Grade g : grades) {
			val += g.getGrade();
			count++;
		}
		val = weight*(val/count);
		return val;
	}
	
	public void printDefs() {
		System.out.print('\f');
		System.out.println("*************************");
		for (int i = 0; i < defaults.length; i++) {
			String s = defaults[0];
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
}
