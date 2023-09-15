package ifExample;

public class LimitSpeedTest {

	public static void main(String[] args) {
		// if문 (조건문) - 단독 또는 if ~ else 구문
		// 제한 속도(limitSpeed) 50km/h "제한 속도 위반"
		/* 
		 if(비교문){       //비교문이 true이면 실행문1이 작동함.
			실행문1;
			}else{ //false이면 실행문2 작동
			실행문2;
		  }
		 */
		
		/*
	 	int limitSpeed = 55;
		
		if(limitSpeed >= 50) {
			System.out.println("제한 속도 위반! 과태료 10만원 부과 대상!");
		}
		 */
		

		//if ~ else 구문
		int limitSpeed = 45;
		
		if(limitSpeed >= 50) {
			System.out.println("제한 속도 위반! 과태료 10만원 부과 대상!");
		}
			else { 					// else if(limitSpeed < 50) 생략
				System.out.println("안전 속도 준수!");
			
		}
		
		
		
		System.out.println("시속 " + limitSpeed + "km입니다.");


	
	
	}

}
