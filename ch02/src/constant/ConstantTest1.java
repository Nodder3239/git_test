package constant;

public class ConstantTest1 {

	public static void main(String[] args) {
		// 상수 선언 및 사용 (final, 대문자 사용)
		
		int maxNum = 100;  // 변수
		maxNum = 1000;
		
		final int MAX_NUM = 100;  // 상수
		// MAX_NUM = 1000; 오류
		
		System.out.println(maxNum);
		System.out.println(MAX_NUM);
		
		//원의 넓이 = 반지름^2 * 원주율(PI)
		//변수 - radius, circleArea
		//상수 - PI
		
		int radius = 5;
		final double PI = 3.141592653589793238462643383279; // 상수이므로 변경할 수 없음
		double circleArea = radius * radius * PI;
		System.out.println("원의 넓이 : " + circleArea);
	}

}
