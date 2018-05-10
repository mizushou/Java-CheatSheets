package predicates;

import java.time.LocalDate;
import java.time.Period;

public class Employee {

	private int id;
	private char gender;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;

	public Employee(int id, char gender, String firstName, String lastName, LocalDate dateOfBirth) {
		setId(id);
		setGender(gender);
		setFirstName(firstName);
		setLastName(lastName);
		setDateOfBirth(dateOfBirth);
	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final char getGender() {
		return gender;
	}

	public final void setGender(char gender) {
		this.gender = gender;
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

	public final LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public final void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		LocalDate currentDate = LocalDate.now();
		Period period = Period.between(dateOfBirth, currentDate);

		return period.getYears();
	}

	@Override
	public String toString() {
		return "Employee [gender=" + gender + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", calculateAge()=" + getAge() + "]\n";
	}

}
