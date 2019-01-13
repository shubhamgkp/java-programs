package string_Handling;

import java.util.Set;
import java.util.stream.Collectors;

public class CheckSameCharsInString {

	public static void main(String[] args) {

		sameCharsString("abc", "cba");
	}

	public static void sameCharsString(String s1, String s2) {

		Set<Character> set1 = s1.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
		Set<Character> set2 = s2.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());

		System.out.println(set1.equals(set2));

	}
}
