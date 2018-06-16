package pl.sdacademy.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Fail.fail;

// TODO: write your tests inside this class
class FizzBuzzTest {

	// this is how a test look like
	@DisplayName("check if the result isn't null")
	@Test
	/*void nothing() {
		// this is how you write assertions
		assertThat(1).isEqualTo(1);
		assertThat(1).isNotEqualTo(2);
		fail("remove this pseudo test and start writing your own real tests");
	}*/
	void fizzBuzzTest() {
		//given
		int a = 0;
		//when
		String sloneczko = FizzBuzz.msg(a);
		//than
		assertThat(sloneczko).isNotEmpty();
	}

	@DisplayName("If given 1 it returns 1")
	@Test
	void fizzBuzzTest1() {
		//given
		int a = 1;
		//when
		String sloneczko = FizzBuzz.msg(a);
		//than
		assertThat(sloneczko).isEqualTo("1");
	}

	@DisplayName("If given 2 it returns \"Wizz\"")
	@Test
	void fizzBuzzTest2() {
		//given
		int a = 2;
		//when
		String sloneczko = FizzBuzz.msg(a);
		//than
		assertThat(sloneczko).isEqualTo("Wizz");
	}
	@DisplayName("If given 7 it returns \"Wizz\"")
	@Test
	void fizzBuzzTest7() {
		//given
		int a = 7;
		//when
		String sloneczko = FizzBuzz.msg(a);
		//than
		assertThat(sloneczko).isEqualTo("Wizz");
	}

	@DisplayName("If given 3 it returns \"Fizz\"")
	@Test
	void fizzBuzzTest3() {
		//given
		int a = 3;
		//when
		String sloneczko = FizzBuzz.msg(a);
		//than
		assertThat(sloneczko).isEqualTo("FizzWizz");
	}

	@DisplayName("If given 5 it returns \"Buzz\"")
	@Test
	void fizzBuzzTest5() {
		//given
		int a = 5;
		//when
		String sloneczko = FizzBuzz.msg(a);
		//than
		assertThat(sloneczko).isEqualTo("BuzzWizz");
	}

	@DisplayName("If given 6 it returns \"Fizz\"")
	@Test
	void fizzBuzzTest6() {
		//given
		int a = 6;
		//when
		String sloneczko = FizzBuzz.msg(a);
		//than
		assertThat(sloneczko).isEqualTo("Fizz");
	}


	@DisplayName("If given 10 it returns \"Buzz\"")
	@Test
	void fizzBuzzTest10() {
		//given
		int a = 10;
		//when
		String sloneczko = FizzBuzz.msg(a);
		//than
		assertThat(sloneczko).isEqualTo("Buzz");
	}


	@DisplayName("If given 15 it returns \"FizzBuzz\"")
	@Test
	void fizzBuzzTest15() {
		//given
		int a = 15;
		//when
		String sloneczko = FizzBuzz.msg(a);
		//than
		assertThat(sloneczko).isEqualTo("FizzBuzz");
	}
	@DisplayName("If given 17389 it returns \"Wizz\"")
	@Test
	void fizzBuzzTest16() {
		//given
		int a = 17389;
		//when
		String sloneczko = FizzBuzz.msg(a);
		//than
		assertThat(sloneczko).isEqualTo("Wizz");
	}
}
