package methods;

public class MathTest {

	public static void main(String[] args) {
		// 내장 함수 중 수학(math) 함수 사용
		int v1 = Math.abs(-10); 		// 절대값
		System.out.println("v1 = " + v1);
		
		long v2 = Math.round(5.67); 	//6, 반올림해서 정수로 변환
		System.out.println("v2 = " + v2);
		
		double v3 = Math.floor(3.67); 	//3.0, 버림해서 정수로 변환
		System.out.println("v3 = " + v3);
		
		double v4 = Math.ceil(4.67); 	//5.0 올림해서 정수로 변환
		System.out.println("v4 = " + v4);
		
		//random() - 무작위 0.0 <= 범위 < 1.0
		double rand = Math.random();
		System.out.println("rand = " + rand);
		
		//dice - 주사위(1~6)
		int dice = (int)(Math.random()*6+1);
		System.out.println(dice);
		
		//1~10까지 자연수 무작위 출력
		int num = (int)(Math.random()*10+1);
		System.out.println(num);

		
		
	}

}
