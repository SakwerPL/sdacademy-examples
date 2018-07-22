package pl.sdacademy.tdd;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;





import java.util.Set;



import static org.assertj.core.api.Assertions.assertThat;


public class AnagramyTest {



	@DisplayName("Should get 4 values for a word looo")

	@Test

	void Test1(){

		//given

		String word = "looo";

		//when

		Set<String> anagrams = Anagramy.converter(word);

		//then

		assertThat(anagrams).containsOnly("looo","oloo","oolo","oool");

	}



	@DisplayName("Should get 6 values for a word lool")

	@Test

	void Test2(){

		//given

		String word = "lool";

		//when

		Set<String> anagrams = Anagramy.converter(word);

		//then

		assertThat(anagrams).containsOnly("lool","lolo","lloo","olol","ooll","ollo");

	}



	@DisplayName("Should get 4 values for a word kota")

	@Test

	void Test3(){

		//given

		String word = "kota";

		//when

		Set<String> anagrams = Anagramy.converter(word);

		//then

		assertThat(anagrams).containsOnly("kota","koat","kaot","kato","ktao","ktoa","tkoa","tkao","tako",

			"taok","toka","toak","oakt","okta","okat","otka","oatk","otak","akto","akot","atok","atko",

			"aotk","aokt");

	}

}