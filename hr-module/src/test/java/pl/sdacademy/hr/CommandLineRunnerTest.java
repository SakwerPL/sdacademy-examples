package pl.sdacademy.hr;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class CommandLineRunnerTest {

	@DisplayName("should reject imput data when only first name is empty")
	@Test
	void tes00() {
		//given
		String firstName = "";
		String [] args = new String[]{firstName};

		//when
		CommandLineRunner.load(args)
		//whan

	}
}
