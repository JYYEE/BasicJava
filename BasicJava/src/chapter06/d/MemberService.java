package chapter06.d;

public class MemberService {

	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			//문자열을 먼저 쓰는 것이 안전하게 확인하는 방법
			// id 대신 null이면 null.equals ~~ 에러
			// "hong".equals(id) && "12345".equals(password) 로 쓰는게 안전
			return true;
		} //else {       return문일 때는 else 생략 가능. 여러줄이어도 읽을 수 있음. 
			return false; 
		//}
	}

	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
