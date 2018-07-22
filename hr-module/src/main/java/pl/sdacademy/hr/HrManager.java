package pl.sdacademy.hr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class HrManager {

	List<Employee> allEmployees = new ArrayList<>();
	private static final Path PATH = Paths.get("employees.txt");

	Employee create(String firstName, String lastName, String dateOfBirth) {
		Employee employee = new Employee(firstName, lastName, dateOfBirth);
		allEmployees.add(employee);
		try {
			Files.write(PATH, allEmployees.stream().map(Employee::toString).collect(Collectors.toList()));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return employee;
	}

	List<Employee> findAll() {
		try {
			return Files.readAllLines(PATH).stream().map((line) -> {
				String[] splitLine = line.split(" ");
				Employee employee = new Employee(splitLine[0], splitLine[1], splitLine[2]);
				return employee;
			}).collect(Collectors.toList());
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}
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
		return findAll().stream().sorted().collect(Collectors.toList());
	}


	public List<Employee> sortByFirstNameWithBubble() {
	List<Employee> localEmployees = findAll();

		for (int j = 0; j < localEmployees.size() - 1; j++) {
			for (int i = 0; i < localEmployees.size() - 1 - j; i++) {
				if (localEmployees.get(i).getFirstName().compareTo(localEmployees.get(i + 1).getFirstName
					()) < 0) {
					Employee temp = localEmployees.get(i);
					localEmployees.set(i, localEmployees.get(i + 1));
					localEmployees.set(i + 1, temp);
				}
			}
		}
		return localEmployees;
	}
}
