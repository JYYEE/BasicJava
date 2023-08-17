package chapter07.ex.c;

public class Customer {
	//필드
	private String firstName;
	private String lastName;
	private BankAccount account;
	
	//생성자
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	//메소드
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public String toString() {
		return String.format("이름: %s %s, 잔고: %,d원",firstName, lastName, account.getBalance());
		//return String.format("이름: " + getFirstName() + getLastName() +", 잔고: "+ account.getBalance() + "원");
	} // 금액에 콤마 찍히는 방법 String.format에서 %,d 이용
}
