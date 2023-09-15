package arrays;

public class ArrayGugudan {
	public static void main(String[] args) {
		int dan = 3;
	
		for (int i=1; i<10; i++) {
			System.out.println(dan + " X " + i + " = " + dan*i);
		}
		
		System.out.println("===============================");
		
		//배열을 사용하여 구구단 저장 및 출력
		int[] gugudan = new int[9];
		//gugudan[0] = dan * 1;
		//System.out.println(gugudan[0]);
		
		//gugudan 배열에 저장 및 출력
		for (int i=0; i<gugudan.length; i++) {
			gugudan[i] = dan * (i+1);
			System.out.println(dan + " X " + (i+1) + " = " + gugudan[i]);
		}
	
		//전체 구구단 해보세요
		
		
		
		System.out.println("===============================");
		//배열 복사
		int[] gugudan2 = new int[9];
		
		//1.일반 복사
		for(int i=0; i<gugudan2.length; i++) {
			gugudan2[i] = gugudan[i];
		}
		
		for(int i=0; i<gugudan2.length; i++) {
		System.out.print(gugudan2[i] + " ");
		}
		
		System.out.println("\n===============================");
		
		//2. Object 클래스의 clone()
		int[] gugudan3 = gugudan2.clone();
		
		for(int i=0; i<gugudan3.length; i++) {
			System.out.print(gugudan3[i] + " ");
		}
		
	}
}
