package singleton.student;

public class StudentMain {

	public static void main(String[] args) {
		
		School school = School.getInstance();
		School school2 = School.getInstance();
		
		Student 개똥이 = school.createStu();
		Student 소똥이 = school.createStu();
		Student 말똥이 = school.createStu();
		System.out.println("학번: " + 개똥이.getStuNum());
		System.out.println("학번: " + 소똥이.getStuNum());
		System.out.println("학번: " + 말똥이.getStuNum());
		
		//학교 객체의 주소
		System.out.println(school);
		System.out.println(school2);
		
		//학생 개체의 주소
		System.out.println(개똥이);
		System.out.println(소똥이);
		System.out.println(말똥이);
	}

}
