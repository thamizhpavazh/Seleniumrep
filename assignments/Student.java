package week3.day1.assignments;

public class Student extends Department{

	public void studentName() {
		System.out.println("Student name from -> Student case");
	}
	public void studentDept() {
		System.out.println("Student Dept from -> Student case");
	}
	public void studentID() {
		System.out.println("Student ID from -> Student case");
	}
	public static void main(String[] args) {
		Student sd=new Student();
		sd.collegeName();
		sd.collegeCode();
		sd.collegeRank();
		sd.deptName();
		sd.studentName();
		sd.studentDept();
		sd.studentID();
	}
}
