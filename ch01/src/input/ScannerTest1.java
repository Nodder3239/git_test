package input;

import java.util.Scanner;  // 9줄 Scanner 클릭해서 import 가져오기

public class ScannerTest1 {

	public static void main(String[] args) {
		// 입력 처리 - Scanner 클래스 사용
		// 문자열 - nextLine()
		// 숫자 - nextInt()
		
		Scanner scanner = new Scanner(System.in);
		
		// String name = "이상현"; // 직접 입력, 하드코딩
		
		
		System.out.print("이름 입력: ");
		String name = scanner.nextLine();	// 문자열 입력	

		System.out.print("나이 입력: ");
		int age = scanner.nextInt();	// 숫자 입력	int & nextInt
		
		System.out.println("이름: " + name + ", 나이: " + age);
		
		scanner.close(); // 시스템 닫기
		
	}

}
