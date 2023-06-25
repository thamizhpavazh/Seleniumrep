package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int myArrayOne[] = {3,2,11,4,6,7};
		int myArrayTwo[] = {1,2,8,4,9,7};
		System.out.println("Intersection of the two arrays ::");

		for(int i = 0; i<myArrayOne.length; i++ ) {
			for(int j = 0; j<myArrayTwo.length; j++) {
				if(myArrayOne[i]==myArrayTwo[j]) {
					System.out.println(myArrayTwo[j]);
				}
			}
		}

	}

}
