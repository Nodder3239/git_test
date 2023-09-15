package methods;

public class MethodTest1 {

	
	// 함수 정의와 호출 (<->변수의 선언과 호출)

	public static void main(String[] args) {
		//System.out.println("안녕하세요~");
		sayHello();		// 호출
		sayHello("파이썬");
		sayHello("사람이름");
	}
	//sayHello() 이름의 함수를 정의
	//void - 반환값이 없음(null)
	public static void sayHello() {
		System.out.println("안녕하세요~ 자바");
	}
	//매개변수(parameter)가 있는 함수를 정의			
	//함수 이름이 같아도 매개변수가 달라서 다른 함수 취급
	public static void sayHello(String name) {
		System.out.println("안녕하세요~ " + name);
		
	}
}
