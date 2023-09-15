package forexample;

public class ForEx1 {

	public static void main(String[] args) {
		// for문
		/* for(초기값; 종료값; 증감값){
			실행문;
			}
		 */
		for(int i=1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("================");
		
		//아스키 코드 값으로 알파벳 출력
		// 'A' - 65, 'a' - 97, 0 - 48
		for(char num = 65; num <= 122; num++) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		//한글 유니코드 값(12593 ~ 12686)
		for(char ch = 12593; ch <= 12639; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		for(char ch = 12640; ch <= 12686; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		
	}

}
