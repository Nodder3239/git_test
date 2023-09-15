package input;

import java.util.Scanner;

public class BonusPointTest {

	public static void main(String[] args) {
		// 고객의 이름, 구매 금액을 입력
		// 이름과 구매포인트 출력
		// 구매포인트 = 상품가격 * 포인트적립율
		//입력

		Scanner sc = new Scanner(System.in);
		
		System.out.print("고객의 이름을 입력하세요 : ");
		String customer = sc.nextLine();
		
		
		System.out.print("구매금액을 입력하세요 : ");
		int price = sc.nextInt();  // 사용자 - 금액 입력
		double bonusRatio = 0.02;
		int bonusPoint = 0;
		
		//계산 처리
		bonusPoint = (int) (price * bonusRatio); // 정수형으로 강제 형변환함
		
		//출력
		System.out.println(customer + " 님의 보너스 포인트는 " + bonusPoint + "점 입니다.");

		sc.close();
	}

}
