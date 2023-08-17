package chapter02;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if (v1 > 10) {
			int v2;
			v2 = v1 - 10;
			System.out.println(v2);
		}
	}
	// int v3=v1+v2+5 //변수 v2의 사용 범위는 if 다음 중괄호 안에서만 사용가능함 사용범위 이탈

}
