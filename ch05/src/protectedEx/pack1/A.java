package protectedEx.pack1;


public class A {
	//protected - 다른 패키지는 접근불가, 같은 패키지 내부나 다른 패키지여도 상속 관계는 가능
	protected String field;
	
	protected A(){}
	
	protected void method() {}
}
