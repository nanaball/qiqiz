package a2_class;

import a1_class.A;
// import a1_class.B; - default 접근 제한은 외부 패키지에서의 접근을 제한한다. 동일한 패키지에서만 가능

public class C {
	
	a1_class.A a = new a1_class.A();
	A a1 = new A();
	
	// B b = new B()
;
}
