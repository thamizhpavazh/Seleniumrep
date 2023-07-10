package week3.day1.assignments;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println(id+" and "+name);
	}
	public void getStudentInfo(String email, long PhnNum) {
		System.out.println(email+" and "+PhnNum);
	}
	public static void main(String[] args) {
		Students stds=new Students();
		stds.getStudentInfo(10);
		stds.getStudentInfo(11, "pavazh");
		stds.getStudentInfo("pav@gmail.com", 9444460178l);
	}

}
