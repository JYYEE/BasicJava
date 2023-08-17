package chapter10.ex;

public abstract class BankAccount {
	// 필드
	protected int balance;

	// 생성자
	public BankAccount(int balance) {
		this.balance = balance;
	}

	// 추상메소드
	public abstract String getAccountType();

	// 메소드
	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		balance += amount;
		return;
	}

	public boolean withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
			return true;
		}
		return false;
	}

	public boolean transfer(int amount, BankAccount otherAccount)  {
		//try-catch 이용했으므로 메소드 옆에 throws 쓸 필요 없음. 
		if (amount < 0 || amount > balance) {
			throw new IllegalArgumentException();
		} else if (otherAccount == null) {
			throw new NullPointerException();
		} else {
			otherAccount.deposit(amount);
			return true;
		}
	}
	
	@Override
	public String toString() {
		return String.format("잔액: %,d", balance);
	}
}
