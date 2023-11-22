package a_object.equals;

import a_object.toString.ToStringExample;

public class EqualsExample {

	public static void main(String[] args) {
		/*
		 * eclipse > 윈도우 > preferences > java > code style > code template > code > method body > TODO code 어쩌고 저쩌고 edit 눌러서 제거
		 */
		
		Member member = new Member("id001");
		Member member1 = new Member("id002");
		Member member2 = new Member("id001");
		
		// 주소값 비교
		System.out.println(member == member1);
		System.out.println(member == member2);
	
		// 두 객체간의 의미있는 데이터를 비교  
		System.out.println(member.equals(member1));
		System.out.println(member.equals(member2));
		System.out.println(member.equals(null));
		System.out.println(member.equals(new ToStringExample()));

	}

}
