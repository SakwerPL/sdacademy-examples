package pl.sdacademy.hr;

import java.util.Objects;
import java.util.stream.Stream;

class Employee implements Comparable<Employee> {
	private final String firstName;
	private final String dateOfBirth;
	private final String lastName;

	public Employee(String firstName, String lastName, String dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;

	}


	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}


	@Override
	public String toString() {
		return firstName + " " + lastName + " " + dateOfBirth;
	}

	public boolean matches(String phrase) {
		return firstName.contains(phrase) || lastName.contains(phrase) || dateOfBirth.contains(phrase);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Employee employee = (Employee) o;
		return Objects.equals(firstName, employee.firstName) && Objects.equals(dateOfBirth, employee
			.dateOfBirth) && Objects.equals(lastName, employee.lastName);
	}

	@Override
	public int hashCode() {

		return Objects.hash(firstName, dateOfBirth, lastName);
	}

	@Override
	public int compareTo(Employee other) {
		return firstName.compareTo(other.firstName);
	}
}
