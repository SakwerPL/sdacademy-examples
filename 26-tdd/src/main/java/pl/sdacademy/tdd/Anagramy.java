package pl.sdacademy.tdd;

import java.util.HashSet;

import java.util.Set;

public class Anagramy {

	public static Set<String> converter(String str) {

		Set<String> anagrams = new HashSet<>();
		if (str.length()<=1){
			anagrams.add(str);
			return anagrams;
		}
		for (int i = 0; i < str.length(); i++) {

			char tempChar = str.charAt(i);
			Set<String> stringWithoutTemp = Anagramy.converter(stringWithoutTempChar(str, i));
			for (String stringWithout:stringWithoutTemp){
				anagrams.add(tempChar+stringWithout);
			}
		}
		return anagrams;
	}

	private static String stringWithoutTempChar(String str, int i) {

		if (i+1<str.length()) {
			return str.substring(0, i) + str.substring(i + 1, (str.length()));
		}

		else {
			return str.substring(0, i);
		}
	}
}