package forexample;

public class ForEx2 {
	public static void main(String[] args) {
		// 1부터 10까지 더하기
		int total=0;
		int i;
		
		for(i=1; i<=10; i++) {
			total += i;  // total = total + i
			System.out.println("i=" + i + ", total=" + total);
		}
		System.out.println("합계 : "+ total);
	}
}
