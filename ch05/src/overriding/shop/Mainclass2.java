package overriding.shop;

public class Mainclass2 {

	public static void main(String[] args) {
		// 자동 형 변환 - 부모형으로 객체 생성
		HeadShop shop1 = new Shop1();
		shop1.비빔밥();
		
		System.out.println("----------------");
		
		HeadShop shop2 = new Shop2();
		shop2.비빔밥();
		
		int iNum = 10;
		double dNum;
		
		dNum = iNum;
		System.out.println(dNum);

		//iNum = dNum; 에러
		iNum = (int)dNum; //강제 형 변환
		System.out.println(iNum);

	}

}
