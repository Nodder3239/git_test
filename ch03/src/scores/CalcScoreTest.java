package scores;

import java.util.Scanner;

public class CalcScoreTest {

	public static void main(String[] args) {
		// 성적 처리 프로그램
		// 입력시 잘못된 입력이 있는 경우 - 예외 처리
		// try ~ catch 구문 사용
		Scanner sc = new Scanner(System.in);
		int studentCount = 0; // 학생 수 
		int[] scores = null; // 점수 객체 초기화
		boolean sw = true; //상태 변수
		
		while(sw) {
			try { //try
		System.out.println("=================================================");
		System.out.println("1.학생 수 | 2.점수 입력 | 3.점수 리스트 | 4.분석 | 5.종료");
		System.out.println("=================================================");
		
		//문자를 숫자로 변환 (String, integer(x int))
		int menu = Integer.parseInt(sc.nextLine());
		
		if(menu == 1) {
			System.out.print("학생 수>");
			studentCount = Integer.parseInt(sc.nextLine());
			scores = new int[studentCount]; //학생 수는 배열의 크기이다.
		}
		else if(menu == 2) { // 점수 저장
			for(int i = 0; i < scores.length; i++) {
				System.out.print("점수 입력> [" + i + "]");
				scores[i] = Integer.parseInt(sc.nextLine());
			}

		}
		else if(menu == 3) { // 점수 리스트
			for(int i = 0; i < scores.length; i++) {
				System.out.println("[" + i + "]" + scores[i]);
			}
		}
		else if(menu == 4) { // 통계 분석
			int sumVal = 0;
			int maxVal = scores[0];
			
			for(int i = 0; i < scores.length; i++) {
				sumVal += scores[i];
				if(scores[i] > maxVal) {
					maxVal = scores[i];
				}
			}
			double avg = (double)sumVal / scores.length;
			System.out.printf("평균 점수 : %.2f\n", avg);
			System.out.println("최고 점수 : " + maxVal);
			
			
		}
		else if(menu == 5) {
			sw=false;
		}
		else {
			System.out.println("지원되지 않는 기능입니다.");
			}
		}
		catch(Exception e){  // catch 구문
		System.out.println("올바른 입력이 아닙니다. 숫자를 입력해주세요.");
		}

		
		
		/*
		switch (menu) {
		case 1 : 
			System.out.print("학생 수>");
			studentCount = Integer.parseInt(sc.nextLine());
			scores = new int[studentCount];
			System.out.println("학생 수 : " + scores.length);
			break;
		case 2 : 
			System.out.print("점수 입력>");
			for(int i = 0; i < scores.length; i++) {
				System.out.print("점수 입력> [" + i + "]");
				scores[i] = Integer.parseInt(sc.nextLine()); 
				}
			for(int i = 0; i <scores.length; i++) {
				System.out.print("점수 [" + i + "] : " + scores[i] + " | ");
			}
			System.out.println();
			break;
		case 3 : 
			System.out.println("점수 리스트>");
			for(int i = 0; i < scores.length; i++) {
				System.out.println("[" + i + "]" + scores[i]);
			break;
		case 4 :
			System.out.print("분석>");
			int sumVal = 0;
			int maxVal = scores[0];
			
			for(int i = 0; i < scores.length; i++) {
				sumVal += scores[i];
				if(scores[i] > maxVal) {
					maxVal = scores[i];
				}
			}
			double avg = (double)sumVal / scores.length;
			System.out.printf("평균 점수 : %.2f\n", avg);
			System.out.println("최고 점수 : " + maxVal);
			break;
		case 5 :
			sw=false;
			break;
		default :
			System.out.println("지원되지 않는 기능입니다.");
			break;
		}
		*/
		
		} 	// while 끝
		System.out.println("프로그램 종료"	);
		sc.close();
	}

}
