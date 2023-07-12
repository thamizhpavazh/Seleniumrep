package week3.day2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test="I am a software tester";
		String[] t = test.split(" ");

		String value = "";
		for (int i = 0; i < t.length; i++) {

			if (i % 2 == 1) {
				value = value + new StringBuilder(t[i]).reverse().toString() + " ";
			}
			else {
				value = value + t[i] + " ";
			}
		}
		value = value.trim();
		System.out.println(value);
	}

}
