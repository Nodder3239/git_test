package whileExample;

public class WhileIfBreak {

	public static void main(String[] args) {
		// 반복 조건문(while ~ if ~ break)
		/*
	 	while(true){
		if(){
		break;
		}}
		*/
		// 1부터 10까지 출력

		int i = 0;
		while(true) { 				//무한 반복
			i++;
			System.out.print(i + " ");
			if (i == 10) break; 	//탈출,
		}			// 중괄호 블럭은 실행문이 한 줄일 때 생략 가능
		
	}

}
