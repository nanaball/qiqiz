package c2_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<String> s1 = new HashSet<>();
		s1.add("A");
		// s1.add(0,"B"); 순서가 없음 - index번호도 없음
		s1.add("D");
		s1.add("B");
		s1.add("C");
		
		boolean isAdd = s1.add("C");
		System.out.println(s1);
		System.out.println("isAdd : " + isAdd);

		// 반복자 내부에 저장하고 있는데이터를 token 처럼 꺼내옴
		Iterator<String> iterator = s1.iterator();
		while(iterator.hasNext()) {
			String s = iterator.next();
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println(s1.contains("B"));
		
		Set<String> s2 = new HashSet<>();
		s2.add("A");
		s2.add("D");
		s2.add("E");
		System.out.println(s2);
		
		Set<String> s3 = new HashSet<>(s1);
		System.out.println(s3);
		System.out.println(s3 == s1);
		
		// s3 : A B C D
		// s2 : A D E
		// 중복을 제외한 합집합
		s3.addAll(s2);
		System.out.println(s3);
		
		Set<String> s4 =  new HashSet<>(s1);
		// s4 : A B C D 
		// s2 : A D E
		s4.retainAll(s2);
		System.out.println("s4 : " + s4);
		
		boolean isDeleted = s1.remove("A");
		System.out.println("isDeleted : " + isDeleted);
		System.out.println(s1);
		
		for(String s : s1) {
			System.out.print(s + " ");
			if(s.equals("B")) {
				// java.util.ConcurrentModificationException 
				// s1.remove(s); = 항목의 크기가 달라져서 오류가 발생함 (list도 동일)
				// s1.add("E"); = 항목의 크기가 달라져서 오류가 발생함 (list도 동일)
			}
			
		} // end for
		
		Set<String> hSet = new HashSet<>();
		hSet.add("apple");
		hSet.add("banana");
		hSet.add("kiwi");
		hSet.add("melon");
		System.out.println(hSet);
		
		// 들어간 순서를 보장하는 Set
		Set<String> linkedSet = new LinkedHashSet<>();
		linkedSet.add("apple");
		linkedSet.add("banana");
		linkedSet.add("kiwi");
		linkedSet.add("melon");
		System.out.println(linkedSet);
		
		
	} // end main
	

}
