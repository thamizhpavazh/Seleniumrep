package week3.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		String input="madam", rev="";
		for (int i=input.length()-1; i>=0; i--) {
			rev=rev+input.charAt(i);
		}
		if (rev.equalsIgnoreCase(input)) {
			System.out.println(input+" is Palindrome");
		}
		else {
			System.out.println(input+ " is not Palindrome");
		}

	}

}
