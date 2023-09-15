package methods;

public class OneUpTest1 {

	//1증가하는 함수 정의
	//지역변수의 생명주기(scope) - 함수나 제어문의 블럭 안에서 생성되고
	//						  , 호출된 뒤에(블럭을 벗어나면) 소멸한다.
	public static int oneUp() {
		int x = 1; //지역변수
		x++; // x +=1
		return x;
				
	}
	
	public static void main(String[] args) {
		System.out.println(oneUp()); //2
		System.out.println(oneUp()); //2, 호출할 때마다 1부터 시작
		
		////int x = 10;
		//System.out.println(x);  // x는 소멸한 변수

	}

}
