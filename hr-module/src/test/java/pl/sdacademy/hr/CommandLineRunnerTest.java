package pl.sdacademy.hr;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CommandLineRunnerTest {
	@DisplayName("Should reject input data when 3 arguments are given, but first name is empty.")
	@Test
	void test0() {
		//given
		String[] args = { "lastName=Miauczyński","dateOfBirth=01-09-1990", "anything"};
		HrManager hrManager = new HrManager();
		//when
		//give the function than will be run later
		assertThatThrownBy(() -> CommandLineRunner.load(args,hrManager ))
			//then
			.isInstanceOf(IllegalArgumentException.class);
	}
	@DisplayName("Should check if when first name, last name and date of birth are given then database isn't " +
		"empty.")
	@Test
	void test1() {
		//given
		String [] args = {"firstName=Adam", "lastName=Miauczyński", "dateOfBirth=01-12-1980"};
		HrManager hrManager = new HrManager();
		//when
		CommandLineRunner.load(args, hrManager);
		//then
		assertThat(hrManager.findAll()).isNotEmpty();
	}
	@DisplayName("Should reject input data when 3 arguments are given, but last name is empty.")
	@Test
	void test2() {
		//given
		String[] args = { "firstname=Adam","dateOfBirth=01-09-1990", "anything"};
		HrManager hrManager = new HrManager();
		//when
		//give the function than will be run later
		assertThatThrownBy(() -> CommandLineRunner.load(args,hrManager ))
			//then
			.isInstanceOf(IllegalArgumentException.class);
	}
	@DisplayName("Should reject input data when 3 arguments are given, but date of birth is empty.")
	@Test
	void test3() {
		//given
		String[] args = { "firstname=Adam","lastName=Miauczyński", "anything"};
		HrManager hrManager = new HrManager();
		//when
		//give the function than will be run later
		assertThatThrownBy(() -> CommandLineRunner.load(args,hrManager ))
			//then
			.isInstanceOf(IllegalArgumentException.class);
	}
	@DisplayName("Should check if when first name, last name and date of birth aren't empty than database " +
		"contains single employee with the same name.")
	@Test
	void test4() {
		//given
		HrManager hrManager = new HrManager();
		String[] args = {"firstName=Adam","lastName=Miauczyński","dateOfBirth=01-12-1980"};
		//when
		CommandLineRunner.load(args, hrManager);
		//then
		Employee employee = hrManager.findAll().get(0);
		assertThat(employee.getFirstName()).isEqualTo("Adam");
		assertThat(employee.getLastName()).isEqualTo("Miauczyński");
		assertThat(employee.getDateOfBirth()).isEqualTo("01-12-1980");
	}
	@DisplayName("Should return a list of text representation all of employees from database.")
	@Test
	void test5() {
		//given
		HrManager hrManager = new HrManager();
		String[] args = {"firstName=Adam","lastName=Miauczyński","dateOfBirth=01-12-1980"};
		CommandLineRunner.load(args, hrManager);
		//when
		List<String> allEmployees = CommandLineRunner.list(hrManager);
		//then
		assertThat(allEmployees).containsOnly("Adam Miauczyński 01-12-1980");
	}
}