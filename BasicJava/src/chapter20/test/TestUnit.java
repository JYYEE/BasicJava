package chapter20.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import chapter20.memo.MemoDAO;
import chapter20.memo.MemoVO;

class TestUnit {
	// TDD : Test Driven Development
	MemoDAO dao = new MemoDAO();
	//@Test
	void selectMemos() {
		try {//내가 예측한 값과 결과값이 같으면 성공, 다르면 실패
			List<MemoVO> list = dao.selectMemos("");
			assertEquals(0, list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//@Test
	void selectMemo() {
		MemoVO memo = dao.selectMemo(0);
		assertNull(memo);
	}
	@Test
	void insertMemo() {
		try {
			int insertMemo = dao.insertMemo(new MemoVO("7번째 시간", "이제 2시간 남음", "a001"));
			assertEquals(1, insertMemo);
			List<MemoVO> list = dao.selectMemos("");
			assertEquals(7, list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
