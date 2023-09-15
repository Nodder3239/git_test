package operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		// 논리 연산자
		// &&(엠퍼샌드) : and, 두 항이 모두 참인 경우에만 결과값이 참 - 논리곱		
		System.out.println((4 < 5) && (10 == 11)); // false

		//||(바 2개) : or, 두 항 중 하나만 참이어도 참 - 논리합
		System.out.println((4 < 5) || (10 == 11)); // true, Dead code : 앞 항이 true니까 뒷 항은 보지도 않는다

		// ! : not, 항이 거짓이면 참 - 논리 부정
		System.out.println(!(10 == 11)); // true
		
		
	}

}
