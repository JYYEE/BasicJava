package chapter08.ex.b;

public abstract class BankAccount {
	//필드
	protected int balance;

	//생성자
	public BankAccount(int balance) {
		this.balance = balance;
	}
	// 추상메소드
	public abstract String getAccountType();
	
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

	public boolean transfer(int amount, BankAccount otherAccount) {
		if(withdraw(amount)) { 
			otherAccount.deposit(amount);
			return true;				
		}
		return false;
	}
	@Override
	public String toString() {
		return String.format("잔액: %,d", balance);
	}
}
