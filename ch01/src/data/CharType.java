package data;

public class CharType {

	public static void main(String[] args) {
		// 문제 자료형 - char, String
		// 복제 Ctrl+Alt+↓
		// ASCII(American Standard Code for Information Interchange) 
		// https://www.unicode.org/charts/PDF/UAC00.pdf // 한글 유니코드
		char alpha = 'A';
		System.out.println(alpha);
		System.out.println((int)alpha); // 65(아스키 코드값), 형 변환
		
		int alpha2 = 66;
		System.out.println(alpha2);
		System.out.println((char)alpha2);

		//유니코드 - 16bits - 2bytes
		char uniCode1 = '한';	//한 문자 - 홑따옴표
		System.out.println(uniCode1);
		
		char uniCode2 = '\uD55C';	// 역/u + 한글 유니코드 16진수 표기
		System.out.println(uniCode2);	// 한
		
		char uniCode3 = '\uAE00';
		System.out.println(uniCode3);	// 글
		
		
	}

}
