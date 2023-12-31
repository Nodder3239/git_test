package hiding.accounts;

/*
	public - 패키지에 관계없이 외부 클래스 어디에서나 접근 가능
	protected - 같은 패키지 내부와 상속 관계의 클래스에서만 접근
				(다른 패키지에서도 가능)
	없는 경우(default) - 같은 패키지 내부에서만 접근 가능
	private  - 같은 클래스 내부 가능, 그 외 접근 불가
 */


	//은행 통장 계좌 자료형 생성
	//정보 은닉 및 캡슐화 - private 사용
	public class Account {

	//필드
	private String ano; //계좌 번호
	private String owner; //계좌주
	private int balance; //잔고
	
	//기본 생성자
	public Account() {}
	
	//매개변수 있는 생성자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;  // this 키워드 - 자신의 메모리를 가리킴, 다른 생성자를 호출할 때 사용
	}
	
	//get(), set() 메서드
	//만드는 방법 : set+필드이름() - 필드 이름 첫글자 대문자
	public void setAno(String a) { 
		ano = a;
	}
	
	public String getAno() {
		return ano;
	}
	public void setOwner(String own) { 
		owner = own;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setBalance(int bal) { 
		balance = bal;
	}
	
	public int getBalance() {
		return balance;
	}
	
	
	
}
