package funcInterface.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// Calculator 변수 선언 - add
		Calculator add, sub, mul, div;
		int num1 = 10, num2 = 5;
		
		// calculate()를 구현 - 람다식
		// 덧셈 구현
		add = (x, y) -> x + y;

		// 호출
		System.out.println(add.calculate(num1, num2));

		// 뺄셈 구현
		sub = (x, y) -> x - y;
		
		// 호출
		System.out.println(sub.calculate(num1, num2));
		
		// 곱셈 구현
		mul = (x, y) -> x * y;
		
		// 호출
		System.out.println(mul.calculate(num1, num2));
		
		// 나눗셈 구현
		div = (x, y) -> x / y;
		
		// 호출
		System.out.println(div.calculate(num1, num2));
		

	}

}
