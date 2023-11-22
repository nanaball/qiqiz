package a5_field;

public class A {

	
	public int field1;
	int field2;
	private int field3;
	
	public A() {
		field1 = 10;
		field2 = 20;
		field3 = 30;			
	
		publicMethod();
		defaultMethod();
		privateMethod();
	}
	
	public int publicMethod() {
		// 자기자신 내부에서는 어디서나 접근 가능
		return field3;
	}
	
	// 같은 패키지 내부
	int defaultMethod() {
		return field3;
	}
	
	// 자기자신 내부에서만 가능
	private int privateMethod() {
		return field1;
	}
	
}
