package Entities;

public class Customer {
	private int id;
	private String name;
	private String surname;
	private DateTime birthDate;
	private long nationalityID;

	public Customer() {

	}

	public Customer(long nationalityID, String name, String surname, DateTime birthDate) {
		super();
		this.nationalityID = nationalityID;
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public DateTime getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(DateTime birthDate) {
		this.birthDate = birthDate;
	}

	public long getNationalityID() {
		return nationalityID;
	}

	public void setNationalityID(long nationalityID) {
		this.nationalityID = nationalityID;
	}

}
