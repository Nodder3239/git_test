package data;

public class TypeConversion {

	public static void main(String[] args) {
		// 형 변환 - 1. 자동 형변환, 2. 강제 형변환
		// 자동 형변환
		int iNum = 20;
		float fNum = iNum;  // 실수형(4byte) >> 정수형(4byte) : 자동
		
		System.out.println(iNum); //20
		System.out.println(fNum); //20.0

		double dNum; // 실수형 8byte
		dNum = iNum + fNum; // 자동(묵시적)
		
		System.out.println(dNum); //40.0

		System.out.println("==================");
		
		// 강제 형변환 (cast)
		double dNum1 = 1.2;
		float fNum2 = 0.9f;
		
		int iNum2 = (int) dNum1 + (int) fNum2; // 1 + 0 = 1
		System.out.println(iNum2);
		
		int iNum3 = (int) (dNum1 + fNum2); // (int) (1.2 + 0.9) = 2
		System.out.println(iNum3);
	}

}
