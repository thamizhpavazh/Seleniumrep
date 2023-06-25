package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static int getSecondLargest(int[] a, int total){  
		Arrays.sort(a);  
		return a[total-2];  
	}  
	public static void main(String args[]){  
		int a[]={3,2,11,4,6,7};  
		System.out.println("Second Largest: "+getSecondLargest(a,a.length));  

	}
}