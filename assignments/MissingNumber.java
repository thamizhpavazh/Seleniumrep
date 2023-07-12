package week3.day2.assignments;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] nums = {1,2,2,3,3,4,5,7};
		Set <Integer> unique= new TreeSet<>();
		for (int i = 0; i < nums.length; i++) {
			unique.add(nums[i]);
		}
		int missingNum=0;
		for (int i = 0; i < unique.size(); i++) {
			if (unique.size()!=unique.size()+1) {
				missingNum=unique.size();

			}

		}
		System.out.println(missingNum);
	}

}
