package singleton.student;


public class School {
	private static School instance;
	private School() {}
	public static School getInstance() {
		if (instance == null) {
			instance = new School();
		}
		return instance;
	}
	
	
	public Student createStu() {
		Student stu = new Student();
		return stu;
	}
}
