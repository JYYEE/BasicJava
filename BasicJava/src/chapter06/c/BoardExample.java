package chapter06.c;

public class BoardExample {
	public static void main(String[] args) {
		Board board1 = new Board("제목", "내용");
		Board board2 = new Board("제목", "내용", "홍길동");
		Board board3 = new Board("제목", "내용", "홍길동", "2023-01-18");
		Board board4 = new Board("제목", "내용", "홍길동", "2023-01-18", 4);
		System.out.println(board1.content);
		System.out.println(board2.date);
		System.out.println(board3.writer);
		System.out.println(board4.hitcount);
	}

}
