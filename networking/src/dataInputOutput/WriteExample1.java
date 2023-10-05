package dataInputOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample1 {

	public static void main(String[] args) {
		// 출력 스트림 객체 생성
		try {
			OutputStream os = new FileOutputStream("C:/File/test1.db");

			// 데이터 변수 선언
			byte a = 10;
			byte b = 20;
			byte c = 30;
			// char d = '가'; // 못 읽음
			int d = 97; // 아스키 코드값(문자 출력 - a)

			// db파일에 데이터 쓰기
			os.write(a);
			os.write(b);
			os.write(c);

			os.flush(); // 내부 버터에 잔류하는 바이트를 출력하고 버퍼를 비움
			os.close(); // 출력 스트림을 닫아서 사용한 메모리를 해제

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
