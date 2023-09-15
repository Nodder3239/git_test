package ifExample;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		// 두 수 중 큰 값을 찾는 프로그램
		
		Scanner scr = new Scanner(System.in);
		System.out.print("첫 번째 숫자: ");
		int n1 = scr.nextInt();
		System.out.print("두 번째 숫자: ");
		int n2 = scr.nextInt();

		/*
		//연산1. if ~ else 구문
		int max0;
		
		if (n1 > n2) {
			max0 = n1;
		}
		else {
			max0 = n2;
		}
		*/    
		
		//연산2. 조건 연산자
		int max0 = (n1 > n2) ? n1 : n2; 
		System.out.println("두 수 중 큰 값은 " + max0 + "입니다.");
		
		
		scr.close();
	}

}
