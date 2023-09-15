package arrays;

public class ArrayTest2 {

	public static void main(String[] args) {
		//배열의 선언 및 사용
		/*String[] array = new String[n]; // 비어있는 배열 크기 n선언
			값 입력(저장)
		*/
		
		//크기가 4인 cars 배열 선언
		String[] cars = new String[4]; 
		
		//입력(저장)
		cars[0] = "Sonata";
		cars[1] = "Moring";
		cars[2] = "K7";
		//cars[3] = "K9"; 값이 비어있으면 null 출력
		
		//특정 위치(1번 인덱스) 출력
		System.out.println(cars[1]);
		
		//전체 출력
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}
