package bufferedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("word.txt"))) {

			String data;
			String[] word = null;
			while ((data = br.readLine()) != null) {

				word = data.split(" ");
			}
			Scanner sc = new Scanner(System.in);
			int n = 1; // 문제번호
			double start, end;
			System.out.println("타자 연습 게임 - 준비되면 [Enter]");
			sc.nextLine(); // 엔터
			start = System.currentTimeMillis();

			while (n < 11) {
				System.out.println("문제 " + n);
				int rnd = (int) (Math.random() * word.length);
				String question = word[rnd];
				System.out.println(question); // 문제 출제

				String answer = sc.nextLine();
				if (question.equals(answer)) {
					System.out.println("통과!");
					n++;
				} else {
					System.out.println("오타! 다시 도전!");
				}
			}
			end = System.currentTimeMillis();
			System.out.printf("게임 소요 시간: %.2f초\n", (end - start) / 1000);
			System.out.println("프로그램 종료");
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
