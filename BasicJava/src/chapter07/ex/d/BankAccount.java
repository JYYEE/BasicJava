package chapter07.ex.d;

public class BankAccount {
	//필드
	protected int balance;

	//생성자
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	//메소드
	public int getBalance() {
		return balance;
	}
	public void deposit(int amount) {
		balance += amount;
		return;
	}
	public boolean withdraw(int amount) {
		if(balance>=amount) { 
			balance -=amount;
			return true; 
		} 
		return false;
	}
//		if(balance>amount) {
//			balance -=amount;
//			return false;
//		} 
//		return true;
//	}
	public boolean transfer(int amount, BankAccount otherAccount) {
		if(withdraw(amount)) { //if(balance>amount)  주석이 내가한거
			//balance -= amount;
			otherAccount.deposit(amount);
			return true;				
		}
		return false;
	}
//		if(balance>amount) {
//			balance -= amount;
//			otherAccount.deposit(amount);
//			return true;				
//		}
//		return false;
//	}
	@Override
	public String toString() {
		return String.format("잔액: %,d", balance);
		//return String.format("잔액: " + getBalance());
	}
}
