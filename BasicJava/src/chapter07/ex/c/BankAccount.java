package chapter07.ex.c;

public class BankAccount {
	//필드
	private int balance;

	//생성자
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	//메소드
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) { //입금(예금)
		balance += amount;
		return;
	}
	
	public boolean withdraw(int amount) { //출금 @return 성공시 true, 실패시 false
		if(balance>=amount) { 
			balance -=amount;
			return true; // return false : 잘못했는데도 결과제대로 나온 이유 --> transfer에서 withdraw 메소드 활용x
		} 
		return false;
	}
	public boolean transfer(int amount, BankAccount otherAccount) {
		if(withdraw(amount)) { //if(balance>amount)  주석이 내가한거
			//balance -= amount;
			otherAccount.deposit(amount);
			return true;				
		}
		return false;
	}
}
