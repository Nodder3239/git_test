package dates;

import java.text.SimpleDateFormat; //CTRL + space
import java.util.Date;  //import

public class DateTest {

	public static void main(String[] args) {
		// Date 객체 - Date, Calendar, Local/Date/Time
		
		Date date = new Date();
		System.out.println(date);
		
		//날짜/시간 포맷 - "yyyy.MM.dd hh:mm:ss a"
		SimpleDateFormat now = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss a"); // HH 24시, hh 12시
		System.out.println(now.format(date));
	
		
	
	}
	

}
