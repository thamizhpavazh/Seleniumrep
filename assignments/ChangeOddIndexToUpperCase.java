package week3.day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String input="changeme";
		char[] ch=input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			ch[i]=input.charAt(i);
			if((i%2)==0) {
				ch[i]=Character.toUpperCase(ch[i]);
			}
		}
		System.out.println(ch);
	}

}
