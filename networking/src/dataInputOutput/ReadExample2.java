package dataInputOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) {
	//입력 스트림 객체 생성
		try {
			InputStream is = new FileInputStream("C:/File/test2.db");
			
			byte[] data = new byte[1024];	//data를 읽을 배열 생성
			
			while(true) {
				int num = is.read(data);
				//System.out.println(num);
				if(num == -1) break;	//data가 없음
				for(int i=0; i<num; i++) {
					System.out.print(data[i] + " ");
				}
			}
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
