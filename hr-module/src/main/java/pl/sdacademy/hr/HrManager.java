package pl.sdacademy.hr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class HrManager {

	List<Employee> allEmployees = new ArrayList<>();

	Employee create(String firstName, String lastName, String dateOfBirth) {
		Employee employee = new Employee(firstName, lastName, dateOfBirth);
		allEmployees.add(employee);
		return employee;
	}

	List<Employee> findAll() {

		return allEmployees;
	}

	public List<Employee> searchByLastName(String lastName) {
/*		List<Employee> foundEmployees = new ArrayList<>();
		for (Employee employee : allEmployees) {
			if (employee.getLastName().equals(lastName)) {
				foundEmployees.add(employee);
			}
		}
		return foundEmployees;*/
		return allEmployees.stream().filter(employee -> employee.getLastName().contains(lastName)).collect
			(Collectors.toList());
	}

	public List<Employee> searchByPhrase(String phrase) {

		return allEmployees.stream().filter(employee ->
				   employee.matches(phrase))
				.collect(Collectors.toList());

	}
	// bierzemy wcześniej utworzoną listę allEmployee.otwieramy strem, czytaj ciąg wszystkiego z tej listy.
	// Wszystkich. Dając możliwość operowania na każdym elemencie.
	// filtrujemy tworząc lambdę. Tworzymy lokalnie zmienną employee typu Employee.
	// geterem wyciągamy wszystkich pracowników i sprawdzamy czy w ich lastName jest nasz lastName
	// po czym collect (zbieramy) w listę, a return ją zwraca.

}
