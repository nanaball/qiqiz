package a6_field;

import a5_field.A;

public class C {
	
	public C() {
		A a = new A();
		a.field1 = 100; 	// public
		// a.field2 = 200; 	// default (다른 패키지라 안됨)
		// a.field3 = 400; 	// private (다른 클래스라 안됨)
		
		a.publicMethod();
	
	}

}
