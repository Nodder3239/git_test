package dataInputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest {

	public static void main(String[] args) {
		String originFile = "C:/File/bird-1.jpg"; // 원본파일
		String copyFile = "C:/File/bird-2.jpg"; // 사본파일
		try {
			InputStream is = new FileInputStream(originFile);
			OutputStream os = new FileOutputStream(copyFile);

			while (true) {
				int num = is.read(); // 읽은 바이트 수
				if (num == -1)
					break;
				os.write(num); // 파일에 쓰기
			}
			os.flush(); // 버퍼 비우기
			is.close();
			os.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
