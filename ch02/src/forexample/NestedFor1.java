package forexample;

public class NestedFor1 {

	public static void main(String[] args) {
		// 중첩 for문(nested for)
		/*
			for(초기값1, 종료값1, 증감값1){
		  		for(초기값2; 종료값2; 증감값2){
		  		실행문;
		  		}
		 	}
		 		 */
		// 5행 5열에 "*" 출력
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
			System.out.print("* ");
			}
			System.out.println();  // 한 줄 띄움
		}
		
		System.out.println();  // 한 줄 띄움
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
			System.out.print("* ");
			}
			System.out.println();  
		}
		System.out.println();
	
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {
			System.out.print("* ");
			}
			System.out.println();  
		}
		
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
			System.out.print("* ");
			}
			System.out.println();  
		}
		
		System.out.println();

		

		
		
	}

}
