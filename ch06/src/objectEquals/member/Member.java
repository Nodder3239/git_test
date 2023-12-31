package objectEquals.member;

public class Member {
	private String memberId;	//사번
	private String name; 		//이름
	
	public Member(String memberId, String name) {
		this.memberId = memberId;
		this.name = name;
	}

	//hashCode() 재정의
	@Override
	public int hashCode() {	//멤버이름.hashCode()를 반환함
		return memberId.hashCode();
	}
	
	//equals() 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;	//member형으로 다운 캐스팅
			if(this.memberId.equals(member.memberId) &&
				this.name.equals(member.name)) {
				return true;	//외부 입력된 회원아이디와 이미 생성된 회원아이디와 일치하면 
			}
		}
		return false;
	}
	
	//객체의 문자열 정보 - toString() 재정의
	@Override
	public String toString() {
		return memberId + ", " + name;
	}
	
	
	
}
