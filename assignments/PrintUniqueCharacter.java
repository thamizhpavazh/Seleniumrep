package week3.day2.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String input="babu";
		char[] ch=input.toCharArray();

		String vow="aeiou";
		List<Character> vowels = new ArrayList<>();
		HashSet<Character> set=new HashSet<>();
		for (char chr : vow.toCharArray()) {
			vowels.add(chr);
		}
		for (int i = 0; i < ch.length; i++) {
			if (vowels.contains(ch[i])) {
				set.add(ch[i]);
			}
		}


		String output=set.toString().replaceAll("\\[", "").replaceAll(",","").replaceAll("\\]","");
		System.out.println(output);
	}
}
