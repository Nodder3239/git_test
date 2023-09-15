package arrays;

public class FindMaxValue {

	public static void main(String[] args) {
		// 배열에서 최대값 찾기
		// 1. 최대값 설정 - 0번 인덱스
		// 2. 전체를 반복하면서 최대값과 비교해서 최대값보다 크면 그 값을 최대값으로 변경
		int[] arr = new int[] {1, 5, 8, 3, 2};
		int maxVal = arr[0];   // 1
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		
		//최대값 출력
		System.out.println("최대값 : " + maxVal);
		
		//최소값
		
		int minVal = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < minVal) {
				minVal = arr[i];
			}
		}
		//최소값 출력
		System.out.println("최소값 : " + minVal);	
		
	}

}
