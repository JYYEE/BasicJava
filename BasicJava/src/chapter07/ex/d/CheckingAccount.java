package chapter07.ex.d;

public class CheckingAccount extends BankAccount{
	//필드
	private SavingsAccount protectedBy; //SavingAccount 객체를 선언

	
	//생성자
	public CheckingAccount(int balance) {
		super(balance);
	}
	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}
	
	//메소드
	@Override
	public boolean withdraw(int amount) {
		/* 3가지 상황 존재
		 * S:10000원, C:5000원
		 * 상황1 : 2000원의 수표를 발행하려고 한다면 --> C 에서 2000원 출금
		 * 상황2 : 7000원의 수표를 발행하려고 한다면 --> C 에서 5000원 출금, S 에서 2000원 출금
		 * 상황3 : 17000원의 수표를 발행하려고 한다면 --> 출금 못함.
		 * 
		 * protectedBy.balance -= amount - balance;
		 * --> 요걸로 해도 됨.protectedBy.withdraw(amount - balacne)){}
		 * balance = 0; //checkingAccount 의 밸런스
		 * return true;
		 * */
		
		/*// 민정
		 *   @Override
      public boolean withdraw(int amount) { //withdraw출금 메소드  amount 잔액
          if (amount > balance + protectedBy.balance ) { //출금액이 두 계좌의 총액보다 클 때
              System.out.println("인출 불가");
              return false;
          } else if ( amount > balance ) { // 출금액이 checking 계좌의 잔액보다 클 때
              protectedBy.withdraw(amount - balance); // 저축계좌에서 출금액과 checking 계좌의 잔액
              balance -= balance; //checking 계좌의 잔액 전액 인출
              return true;
           } else {
              super.withdraw(amount);
              return true;
          }
      }
		 * */
		// 수업
		if(super.withdraw(amount)) {
			return true;
		} else if(protectedBy.withdraw(amount - balance)) {
				balance = 0;
				return true;
			} else {
				return false;
			}
		}
		
		
//		내가 한 것		
//		if(balance<amount) {
//			protectedBy.balance -=(amount-balance);
//			balance = 0; 
//			return true;
//			//return false;
//		}
//		return false;
//		//return true;
//	}
}
