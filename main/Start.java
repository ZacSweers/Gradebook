package main;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Start {
	
	private static ArrayList<Student> students = new ArrayList<Student>();
	//private boolean hasStudents;
			
			
	public static void main(String[] args) {
		
		start();
	}
	
	public static void initWrite(String[] input) {
		// If no student files are found.
	}
	
	public static ArrayList<Student> getData() {
		students.add(stu);
	}
	
	public static File makeStudent() {
		System.out.println("Making student...");
		Student stu = new Student();
		System.out.println("What is your name?");
		Scanner input = new Scanner(System.in);
		stu.setName(input.nextLine());
		System.out.println("What is your birthday? (in MM/DD/YYY format please)");
		String bday = input.nextLine();
		String[] bdayy = bday.split("/");
		stu.setBDay(Integer.parseInt(bdayy[0]), Integer.parseInt(bdayy[1]), Integer.parseInt(bdayy[2]));
		System.out.println("What is your school's name?");
		stu.setSchoolName(input.nextLine());
		System.out.println("What is your school ID?");
		stu.setSchoolID(input.nextLine());
		
	}
	
	public static void start() {
	}
	
	public static int display(ArrayList<Student> list) {
		// Display options, return array index based on input
		System.out.print('\f');
		ArrayList<Semester> sems = students.get(0).getSemesters();
		System.out.println("What would you like to do " + students.get(0).getName() + "?\n");
		System.out.println("*************************");
		System.out.println("* Menu                  *");
		System.out.println("*-----------------------*");
		int k = 1;
		for (int i = 0; i < sems.size(); i++) {
			if (sems.isEmpty()) {
				k = 1;
				break;
			}
			String s = sems.get(i).getInfo();
			System.out.print("* " + i+1 + ". ");
			int whitespace = 20-s.length();
			System.out.print(s);
			for (int j = 0; j < whitespace; j++) {
				System.out.print(" ");
			}
			System.out.print("*\n");
			k = i+2;
		}
		System.out.println("* " + k + ". Add New Semester   *");
		System.out.println("*************************");
	}

}
