package arrays;

public class ArrayTest4 {

	public static void main(String[] args) {
		// 실수형 배열의 연산
		// 크기가 5인 실수형 배열 data 선언
		double[] data = new double[5];
		
		//저장
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		double total = 0.0;
		double avg;
		
		
		//전체 조회
		for(int i = 0 ; i < data.length; i++) {
			System.out.println(data[i]);
			total += data[i];
		}
		avg = total/data.length;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	}

}
