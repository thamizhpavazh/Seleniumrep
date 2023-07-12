package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String input="PayPal India";
		char[] ch=input.toCharArray();
		Set<Character> charSet=new LinkedHashSet<>();
		Set<Character> dupCharSet=new LinkedHashSet<>();
		for (int i = 0; i < ch.length; i++) {
			Boolean add=charSet.add(ch[i]);
			if(!add) {
				dupCharSet.add(ch[i]);
			}
		}

		charSet.addAll(dupCharSet);
		charSet.removeAll(dupCharSet);
		System.out.println(charSet);

		String output=charSet.toString().replaceAll("\\[", "").replaceAll("\\]","").replaceAll("\\s", "").replaceAll(",,",",");
		System.out.println(output);

	}


}
