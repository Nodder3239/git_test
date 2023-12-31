package inheritance.airplane;

public class SuperSonicAirplane extends Airplane {
	//1 - 일반 비행, 2 - 초음속 비행
	static final int NORMAL = 1; //상수는 관례적으로 static을 붙임
	static final int SUPERSONIC = 2;
	int flyMode = NORMAL;
	
	@Override //메서드 재정의
	public void 비행() {
		if(flyMode == SUPERSONIC) {
			System.out.println("비행기가 초음속 비행합니다.");
		}else {
			super.비행();	//부모 메서드 상속(super 사용)
		} 
	}
}
