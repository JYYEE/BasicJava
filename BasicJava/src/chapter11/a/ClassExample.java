package chapter11.a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassExample {
	public static void main(String[] args) throws Exception {
		Class clazz = Member.class; //클래스 사용할 수 있게 됨
		Class clazz2 = Class.forName("chapter11.a.Member");
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz2.getPackage().getName());
		
		Constructor[] constructors = clazz.getConstructors();
		Member member = null;
		for (Constructor constructor : constructors) {
			member = (Member) constructor.newInstance("1");
		}
		
		Field[] fields = clazz.getDeclaredFields();// 퍼블릭이 아닌 필드도 배열객체 형태로 반환.
		for (Field field : fields) {
			System.out.println("필드명: " + field.getName());
			System.out.println("필드 타입: " + field.getType());
			field.setAccessible(true); // 필드 접근 가능하게 만들어줌
			field.set(member, "123");
		}
		
		Method[] methods = clazz.getDeclaredMethods();// 퍼블릭이 아닌 필드도 배열객체 형태로 반환.
		for (Method method : methods) {
			System.out.println("메소드명: " + method.getName());
			System.out.println("메소드 반환 타입: " + method.getReturnType());
			//Object invoke = method.invoke(methods, args);// getId가 개발자가 호출 invoke는 프로그램상 호출
		}
		
		System.out.println(member.getId());
		
		Member member1 = new Member("1");
		
	}

}
