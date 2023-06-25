package week1.day2;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,7,6,8};
		System.out.println("Missing number from array: "+missingNumber(arr));

	}

	public static int missingNumber(int[] arr)
	{
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		int restSum=0;
		for (int i = 0; i < arr.length; i++) {
			restSum+=arr[i];
		}
		int missingNumber=sum-restSum;
		return missingNumber;

	}

}
