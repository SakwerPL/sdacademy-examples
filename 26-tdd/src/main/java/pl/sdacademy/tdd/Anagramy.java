package pl.sdacademy.tdd;

import com.google.common.primitives.Chars;

import java.util.HashSet;
import java.util.Set;

public class Anagramy {

	public static Set<String> converter(String str) {
		String[] cha = str.split("");
		Set<String> anagram = new HashSet<>();
		for (int i = 0; i < cha.length; i++) {
			for (int j = 0; j < cha.length; j++) {
				if (i != j) {
					anagram.add(cha[i] + cha[j]);
				}
			}
		}
		return anagram;

	}
}
