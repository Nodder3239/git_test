package ifExample;

import java.util.Scanner;

public class Seats {

	public static void main(String[] args) {
		// 입장객 수에 따른 좌석의 줄(행) 수 계산
		// 변수 - customer(입장객 수), column(열 수), row(줄 수)
		
		Scanner sc = new Scanner(System.in);  //입력 개체 sc 생성
		System.out.print("입장객 수 입력 : ");
		int costomer = sc.nextInt();
		System.out.print("좌석 열 수 입력 : ");
		int column = sc.nextInt();
		int row;
		
		
		//연산 처리(if ~ else문)
		if (costomer % column == 0) {    //나누어 떨어지면
			row = costomer / column;     //row = 몫
		}
		else {							 //나머지가 있으면
			row = costomer / column + 1; //row = 몫 + 1
		}
		
		System.out.println(row + "줄이 필요 합니다.");
		sc.close();
	}

}
