package ex01_nested_class;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		A a = new A();
		a.methodA();
		
		System.out.println("-------------------------");
		// A라는 인스턴스가 없어서 B가 안됨 - A라는 정적멤버에서 바로 시작이라
		// A.B b = new A.B();
		A.B b = a.new B();
		b.methodB();
		
		System.out.println("--------------------------");
		
		A.C c = new A.C();
		c.field1 = 3;
		c.methodC();
		
		A.C.field2 = 30;
		A.C.method2();
		
		System.out.println("---------------------------");
		Map<String, Integer> map = new HashMap<>();
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		
		
	}

}
