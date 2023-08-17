package project.member;

import java.util.Scanner;

public class FrontController {
	private MemberController memberController = new MemberController();
	private Scanner scanner = new Scanner(System.in);

	public void process() throws Exception {
		System.out.println(" _____         _             _  __   __                  ");
		System.out.println("/  ___|       | |           | | \\ \\ / /                  ");
		System.out.println("\\ `--.   __ _ | |  __ _   __| |  \\ V /  _   _  _ __ ___  ");
		System.out.println(" `--. \\ / _` || | / _` | / _` |   \\ /  | | | || '_ ` _ \\ ");
		System.out.println("/\\__/ /| (_| || || (_| || (_| |   | |  | |_| || | | | | |");
		System.out.println("\\____/  \\__,_||_| \\__,_| \\__,_|   \\_/   \\__,_||_| |_| |_|");
		System.out.printf("\n");
		System.out.println("▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱");
		System.out.println("📂 샐러드 냠냠");
		System.out.println(" └📁 1. 회원가입");
		System.out.println(" └📁 2. 로그인");
		System.out.println(" └📁 0. 메인");
		System.out.println("▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱");
		System.out.print("선택> ");
		int selectMember = Integer.parseInt(scanner.nextLine());
		login : switch (selectMember) {
		case 1 : 
			memberController.joinMember(scanner);
			memberController.loginMember(scanner);
			nextLogin();
			break login;
		case 2 : 
			memberController.loginMember(scanner);
			nextLogin();
			break login;
		case 0 : 
			process();
			break login;
		}
		
	}

	public void nextLogin() throws Exception {
		System.out.println("▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱");
		System.out.println("📂 샐러드 냠냠");
		System.out.println(" └📁 로그인");
		System.out.println("   └📁 1. 내 정보");
		System.out.println("   └📁 2. 주문하기");
		System.out.println("   └📁 0. 메인");
		System.out.println("▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱");
		System.out.println("선택> ");
		System.out.println("▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱");
		int selectMenu = Integer.parseInt(scanner.nextLine());
		switch(selectMenu){
		case 1: 
			myPage();
			break;
		case 2:
			// 주문
			break;
		case 3:
			break;
		case 0:
			process();
			break;
		}
		
		memberController.updateMember(scanner);
		
	}
	public void myPage() throws Exception {
		System.out.println("▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱");
		System.out.println("1. 내 정보 조회");
		System.out.println("2. 내 정보 수정");
		System.out.println("3. 내 주문 정보");
		System.out.println("0. 이전");
		System.out.println("▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱▰▱");
		System.out.println("선택> ");
		int selectMyPage = Integer.parseInt(scanner.nextLine());
		switch(selectMyPage) {
		case 1: 
			memberController.selectMember();
			nextLogin();
			break;
		case 2:
			editMyPage();
			nextLogin();
			break;
		case 3:
			//주문정보 조회
			break;
		case 0:
			nextLogin();
			break;
		}
	}
	
	public void editMyPage() throws Exception {
		System.out.println("1. 비밀번호 수정");
		System.out.println("2. 기본 정보 수정");
		System.out.println("0. 이전");
		System.out.println("선택> ");
		int selectEdit = Integer.parseInt(scanner.nextLine());
		switch(selectEdit) {
		case 1:
			memberController.updatePassword(scanner);
			editMyPage();
			break;
		case 2:
			memberController.updateMember(scanner);
			editMyPage();
			break;
		case 0:
			myPage();
			break;
		}
	}
}
