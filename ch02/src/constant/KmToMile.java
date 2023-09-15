package constant;

import java.util.Scanner;

public class KmToMile {

	public static void main(String[] args) {
		// km를 입력받아서 mile로 출력하는 프로그램
		// 변환 상수 : 1mile = 1.609344km
		// 변수 - kph(km per hour), mph(mile per hour)
		final double RATE_MTK = 1.609344;
		double mph;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 구속을 입력하세요(km/h) : ");
		double kph = sc.nextDouble();

		
		//연산
		mph = kph / RATE_MTK;
		
		//출력
		System.out.printf("공의 속도는 %.2fmile/h입니다.", mph);
		sc.close();
	}

}
