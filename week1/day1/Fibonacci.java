package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNum=0,secNum=1,sum=0,i,count=13;    
		 System.out.print(firstNum+" "+secNum);   
		    
		 for(i=2;i<count;++i)    
		 {    
		  sum=firstNum+secNum;    
		  System.out.print(" "+sum);    
		  firstNum=secNum;    
		  secNum=sum;    
		 }   
	}

}
