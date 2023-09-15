package constant;

public class PrintFormat {

	public static void main(String[] args) {
		// printf("문자열 포맷", 객체 변수)
		// 대응 서식 : 정수 - %d, 실수 - %f, 문자 - %s
		// decimal(10진법)
		// 서식 문자 : 줄 바꿈 문자 - \n, tab - \t
		
		int year = 2023;		
		System.out.println("올해는 " + year + "년입니다.");
		System.out.printf("올해는 %d년입니다.\n", year);

		float weight = 63.7F;
		System.out.printf("그것의 무게는 %.2fkg입니다.\n", weight); // %.nf - 소수점 아래 n자리까지

		String nick = "얼음공주";
		System.out.printf("그녀의 별명은 %s입니다.\n", nick);
		
		// '\t' 사용
		int num = 0; // 0으로 초기화
		String table = ""; // 빈 문자열로 초기화
		table += "===================\n";
		table += "이름\t나이\t나라\n";
		table += "===================\n";
		table += "이상현\t31\t한국\n";
		table += "흐루꾸\t22\t없음\n";
		table += "===================\n";
		System.out.println(table);
	}

}
