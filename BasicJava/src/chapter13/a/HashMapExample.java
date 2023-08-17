package chapter13.a;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		// Map => HashMap, HashTable, TreeMap, LinkedHashMap(엔트리끼리 연결), Properties
		Map<String,Integer> map = new HashMap<>();
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // 홍길동이 키이므로 값은 나중에 입력한 95로 덮어쓰여짐
		System.out.println(map.size());
		System.out.println(map.get("홍길동"));
		
//		내용 추출 방법
//		1. entry로 접근
		Set<Entry<String, Integer>> entrySet = map.entrySet();
//		원소 추출 방법
//		entrySet.iterator() => while문
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			System.out.println(entry.getKey() + ": "+ entry.getValue());			
		}
//		entrySet => foreach 문
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + ": "+ entry.getValue());					
		}
//		2. keySet으로 접근
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key + ": "+map.get(key));
		}
//		3. value로 접근 => 키값은 모른다.
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println(value);
		}
		
		Map<Object,Object> map2 = new HashMap<>();
		map2.put(new chapter08.b.Member("홍길동", 30), 90);
		map2.put(new chapter08.b.Member("홍길동", 30), 95);
		System.out.println(map2.get(new chapter08.b.Member("홍길동", 30)));// null
		//멤버클래스에 equals을 재정의해야지 95 값이 나옴.
	}
	

}
