package lotto;

import java.util.Arrays;

public class LottoTest {

	public static void main(String[] args) {
		// 로또 번호 생성기
		// 1~45 -> 6개 생성
		// 배열의 크기가 6개인 lotto 선언
		
		int[] lotto = new int[6];
		
		lotto[0] = (int) (Math.random()*45 + 1);
		System.out.println(lotto[0]);
		
		//6개를 동시에 생성
		//
		for(int i = 0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1);
			
			//중복 문제 해결 - 중첩 for
			for(int j = 0; j<i; j++) {
				if(lotto[i] == lotto[j])
					i--; // 이전 인덱스로 이동
				}	
			}
			for(int i = 0; i < lotto.length; i++) {
				System.out.print(lotto[i] + " ");
			}
			System.out.println();
			
			LottoTest lottoTest = new LottoTest();
			System.out.println(lottoTest);
			
			System.out.println(Arrays.toString(lotto));
		
	}

}
