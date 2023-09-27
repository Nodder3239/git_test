package dataInputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest2 {

	public static void main(String[] args) {
		//close() 사용하지 않는 방법 - 
		String originFile = "C:/File/bird-1.jpg";	//원본파일
		String copyFile = "C:/File/bird-2.jpg";		//사본파일
		long start, end;	//시간 측정 변수
		
		try(InputStream is = new FileInputStream(originFile);	
			OutputStream os = new FileOutputStream(copyFile)) {
				start = System.currentTimeMillis();	//복사 전 시간
			
			
			while(true) {
				int num = is.read();	//읽은 바이트 수
				if(num == -1) break;
				os.write(num);	//파일에 쓰기
			}
			/*
			byte[] data = new byte[1024];
			while(true) {
				int readBytes = is.read(data);	//데이터를 읽은 바이트 수
				if(readBytes == -1) break;
				for(int i=0; i<readBytes; i++) {
					os.write(data[i]);
				}
			}
			*/
			os.flush();	//버퍼 비우기
			end = System.currentTimeMillis();	//복사 후 시간
			System.out.println("복사 소요 시간 : " + (end-start) + "ms");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
