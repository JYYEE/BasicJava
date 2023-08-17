package chapter07.ex.d;

public class SavingsAccount extends BankAccount {
	// 필드
	private double interestRate; // 이자율

	// 생성자
	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	// 메소드
	public void updateBalance(int period) {
		balance += balance * interestRate * period;
		//super.balance = (int) (super.balance + super.balance * interestRate * period);
	}
}
