package dbDemo.src.ciccc.dbdemo.data;

import java.time.LocalDate;

public class Employee {

	private int identifier;
	private String firstName;
	private String lastName;
	private char gender;
	private LocalDate birthDate;
	private LocalDate hireDate;

	public Employee(int identifier, String firstName, String lastName, char gender, LocalDate birthDate,
			LocalDate hireDate) {
		this.identifier = identifier;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.hireDate = hireDate;
	}

	public final int getIdentifier() {
		return identifier;
	}

	public final void setIdentifier(int identifier) {
		this.identifier = identifier;
	}

	public final String getFirstName() {
		return firstName;
	}

	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public final String getLastName() {
		return lastName;
	}

	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public final char getGender() {
		return gender;
	}

	public final void setGender(char gender) {
		this.gender = gender;
	}

	public final LocalDate getBirthDate() {
		return birthDate;
	}

	public final void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public final LocalDate getHireDate() {
		return hireDate;
	}

	public final void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "Employee [identifier=" + identifier + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", birthDate=" + birthDate + ", hireDate=" + hireDate + "]";
	}

}
