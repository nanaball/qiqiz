package a7_encapsulation;

public class TEST {
	
	public static void main(String[] args) {
		// Test.main(null);
		System.out.println(args);
		
		for(String s : args) {
			System.out.println(s);
		}
		
		Student choi = new Student();
		choi.name = "최기근";
		// choi.age = -20;
		choi.setAge(-20);
		// choi.Grade = 16;
		choi.setGrade(16);
		
		// System.out.println(choi.age);
		System.out.println(choi.getAge());
		System.out.println(choi.getGrade());
		
		
	} // end main

}
