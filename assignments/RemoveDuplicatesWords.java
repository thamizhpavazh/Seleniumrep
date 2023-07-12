package week3.day2.assignments;


import java.util.Arrays;
import java.util.LinkedHashSet;


public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";

		String[] textArray= null;
		textArray=text.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<>(Arrays.asList(textArray));
		for (int i = 0; i < textArray.length; i++) {
			set.add(textArray[i]);
		}

		String output=set.toString().replaceAll("\\[", "").replaceAll(",","").replaceAll("\\]","");
		System.out.println(output);
	}

}
