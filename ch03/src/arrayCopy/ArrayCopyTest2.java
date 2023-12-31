package arrayCopy;

public class ArrayCopyTest2 {

	public static void main(String[] args) {
		// 배열 복사하기 - 문자형 복사
		char[] arr1 = {'N', 'E', 'T'};
		
		//1.복사
		char[] arr2 = new char[3];
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		
		//1-2. 역순 복사
		char[] arr3 = new char[3];
		
		for(int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[2-i];
		}
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		
		System.out.println();
		
		
		//2.clone()
		char[] arr4 = arr1.clone();
		
		for(int i=0; i<arr4.length; i++) {
			System.out.print(arr4[i] + " ");
		}

	}

}
