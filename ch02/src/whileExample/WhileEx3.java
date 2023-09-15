package whileExample;

public class WhileEx3 {

	public static void main(String[] args) {
		// 1부터 10까지 출력
		int i = 0;
		while(true) {
			i++;
			if (i > 10) break;  // 순서가 바뀌면서 =대신 > 씀
			System.out.print(i + " ");
		}
	}
}
