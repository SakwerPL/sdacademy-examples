package pl.sdacademy.hr;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Java6Assertions.assertThatThrownBy;

class CommandLineRunnerTest {

	@DisplayName("should reject imput data when only first name is empty")
	@Test
	void tes00() {
		//given
		HrManager hrManager = new HrManager();
		String[] args = {"lastName=Miałczyński", "dateOfBirth=23-09-2000"};

		//when
		//
		CommandLineRunner clr = new CommandLineRunner();
		Assertions.assertThatThrownBy(() -> CommandLineRunner.load(args, hrManager))

			//whan
			.isInstanceOf(IllegalArgumentException.class);

	}

	@DisplayName("should check if give full data then database isn't empty")
	@Test
	void Test01() {
		//given
		HrManager hrManager = new HrManager();
		String[] args = {"firstName=Jan", "lastName=Kowalski", "dateOfBirth=10-02-1956"};
		//when
		CommandLineRunner.load(args, hrManager);
		//then
		assertThat(hrManager.allEmployees).isNotEmpty();
	}

	@DisplayName("Thrown exception when second name is empty.")
	@Test
	void Test02() {
		//given
		HrManager hrManager = new HrManager();
		String[] args = {"firstName=Kowalski", "dateOfBirth=10-02-1956"};

		//when
		assertThatThrownBy(() -> CommandLineRunner.load(args, hrManager))
			//then
			.isInstanceOf(IllegalArgumentException.class);
	}

	@DisplayName("Thrown exception when date of birth is empty.")
	@Test
	void Test03() {
		//given
		HrManager hrManager = new HrManager();
		String[] args = {"firstName=Kowalski", "secondName = Miałczyński", "anything"};

		//when
		assertThatThrownBy(() -> CommandLineRunner.load(args, hrManager))
			//then
			.isInstanceOf(IllegalArgumentException.class);
	}

	@DisplayName("Should check if firstname lastname and dateofbirth isn't empty than database contains " +
		"single employee with the same firstname lastname dateofbirth")
	@Test
	void Test04() {
		//given
		HrManager hrManager = new HrManager();
		String[] args = {"firstName=Adaś", "lastName= Miauczyński", "dateOfBirth=11-11-1911"};
		//when
		CommandLineRunner.load(args, hrManager);
		//then
		Employee employee = hrManager.findAll().get(0);
		assertThat(employee.getFirstName()).isEqualTo("Adaś");
		assertThat(employee.getLastName()).isEqualTo("Miauczyński");
		assertThat(employee.getDateOfBirth()).isEqualTo("11-11-1911");

	}

	@DisplayName("wwwwwww")
	@Test
	void Test05() {
		//given

		//when
		//then

	}

}

