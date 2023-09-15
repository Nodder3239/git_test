package methods;

public class MathTest2 {

	public static void main(String[] args) {
		// 주사위 10번 던지기
		
		for(int i = 1; i<=10; i++) {
		int dice = (int)(Math.random()*6+1);
		System.out.println(dice);
		}
		
		// 배열에서 문자열 무작위 추출
		String[] word = {"나", "너", "우리", "나라"};
		
		// 전체 출력
		
		
		for(int j=0;j<word.length; j++) {
		System.out.println(word[j]);
		}
		
		// 무작위
		int idx = (int)(Math.random()*word.length);
		System.out.println(word[idx]);
		
		
	}

}
