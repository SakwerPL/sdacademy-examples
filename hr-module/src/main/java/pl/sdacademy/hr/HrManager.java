package pl.sdacademy.hr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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

		return allEmployees.stream().filter(employee -> employee.matches(phrase)).collect(Collectors.toList());
	}

	public List<Employee> sortByFirstName() {
		/*return allEmployees.stream().sorted(Comparator.comparing(Employee::getFirstName)).collect(Collectors
			.toList());*/
		return allEmployees.stream().sorted().collect(Collectors.toList());
	}


	public List<Employee> sortByFirstNameWithBubble() {
		for (int j = 0; j < allEmployees.size() - 1; j++) {
			for (int i = 0; i < allEmployees.size() - 1 - j; i++) {
				if (allEmployees.get(i).getFirstName().compareTo(allEmployees.get(i + 1).getFirstName
					()) < 0) {
					Employee temp = allEmployees.get(i);
					allEmployees.set(i, allEmployees.get(i + 1));
					allEmployees.set(i + 1, temp);
				}
			}
		}
		return allEmployees;
	}
}
