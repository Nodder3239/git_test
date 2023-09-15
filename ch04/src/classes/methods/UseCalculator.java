package classes.methods;

import classes.Calculator;  // 다른 package에 있으면 import 해야함

public class UseCalculator {

	public static void main(String[] args) {
		// Calculator 객체 생성
		Calculator calc = new Calculator();
		int num1 = 10, num2 =2;
		int addVal = calc.add(num1, num2);
		int subVal = calc.sub(num1, num2);
		int mulVal = calc.mul(num1, num2);
		int divVal = calc.div(num1, num2);
		
		System.out.println("두 수의 합: " + addVal);
		System.out.println("두 수의 차: " + subVal);
		System.out.println("두 수의 곱: " + mulVal);
		System.out.println("두 수의 나누기: " + divVal);
	}

}
