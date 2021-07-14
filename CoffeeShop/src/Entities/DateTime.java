package Entities;

public class DateTime { 
	int day;
	int month;
	int year;

	public DateTime() {

	}

	public DateTime(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getYear(DateTime datetime) {
		return datetime.year;
	}
}
