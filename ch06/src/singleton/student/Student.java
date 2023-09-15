package singleton.student;

public class Student {

	private static int serialNum = 100; 
	private int stuNum;
	
	public Student() {
		serialNum++;
		stuNum = serialNum;
	}
	
	
	public int getStuNum() {
		return stuNum;
	}
}

