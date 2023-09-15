package switchExample;

import java.util.Scanner;

public class SwitchCaseTest {
	public static void main(String[] args) {
		// switch(조건) { // 정해진 값으로 떨어질 때
		
		// 랭킹에 따른 메달 출력
		// 1 - 금메달, 2 - 은메달, 3 - 동메달
		Scanner sc = new Scanner(System.in);
		System.out.print("순위를 입력하세요 : ");
		int rank = sc.nextInt();
		
		switch(rank) {
		case 1 : 
			System.out.println("금메달입니다.");
			break;
		case 2 : 
			System.out.println("은메달입니다.");
			break;
		case 3 : 
			System.out.println("동메달입니다.");
			break;
		default :  //case에 없는 경우 처리
			System.out.println("메달이 없습니다.");
			break;
		}
		sc.close();
	}
}
