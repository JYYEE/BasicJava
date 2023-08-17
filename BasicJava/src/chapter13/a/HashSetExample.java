package chapter13.a;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("myBatis");
		set.add("Database");
		
		set.remove("Database");// 인덱스가 없으므로 삭제하고자 하는 데이터 입력
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		// 모든 원소에 접근해서 데이터 가져오기. 순서가 랜덤식
		// while문으로 원소 추출
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String string = iterator.next();
			System.out.println("\t"+string);
		}
		
		set.remove("JDBC");
		set.remove("myBatis");
		
		iterator= set.iterator();
		System.out.println("총 객체수: " + set.size());
		// 향상된 for문으로 원소 추출
		for (String string : set) {
			System.out.println("\t" + string);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}

}
