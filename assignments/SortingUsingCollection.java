package week3.day2.assignments;

import java.util.Arrays;
import java.util.Collections;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] arr= {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		int size=arr.length;
		System.out.println("the size of array is "+size);
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr).replaceAll("\\[", "").replaceAll("\\]", ""));
	}

}
