package basicProject_nonemoz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FrontController {
	private MemberController memberController = new MemberController();
	private ProdController prodController = new ProdController();
	private OrderController orderController = new OrderController();
	private OrderedController orderedController = new OrderedController();
	private BoardController boardController = new BoardController();
	private ReplyController replyController = new ReplyController();
	private Scanner scanner = new Scanner(System.in);
	private List<ProdVO> list = new ArrayList<>();
	int check;

	public void process() throws Exception {
		System.out.println(" A____A    _____         _             _  __   __                  ");
		System.out.println(" |.ㅅ.|   /  ___|       | |           | | \\ \\ / /                  ");
		System.out.println(" |っｃ|   \\ `--.   __ _ | |  __ _   __| |  \\ V /  _   _  _ __ ___  ");
		System.out.println(" |　　|    `--. \\ / _` || | / _` | / _` |   \\ /  | | | || '_ ` _ \\ ");
		System.out.println(" |　　|   /\\__/ /| (_| || || (_| || (_| |   | |  | |_| || | | | | |");
		System.out.println(" |　　|   \\____/  \\__,_||_| \\__,_| \\__,_|   \\_/   \\__,_||_| |_| |_|");
		System.out.println(" U￣￣U");
		System.out.println("──────────────────────────────────────────────────────────────────");
		System.out.println("＃♬ 샐러드 냠냠 ♬");
		System.out.println(" └＃ 1. 회원가입");
		System.out.println(" └＃ 2. 로그인");
		System.out.println("＃ 0. 프로그램 종료");
		System.out.println("──────────────────────────────────────────────────────────────────");
		System.out.print("선택> ");
		int selectMember = 0;
		try {
			selectMember = Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("올바른 메뉴를 입력해주세요.\n");
			process();
		}
		login: switch (selectMember) {
		case 1:
	         memberController.joinMember(scanner);
	         memberController.loginMember(scanner);
	         if ("admin".equals(Application.getSession().getId())) {
	            adminPage();
	         } 
	         nextLogin();
	         break login;
		case 2:
			memberController.loginMember(scanner);
			if ("admin".equals(Application.getSession().getId())) {
				adminPage();
			} else {
				nextLogin();
			}
			break login;
		case 3:
			process();
			break login;
		case 0:
			System.out.println("\n  ♡ ∩______∩");
			System.out.println("  （ . ㅅ . )♡");
			System.out.println(" ┏━━━━∪∪━━━━━━━━━━━┓");
			System.out.println(" ♡ 담에 또 만나요! ♡");
			System.out.println(" ┗━━━━━━━━━━━━━━━━━┛");
			System.exit(selectMember);
			break;
		default:
			System.out.println("올바른 메뉴를 입력해주세요.\n");
			process();
		}

	}

	public void nextLogin() throws Exception {
		System.out.println("──────────────────────────────────────────────────────────────────");
		System.out.println("＃♬ 샐러드 냠냠 ♬");
		System.out.println(" └＃ 로그인");
		System.out.println("   └＃ 1. 내 정보");
		System.out.println("   └＃ 2. 주문하기");
		System.out.println("   └＃ 3. 문의하기");
		System.out.println("   └＃ 0. 로그아웃");
		System.out.println("──────────────────────────────────────────────────────────────────");
		System.out.print("선택> ");
		int selectMenu = 0;
		try {
			selectMenu = Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("올바른 메뉴를 입력해주세요.\n");
			nextLogin();
		}
		switch (selectMenu) {
		case 1:
			myPage();
			break;
		case 2:
			prodController.selectProds(); // 상품목록 출력
			while (true) {
				System.out.println("──────────────────────────────────────────────────────────────────");
				System.out.println("＃♬ 샐러드 냠냠 ♬");
				System.out.println(" └＃ 로그인");
				System.out.println("   └＃ 주문하기");
				System.out.println("     └＃ 1. 검색");
				System.out.println("     └＃ 2. 장바구니 담기");
				System.out.println("     └＃ 3. 장바구니 확인");
				System.out.println("     └＃ 4. 주문");
				System.out.println("     └＃ 0. 이전");
				System.out.println("──────────────────────────────────────────────────────────────────");
				System.out.print("선택> ");
				int selectProdMenu = 0;
				try {
					selectProdMenu = Integer.parseInt(scanner.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("올바른 메뉴를 입력해주세요.\n");
					continue;
				}
				check: switch (selectProdMenu) {
				case 0:
					nextLogin();
					break;
				case 1:
					prodController.searchProds(scanner); // 상품목록 검색 및 출력
					break;
				case 2:
					System.out.println("──────────────────────────────────────────────────────────────────");
					System.out.println("상품담기가 완료되면 상품번호에 0번을 입력하세요.");

					while (true) {
						ProdVO vo = orderController.addCart(scanner);
						if (vo == null) {
							break;
						}
						if (vo.getProdRemain() < vo.getProdQty()) {
							System.out.println(vo.getProdNo() + "번 상품의 재고량보다 더 많이 주문했거나 존재하지 않는 상품입니다.");
							System.out.printf("\n");
							System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
							System.out.println("|       죄송합니다. 다시 주문해주세요.      |");
							System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
							System.out.println("                 O °");
							System.out.println(".　　　　　／＞　 フ");
							System.out.println("　　　　　 |　_　 _l");
							System.out.println("　 　　　／` ミ＿Yノ");
							System.out.println("　　 　 /　　　 　 |");
							System.out.println("　　　 /　 \\　　 l");
							System.out.println("　 　 │　　|　|　|");
							System.out.println("　／￣|　　 |　|　|");
							System.out.println("　| (￣\\＿_\\_)__)");
							System.out.println("　＼二つ\n");
						} else {
							list.add(vo);
							if (check == 0) {
								check++;
								continue;
							}
							for (int i = 0; i < list.size(); i++) {
								for (int j = i + 1; j < list.size(); j++) {
									if (list.get(i).getProdNo().equals(list.get(j).getProdNo())) {
										int result = list.get(i).getProdQty() + list.get(j).getProdQty();
										if (vo.getProdRemain() < result) {
											System.out.println(vo.getProdNo() + "번 상품의 재고량보다 더 많이 주문했거나 존재하지 않는 상품입니다.");
											System.out.printf("\n");
											System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
											System.out.println("|       죄송합니다. 다시 주문해주세요.      |");
											System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
											System.out.println("                 O °");
											System.out.println(".　　　　　／＞　 フ");
											System.out.println("　　　　　 |　_　 _l");
											System.out.println("　 　　　／` ミ＿Yノ");
											System.out.println("　　 　 /　　　 　 |");
											System.out.println("　　　 /　 \\　　 l");
											System.out.println("　 　 │　　|　|　|");
											System.out.println("　／￣|　　 |　|　|");
											System.out.println("　| (￣\\＿_\\_)__)");
											System.out.println("　＼二つ\n");
											list.remove(j);
					                        break;
										} else {
											list.get(i).setProdQty(result);
											list.remove(j);
					                        break;
										}
									}
								}
							}
						}

					}
					break;
				case 3:
					if (list.size() < 1) {
						System.out.println("──────────────────────────────────────────────────────────────────");
						System.out.println("장바구니가 비어있습니다.\n");

						break;
					}
					orderController.cartCheck(list); // 장바구니 확인
					System.out.println("──────────────────────────────────────────────────────────────────");
					System.out.println("＃♬ 샐러드 냠냠 ♬");
					System.out.println(" └＃ 로그인");
					System.out.println("   └＃ 주문하기");
					System.out.println("     └＃ 장바구니 확인");
					System.out.println("       └＃ 1. 장바구니 비우기");
					System.out.println("       └＃ 2. 주문");
					System.out.println("       └＃ 0. 이전");
					System.out.println("──────────────────────────────────────────────────────────────────");
					System.out.print("선택> ");
					int selectCartMenu = 0;
					try {
						selectCartMenu = Integer.parseInt(scanner.nextLine());
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
					switch (selectCartMenu) {
					case 0:
						break check;
					case 1:
						list = new ArrayList<>();
						break;
					case 2:
						selectProdMenu = 4;
						break;
					default:
						System.out.println("올바른 메뉴를 입력해주세요.\n");
						break;
					}
				case 4:
					if (list.size() < 1) {
						System.out.println("장바구니가 비어있습니다.\n");
						break;
					}

					OrderVO vo = null;
					vo = orderController.inputShipping(scanner); // 배송정보 입력
					orderController.order(vo, list); // 주문하기
					System.out.println("주문이 정상적으로 처리되었습니다.\n");
					System.out.println(" 　 ∧  ∧　　　　　　");
					System.out.println(" 　( .ㅅ.)　배불러");
					System.out.println(" 　/　　⌒\\　　　");
					System.out.println(" （人＿__つ_つ");
					list = new ArrayList<>(); // 주문 후 장바구니 비우기
					orderedController.newOrder();
					Application.setSession(memberController.selectMyInfo());
					break;
				default:
					System.out.println("올바른 메뉴를 입력해주세요.\n");
					continue;
				}
			}
		case 3:
			while (true) {
				System.out.println("──────────────────────────────────────────────────────────────────");
				System.out.println("＃♬ 샐러드 냠냠 ♬");
				System.out.println(" └＃ 로그인");
				System.out.println("   └＃ 문의하기");
				System.out.println("     └＃ 1. 새 문의");
				System.out.println("     └＃ 2. 문의내역");
				System.out.println("     └＃ 0. 이전");
				System.out.println("──────────────────────────────────────────────────────────────────");
				System.out.print("선택> ");
				int selectBoardMenu = 0;
				try {
					selectBoardMenu = Integer.parseInt(scanner.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("올바른 메뉴를 입력해주세요.\n");
					continue;
				}
				switch (selectBoardMenu) {
				case 1:
					if (boardController.insertBoard(scanner) > 0) {
						System.out.println("문의가 정상적으로 등록되었습니다.");
					} else {
						System.out.println("문의가 정상적으로 등록되지 않았습니다.");
					}
					break;
				case 2:
					while (true) {
						boardController.selectMyBoards();
						System.out.println("문의번호를 선택해주세요. (이전 0)");
						System.out.println("──────────────────────────────────────────────────────────────────");
						System.out.print("선택> ");
						int selectNo = 0;
						try {
							selectNo = Integer.parseInt(scanner.nextLine());
						} catch (NumberFormatException e) {
							System.out.println("올바른 메뉴를 입력해주세요.\n");
							continue; // 없는 문의 번호를 입력했을 땐 null값을 반환하고 있음
						}
						if (selectNo == 0) {
							break;
						} else {
							int selectMyBoard = boardController.selectMyBoardContent(selectNo);
							if (selectMyBoard == 0) {
								System.out.println("올바른 번호를 입력해주세요.\n");
								continue;
							} else {
								replyController.selectReply(selectNo);
								System.out.print("이전으로 가려면 아무키를 입력하세요.\n");
								scanner.nextLine();
								continue;
							}
						}
					}
					break;
				case 0:
					nextLogin();
					break;
				default:
					System.out.println("올바른 메뉴를 입력해주세요.\n");
					continue;
				}
			}
		case 0:
			list.clear();
			process();
			break;
		default:
			System.out.println("올바른 메뉴를 입력해주세요.\n");
			nextLogin();
		}

	}

	public void myPage() throws Exception {
		System.out.println("──────────────────────────────────────────────────────────────────");
		System.out.println("＃♬ 샐러드 냠냠 ♬");
		System.out.println(" └＃ 로그인");
		System.out.println("   └＃ 내 정보");
		System.out.println("     └＃ 1. 내 정보 조회");
		System.out.println("     └＃ 2. 내 정보 수정");
		System.out.println("     └＃ 3. 내 주문 정보");
		System.out.println("     └＃ 0. 이전");
		System.out.println("──────────────────────────────────────────────────────────────────");
		System.out.print("선택> ");
		int selectMyPage = 0;
		try {
			selectMyPage = Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("올바른 메뉴를 입력해주세요.\n");
			myPage();
		}
		switch (selectMyPage) {
		case 1:
			memberController.selectMember();
			myPage();
			break;
		case 2:
			editMyPage();
			myPage();
			break;
		case 3:
			orderedController.myOrder();
			cancelPage();
			break;
		case 0:
			nextLogin();
			break;
		default:
			System.out.println("올바른 메뉴를 입력해주세요.\n");
			myPage();
		}
	}

	public void editMyPage() throws Exception {
		System.out.println("──────────────────────────────────────────────────────────────────");
		System.out.println("＃♬ 샐러드 냠냠 ♬");
		System.out.println(" └＃ 로그인");
		System.out.println("   └＃ 내 정보");
		System.out.println("     └＃ 내 정보 수정");
		System.out.println("       └＃ 1. 비밀번호 수정");
		System.out.println("       └＃ 2. 기본 정보 수정");
		System.out.println("       └＃ 0. 이전");
		System.out.println("──────────────────────────────────────────────────────────────────");
		System.out.print("선택> ");
		int selectEdit = 0;
		try {
			selectEdit = Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("올바른 메뉴를 입력해주세요.\n");
			editMyPage();
		}
		switch (selectEdit) {
		case 1:
			if (memberController.updatePassword(scanner) == 0) {
				editMyPage();
			}
			process();
			break;
		case 2:
			memberController.updateMember(scanner);
			editMyPage();
			break;
		case 0:
			myPage();
			break;
		default:
			System.out.println("올바른 메뉴를 입력해주세요.\n");
			editMyPage();
		}
	}

	public void adminPage() throws Exception {
		while (true) {
			System.out.println("──────────────────────────────────────────────────────────────────");
			System.out.println("＃♬ 샐러드 냠냠 ♬");
			System.out.println(" └＃ 관리자 로그인");
			System.out.println("   └＃ 1. 회원 정보 조회");
			System.out.println("   └＃ 2. 재고 정보 조회");
			System.out.println("   └＃ 3. 문의 내역 조회");
			System.out.println("   └＃ 0. 로그아웃");
			System.out.println("──────────────────────────────────────────────────────────────────");
			System.out.print("선택> ");
			int selectAdmin = 0;
			try {
				selectAdmin = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("올바른 메뉴를 입력해주세요.\n");
				adminPage();
			}
			switch (selectAdmin) {
			case 1:
				memberController.listMember(null);
				adminPage();
				break;
			case 2:
				orderedController.selectRemain(null);
				adminPage();
				break;
			case 3:
				while (true) {
					boardController.selectAllBoards();
					System.out.println("문의번호를 선택해주세요. (0.이전)");
					System.out.println("──────────────────────────────────────────────────────────────────");
					System.out.print("선택> ");
					int selectNo;
					try {
						selectNo = Integer.parseInt(scanner.nextLine());
					} catch (NumberFormatException e1) {
						System.out.println("올바른 번호를 입력해주세요.\n");
						continue;
					}
					if (selectNo == 0) {
						adminPage();
						break;
					} else {
						selectBoard: while (true) {
							int selectBoard = boardController.selectBoard(selectNo);
							if (selectBoard == 0) {
								System.out.println("올바른 번호를 입력해주세요.\n");
								break selectBoard;
							} else {
								boolean replyExist = replyController.selectReply(selectNo);
								if (replyExist) {
									System.out.print("이전으로 가려면 아무키를 입력하세요.");
									scanner.nextLine();
									break selectBoard;
								} else {
									System.out.println("1.답변등록 \t0.이전");
								}
								System.out.println("──────────────────────────────────────────────────────────────────");
								System.out.print("선택> ");
								int selectBoardMenu = 0;
								try {
									selectBoardMenu = Integer.parseInt(scanner.nextLine());
								} catch (NumberFormatException e) {
									System.out.println("올바른 메뉴를 입력해주세요.\n");
									continue;
								}
								switch (selectBoardMenu) {
								case 1:
									if (replyController.insertReply(selectNo, scanner) > 0) {
										System.out.println("답변이 정상적으로 등록되었습니다.");
									} else {
										System.out.println("답변이 정상적으로 등록되지 않았습니다.");
									}
									break;
								case 0:
									break selectBoard;
								default:
									System.out.println("올바른 메뉴를 입력해주세요.\n");
									continue;
								}
							}
						}
					}
				}
			case 0:
				System.out.println("");
				process();
				break;
			default:
				System.out.println("올바른 메뉴를 입력해주세요.\n");
				adminPage();
			}
		}
	}

	public void cancelPage() throws Exception {
		System.out.println("──────────────────────────────────────────────────────────────────");
		System.out.println("＃♬ 샐러드 냠냠 ♬");
		System.out.println(" └＃ 로그인");
		System.out.println("   └＃ 내 정보");
		System.out.println("     └＃ 내 주문 정보");
		System.out.println("       └＃ 1. 주문 취소");
		System.out.println("       └＃ 0. 이전");
		System.out.println("──────────────────────────────────────────────────────────────────");
		System.out.print("선택> ");
		int selectAdmin = Integer.parseInt(scanner.nextLine());
		switch (selectAdmin) {
		case 1:
			System.out.println("──────────────────────────────────────────────────────────────────");
			System.out.print("취소할 주문번호를 입력하세요> ");
			String cancelOrderId = scanner.nextLine();
			orderController.cancelOrder(cancelOrderId);
			Application.setSession(memberController.selectMyInfo());
			myPage();
			break;
		case 0:
			myPage();
			break;
		}
	}
}