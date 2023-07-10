package week3.day1.assignments;

public class AxisBank extends Bankinfo{
	public void deposit() {
		System.out.println("Deposit overrided by-> deposit class");
	}
	public static void main(String[] args) {
		AxisBank ab= new AxisBank();
		ab.deposit();

	}

}
