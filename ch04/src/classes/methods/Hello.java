package classes.methods;

public class Hello { //필드 생성자 메서드
	
	//public Hello() {} 기본 생성자 생략
	
	//sayHello() 메서드 정의
	public void sayHello() {
		System.out.println("안녕~");
	}
	
	//메서드 오버로딩(함수 이름은 같고 매개변수가 다름)
	public void sayHello(String name) {		
		System.out.println("안녕~ " + name);
	}
}
