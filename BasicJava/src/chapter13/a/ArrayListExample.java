package chapter13.a;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		//초보 개발자
		ArrayList<String> list = new ArrayList<>();//<String>으로 설정해서 자동 String으로 설정됨
		//중급 개발자
		//List<String> list2 = new ArrayList<>();
		//고급 개발자
		//List<String> list3 = Arrays.asList(null);
		
		//List => ArrayList, Vector, LinkedList
		list.add("Java"); //인덱스 0
		list.add("JDBC");//1
		list.add("Servlet/JSP");//2였다가 데이터베이스 들어오면서 3으로 변경
		list.add(2, "Database"); //2로 중간에 들어오게 됨 
		list.add("myBatis");//4
		
		System.out.println(list.size());
		String string = list.get(2);
		System.out.println(string);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
		}
		//리스트 데이터 삭제
		list.remove(2);//database삭제
		list.remove(2);//sevlet/jsp 삭제
		list.remove("myBatis"); //mybatis찾아서 삭제
		
		for (String str : list) {
			System.out.println(str);
		}
		list.clear(); //리스트의 모든 요소 삭제됨.
		
		
		
		
	}

}
