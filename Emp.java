package org.apache.commons.net.ftp;

public class Emp {

	private String firstName;
	private String lastName;
	private int age;
	private String compname;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCompname() {
		return compname;
	}
	public void setCompname(String compname) {
		this.compname = compname;
	}
	public Emp(String firstName, String lastName, int age, String compname) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.compname = compname;
	}
	@Override
	public String toString() {
		return "Emp [firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + ", compname=" + compname + "]";
	}
}
