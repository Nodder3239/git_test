package ifExample;

import java.util.Scanner;

public class ScorePointTest {

	public static void main(String[] args) {
		// 점수에 따른 학점 출력 프로그램
		// 변수 - 점수(score, int), 학점(grade, String)
		// A 90점 이상, B 80, C 70, D 60, F 60 미만
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		char grade;  //char - 한 문자 (홑따옴표)
	
		if(score >= 90 && score <= 100) {
			grade = 'A';
		}
		else if (score >= 80 && score < 90) {
			grade = 'B';
		}
		else if (score >= 70 && score < 80) {
			grade = 'C';
		}
		else if (score >= 60 && score < 70) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.println(grade + "학점 입니다.");		
		sc.close();
		
	}
}


