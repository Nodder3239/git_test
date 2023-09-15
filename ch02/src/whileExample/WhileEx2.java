package whileExample;

public class WhileEx2 {

	public static void main(String[] args) {
		// 1부터 10까지의 합계
		int n = 0;
		int sum = 0;
		while ( n < 10) {
		n++;
		sum += n; // sum = sum + n;
		System.out.println("n=" + n + ", sum=" + sum);
		}
		System.out.println("합계: " + sum);
	}

}

