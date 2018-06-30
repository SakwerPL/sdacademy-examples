package pl.sdacademy.tdd;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class AnagramyTest {
	@Disabled
	@DisplayName("for \"pies\" need \"siep\"")
	@Test
	void pies() {
		//given
		String str = "pies";
		//when
		Set<String> piescidelko = Anagramy.converter(str);
		//than
		Assertions.assertThat(piescidelko).contains("siep");
	}

	@Disabled
	@DisplayName("for \"pies\" need \"epis\"")
	@Test
	void epis() {
		//given
		String str = "pies";
		//when
		Set<String> piescidelko = Anagramy.converter(str);
		//than
		Assertions.assertThat(piescidelko).contains("epis");
	}

	@DisplayName("for jo need all anagrams")
	@Test
	void wszystkieJo() {
		//given
		String str = "jo";
		//when
		Set<String> piescidelko = Anagramy.converter(str);
		//than
		Assertions.assertThat(piescidelko).containsOnly("oj", "jo");
	}
	@DisplayName("for oo need all anagrams")
	@Test
	void wszystkieOo() {
		//given
		String str = "oo";
		//when
		Set<String> piescidelko = Anagramy.converter(str);
		//than
		Assertions.assertThat(piescidelko).containsOnly("oo");
	}

	@DisplayName("for kot need all anagrams")
	@Test
	void wszystkieKot() {
		//given
		String str = "kot";
		//when
		Set<String> piescidelko = Anagramy.converter(str);
		//than
		Assertions.assertThat(piescidelko).containsOnly("oo");
	}
}
