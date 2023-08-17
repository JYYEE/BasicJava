package chapter08.b;

public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("My Sql DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("My Sql DB에서 삽입");
	}

	@Override
	public void update() {
		System.out.println("My Sql DB에서 수정");
	}

	@Override
	public void delete() {
		System.out.println("My Sql DB에서 삭제");
	}

}
