package forexample;

public class ContinueTest {

	public static void main(String[] args) {
		
		int total=0;
		int n;
		
		for(n=1; n<=100; n++) {
			if(n%2==0)
				continue;
			total += n;
		}
		System.out.println("1부터 10까지의 홀수의 합은 "+ total + "입니다.");
	}

}
