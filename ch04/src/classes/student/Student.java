package classes.student;


//참조(Reference) 자료형
public class Student {
	//클래스 내부의 변수를 필드(field)라고 함
	String name;  //학생 이름
	int studentId; //학번
	int grade;  //학년
	
	//함수가 아니므로 반환형이 없음
	//클래스 이름과 같음
	//public Student() {} // 기본 생성자(매개 변수가 없는 생성자), 생략 가능
	
	//학생의 정보를 출력하는 메서드(함수) 필요
	//public 접근제어자, void 반환값 없음
	public void showStudentInfo() {
		System.out.println("이름: " + name + ", 학번: " + studentId + ", 학년: " + grade);
	}
}
