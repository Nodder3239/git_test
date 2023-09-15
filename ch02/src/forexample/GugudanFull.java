package forexample;

public class GugudanFull {

	public static void main(String[] args) {
		// 구구단 전체 출력
		
		int i;
		int j;
		for(i = 2; i <= 9; i++){
			for(j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
		System.out.println();
		}
		
		// 단보다 곱하는 수가 작거나 같은 경우까지만 출력
		int i2;
		int j2;
		for(i2 = 2; i2 <= 9; i2++){
			for(j2 = 1; j2 <= i2; j2++) {
				System.out.println(i2 + " X " + j2 + " = " + i2 * j2);
			}
		System.out.println();
		}
		
	}

}
