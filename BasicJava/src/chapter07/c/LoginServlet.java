package chapter07.c;
// 추상클래스에서 상속되면 
// 추상메소드를 가지고 있을 때 그 메소드를 재정의하는 것이 필요
public class LoginServlet extends HttpServlet {
	@Override
	public void service() {
		System.out.println("로그인 합니다.");

		
	}
	
}
