package week3.day1.assignments;

public class Automation extends MultipleLangauge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation am= new Automation();
		am.java();
		am.selenium();
		am.python();
		am.ruby();
	}

	public void selenium() {
		System.out.println("Selenium");
	}

	public void java() {
		System.out.println("java");
		
	}

	@Override
	public void ruby() {
		System.out.println("ruby");
		
	}

}
