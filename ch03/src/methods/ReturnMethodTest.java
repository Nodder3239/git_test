package methods;

public class ReturnMethodTest {

	//return이 있는 함수 (반환 자료형) - int, String // 반환 - 호출할 곳으로 변환값을 보냄
	//return이 없는 함수 - void
		
	public static void main(String[] args) {
		int n1 = 10, n2 = 20;  //지역(local) 변수
		int sum = n1 + n2;
		System.out.println(sum);

		//더하기 함수 호출
		int result = add(n1, n2);
		System.out.println("결과값1: " + result);
		
		//제곱수 호출
		int result2 = add(n1);
		System.out.println("결과값2: " + result2);

		//메세지 호출
		String msg = message();
		System.out.println(msg);
	}
	
	//return이 있고, 매개변수가 2개인 함수 이름 - add()
	public static int add(int a, int b) {  //매개(parameter) 변수
		return a + b;
	}
	
	//return이 있고, 매개변수가 1개인 함수
	public static int add(int x) {
		return x * x;	//제곱을 계산하는 함수
	}
	
	//return이 없고, 매개변수가 없는 함수
	public static String message() {
		// return "행운을 빌어요!";
		String msg = "행운을 빌어요!";
		return msg;
	}
	
	
}
