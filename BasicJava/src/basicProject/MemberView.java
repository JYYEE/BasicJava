package basicProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberView {
	// 회원가입
	public MemberVO inputJoinMember(Scanner scanner) {
		System.out.println("▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱");
		System.out.println("[회원가입]");
		String id = "";
		while (true) {
			System.out.print("ID : ");
			id = scanner.nextLine();
			if (id.contains(" ")) {
				System.out.println("ID에는 공백이 포함될 수 없습니다. 다시 입력해주세요.");
			} else {
				break;
			}
		}
		String pw = "";
		while (true) {
			System.out.print("Password : ");
			pw = scanner.nextLine();
			if (pw.contains(" ")) {
				System.out.println("Password에는 공백이 포함될 수 없습니다. 다시 입력해주세요.");
			} else {
				break;
			}
		}
		System.out.print("이름 : ");
		String name = scanner.nextLine();
		System.out.print("주소 : ");
		String add = scanner.nextLine();
		System.out.print("연락처 : ");
		String hp = scanner.nextLine();
		return new MemberVO(id, pw, name, add, hp);
	}
	// 회원가입 결과
	public boolean joinResult(int joinCount) {
		if (joinCount > 0) {
			System.out.println("회원가입을 축하합니다. ");
			return false;
		} else {
			System.out.println("회원가입이 되지 않았습니다. 다시 시도해주세요.");
			return true;
		}
	}
	// 로그인
	public MemberVO inputLoginMember(Scanner scanner) {
		System.out.println("▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱");
		System.out.println("[로그인]");
		System.out.print("ID : ");
		String id = scanner.nextLine();
		System.out.print("Password : ");
		String pw = scanner.nextLine();
		return new MemberVO(id, pw);
	}
	// 로그인 결과
	public boolean loginResult(MemberVO vo) {
		if (vo == null) {
			System.out.println("로그인 실패. 다시 시도해주세요.");
			return true;
		} else {
			System.out.println("로그인 성공");
			System.out.println("반갑습니다." + vo.getName() + "님!");
			return false;
		}
	}
	// id 중복 확인
	public boolean duplicateIdCheck(MemberVO vo) {
		if (vo == null) {
			System.out.println("사용 가능한 아이디 입니다.");
			System.out.println("");
			return false;
		} else {
			System.out.println("이미 가입된 아이디 입니다. 다른 아이디로 시도해주세요.");
			return true;
		}
	}
	// 내정보 수정
	public MemberVO updateMember(Scanner scanner, MemberVO vo) {
		System.out.println("▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱");
		System.out.println("[내 정보 수정]");
		System.out.println("(수정할 내용이 없으면 enter로 넘어가세요.)");
		System.out.println("ID : " + vo.getId());
		System.out.print("이름 : " + vo.getName() + "\t수정 : ");
		String name = scanner.nextLine();
		if (name.equals("")) {
			name = vo.getName();
		} else {
			vo.setName(name);
		}
		System.out.print("주소 : " + vo.getAdd() + "\t수정 : ");
		String add = scanner.nextLine();
		if (add.equals("")) {
			add = vo.getAdd();
		} else {
			vo.setAdd(add);
		}
		System.out.print("연락처 : " + vo.getHp() + "\t수정 : ");
		String hp = scanner.nextLine();
		if (hp.equals("")) {
			hp = vo.getHp();
		} else {
			vo.setHp(hp);
		}
		return vo;
	}
	// 내정보 수정 결과
	public void resultUpdate(int result) {
		if (result > 0) {
			System.out.println("정보가 수정되었습니다.");
		} else {
			System.out.println("수정되지 않았습니다. 확인하세요.");
		}
	}
	// 내정보 출력
	public void printMember(MemberVO vo) {
		System.out.println("▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱");
		System.out.printf("\n");
		System.out.println("                         ***내 정보***");
		System.out.printf("\n");
		System.out.println("   ID: " + vo.getId());
		System.out.println("   이름: " + vo.getName());
		System.out.println("   주소: " + vo.getAdd());
		System.out.println("   전화번호: " + vo.getHp());
		System.out.println("   마일리지: " + vo.getMileage());
		System.out.printf("\n");
		System.out.println("▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱");
	}
	// 비밀번호 수정
	public List<String> updatePassword(Scanner scanner) {
		List<String> list = new ArrayList<>();
		System.out.println("▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱");
		System.out.println("[내 비밀번호 수정]");
		System.out.print("현재 비밀번호 : ");
		String pw = scanner.nextLine();
		System.out.print("수정 비밀번호 : ");
		String editPw = scanner.nextLine();
		list.add(pw);
		list.add(editPw);
		return list;
	}
	// 비밀번호 수정 결과
	public boolean resultUpdatePassword(int result) {
		if (result != 1) {
			System.out.println("현재 비밀번호를 잘못 입력했습니다. 다시 입력해주세요.");
			return true;
		} else {
			System.out.println("비밀번호가 수정되었습니다.");
			return false;
		}
	}

	// 관리계정으로 로그인 시 전체 회원 목록 조회
	public void printListMember(List<MemberVO> list) {
		System.out.println("[회원 목록 조회]");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		System.out.println("아이디\t\t이름\t\t주소\t\t\t\t\t\t연락처\t\t마일리지");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		for (MemberVO vo : list) {
			System.out.println(vo);
		}

	}

}
