package whileExample;

public class WhileEx1 {

	public static void main(String[] args) {
		// while 반복문
		/*  i = 0 ; //초기값
			while(종료조건){
			실행문1;
			증감값; (i++)
			}
		*/
		//초기값, 종료조건, 증감값(1증가, 1감소)
		int i = 0;
		while ( i < 10) {
		i++;         // i = i + 1;
		System.out.println(i);
		}
		
	}

}
