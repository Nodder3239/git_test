package collection.list;

import java.util.Vector;
import java.util.List;

public class VectorTest {

	public static void main(String[] args) {

		List<String> vegeList = new Vector<>();

		//자료 생성(추가 - Create: add())
		vegeList.add("양파");	//0번 인덱스에 저장
		vegeList.add("마늘");	//1번
		vegeList.add("감자");	//2번
		
		if(vegeList.contains("양파")) {
			vegeList.remove("양파");
		}
		
		//리스트 객체의 개수
		System.out.println("총 객체 수: "+vegeList.size());
		
		
		//전체 조회
		for(String vege : vegeList)
			System.out.println(vege);
	}

}
