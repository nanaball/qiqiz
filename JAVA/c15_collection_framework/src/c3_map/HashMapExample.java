package c3_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("최기근", 100);
		map.put("이준호", Integer.valueOf(59));
		map.put("김규민", 97);
		map.put("박진성", 70);
		System.out.println(map);
		
		// key값은 중복x
		map.put("이준호", 89);
		System.out.println(map);
		
		int score = map.get("최기근");
		System.out.println("최기근 점수 : " + score);
		int size = map.size();
		System.out.println("저장된 entry 크기 : " + size);
		
		// null 값을 int에 넣을 수 없으니까  java.lang.NullPointerException
		// score = map.get("이기근");
		
		Integer score2 = map.get("이기근");
		System.out.println(score2);
		
		// 동일한 key값이 entry 삭제
		map.remove("이준호");
		System.out.println(map.size());
		System.out.println(map);
		
		boolean isChecked = map.containsKey("이준호");
		System.out.println("key 존재 : " + isChecked);
		
		isChecked = map.containsValue(100);
		System.out.println("value : " + isChecked);
		
		// import : java.util.Map.Entry 
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		
		// import : java.util.Iterator
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		
		// 일반적으로 이렇게 사용하는 경우 거의x
		while(iterator.hasNext()) {
			Entry<String, Integer>entry = iterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+":"+value);
		}
		
		System.out.println(map);
		System.out.println("==============================");
		
		// key 묶음
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			int value = map.get(key);
			System.out.printf("key : %s = value : %d,  ", key, value);
		}
		System.out.println();
		
		// value 묶음
		Collection<Integer> values = map.values();
		for(Integer value : values) {
			System.out.print(value + ", ");
		}
		System.out.println();
		
		map.clear();	// 전제 entry 삭제
		System.out.println(map.size());
		isChecked = map.isEmpty();
		System.out.println("isEmpty : " + isChecked);
		
		// 순서보장
		System.out.println("================================");
		Map<String, Integer> linkedMap = new LinkedHashMap<>();
		linkedMap.put("최기근",100);
		linkedMap.put("김유신",99);
		linkedMap.put("제임스 고슬링",98);
		linkedMap.put("리누스 토발즈",99);
		linkedMap.put("빌게이츠",100);
		System.out.println(linkedMap);
		
		
		
		
	} // end main
}
