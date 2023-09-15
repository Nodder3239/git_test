package typingGame;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		// 영어 단어가 랜덤하게 화면에 출제되면 타이핑하기
		// 오타가 없으면 "통과", 오타가 있으면 "다시 도전"
		// 10문제 수행
		// 시간 측정
		
		String[] words = {"ant", "bear", "chicken", "cat", "dog", "elephant", "frog", "horse", "monkey", "tiger"};
		
		
		Scanner sc = new Scanner(System.in);
		int n = 1; //문제번호
		double start, end;
		System.out.println("영어타자 게임, 준비되면 엔터");
		sc.nextLine(); //엔터
		start = System.currentTimeMillis();
		
		while(n < 11) {	
			int rand = (int) (Math.random()*words.length);
			System.out.println("문제" + n);
			String question = words[rand]; //출제된 단어
			System.out.println(question); //사용자 입력
			//단어 입력
			String answer = sc.nextLine();
			
			if(question.equals(answer)) {
				System.out.println("통과!");
				n++; //다음 문제 출제
			}else {
				System.out.println("오타! 다시 도전!");
			}
			
		}
		end = System.currentTimeMillis();
		System.out.printf("게임 시간은 %.2f초입니다.\n", (end-start)/1000);
		System.out.println("프로그램 종료!");

		sc.close();
	}
	
}
