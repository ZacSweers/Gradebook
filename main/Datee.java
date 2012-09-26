package main;

public class Datee {
	private int month;
	private int day;
	private int year;
	
	public Datee(int mo, int da, int ye) {
		this.month = mo;
		this.day = da;
		this.year = ye;
	}
	
	public String toString() {
		return month + "/" + day + "/" + year;
	}
}
