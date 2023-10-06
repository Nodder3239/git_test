package continueExam;

public class ContinueTest2 {

	public static void main(String[] args) {
		//1. 일반 for문 : 1부터 10까지 자연수 중 홀수만 출력
		for(int i=1;i<=10;i++) {
			if(i%2 == 1)
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		
		for(int i=1;i<=10;i=i+2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i=1;i<=5;i++) {
			System.out.print(i*2-1 + " ");
		}
		
		System.out.println();
		//2. continue를 사용해서 1~10까지 자연수 중 홀수만 출력
		for(int i=1;i<=10;i++) {
			if(i%2 == 0) 
				continue;
			System.out.print(i + " ");
			
		}
		
		
	}

}
