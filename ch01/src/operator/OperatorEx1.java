package operator;

public class OperatorEx1 {

	public static void main(String[] args) {
		// 산술 연산자
		System.out.println(4 + 8); // 12
		System.out.println(4 - 8); // -4
		System.out.println(4 * 8); // 32
		System.out.println(4 / (double)8); // 0.5
		System.out.println(4 % 8); // 4
		
		System.out.println("======================");

		// 산술 연산자(변수 사용)
		int a = 4;
		int b = 8;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println((double)a / b);
		System.out.println(a % b); 
		
		System.out.println("======================");
		
		//점수의 합계, 평균
		int korScore = 95; // '='는 대입 연산자
		int mathScore = 80;
		int sumScore; // 합계 변수 선언
		double avgScore; // 평균 = 총점 / 과목수
		
		sumScore = korScore + mathScore; // 합계 계산
		avgScore = (double)sumScore / 2;
		
		System.out.println("총점: " + sumScore);
		System.out.println("총점: " + avgScore);

	}

}
