package chapter08.ex.b;

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
          if (amount > balance + protectedBy.balance ) { 
              System.out.println("인출 불가");
              return false;
          } else if (protectedBy.withdraw(amount-balance)) { 
              balance = 0; 
              return true;
           } else {
              super.withdraw(amount);
              return true;
          }
	}
	@Override
	public String getAccountType() { 
		return "당좌예금";
	}
}
