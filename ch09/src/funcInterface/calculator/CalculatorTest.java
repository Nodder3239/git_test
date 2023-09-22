package funcInterface.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// Calculator 변수 선언 - add
		Calculator add, sub, mul, div;
		int num1 = 10, num2 = 5;
		
		// calculate()를 구현 - 람다식
		// 덧셈 구현
		add = (x, y) -> x + y;
		int value1 = add.calculate(num1, num2);
		
		// 호출
		System.out.println(value1);

		// 뺄셈 구현
		sub = (x, y) -> x - y;
		int value2 = sub.calculate(num1, num2);
		
		// 호출
		System.out.println(value2);
		
		// 곱셈 구현
		mul = (x, y) -> x * y;
		int value3 = mul.calculate(num1, num2);
		
		// 호출
		System.out.println(value3);
		
		// 나눗셈 구현
		div = (x, y) -> x / y;
		int value4 = div.calculate(num1, num2);
		
		// 호출
		System.out.println(value4);
		

	}

}
