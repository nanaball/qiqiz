package c8_comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {

		// Fruit 과일 을 정렬할 비교 기준을 정의한 클래스
		DescendingComparator com = new DescendingComparator();
				
		TreeSet<Fruit> treeSet = new TreeSet<>(com);
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("딸기", 1500));
		treeSet.add(new Fruit("수박", 10000));
		System.out.println(treeSet);
		
		
		Comparator<Fruit> compare = new Comparator<Fruit>() {
			@Override
			public int compare(Fruit o1, Fruit o2) {
				return o1.getName().hashCode() - o2.getName().hashCode();
			}
		};

		TreeSet<Fruit> treeSet2 = new TreeSet<>(compare);
		treeSet2.add(new Fruit("포도", 3000));
		treeSet2.add(new Fruit("딸기", 1500));
		treeSet2.add(new Fruit("수박", 10000));
		// 가나다 순으로 정렬
		System.out.println(treeSet2);
		
		
		Integer[] arrays = new Integer[] {10,70,90,80};
		Arrays.sort(arrays);
		// 오름차순 정렬
		System.out.println(Arrays.toString(arrays));
		
		// 기본타입으로는 정렬 할 수 없고 참조 타입으로 가능
		Arrays.sort(arrays, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;		// 역순 정렬
			}
		});
		// 내림차순 정렬
		System.out.println(Arrays.toString(arrays));
		
		
		
	} // end main

}
