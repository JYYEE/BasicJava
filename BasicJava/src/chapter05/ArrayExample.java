package chapter05;

public class ArrayExample {
	public static void main(String[] args) { // String[] args = new String[0];
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
			System.out.println("args[" + i + "] : " + args[i]);// 이런 경우는 foreach 사용 비추
			// 굳이 쓰려면 아래와 같이 쓸 수 있음
			// int count =0;
			// for (String string : args) {
//			System.out.println("args[" + count++ + "] : "+ string);
	}
// 굳이 이렇게 할 필요 없이 경우에 따라 필요한거를 골라서 사용
		//뭐가 더 좋다라고 할게 없음 상황에 맞출것
		// foreach = 향상된 for 문(enhanced loop)
		// :는 in과 같은 의미
		// jdk 1.5 이상부터 사용가능

	}
}
