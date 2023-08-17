package chapter07.ex.d;

public class Customer {
	// 필드
	private String firstName;
	private String lastName;
	private BankAccount[] accounts;
	private int numberOfAccounts; //계좌의 수

	// 생성자
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new BankAccount[5];
	}

	// 메소드
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public BankAccount getAccount(int index) {
		return accounts[index];
	}

	public void addAccount(BankAccount account) {
		accounts[numberOfAccounts++] = account;
		//numberOfAccounts++; --> 코드 줄이기 위해서 윗 행 [] 안에 ++ 추가
	}

	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	@Override
	public String toString() {
		return String.format("이름: %s %s, 계좌의 갯수: %d",firstName, lastName, numberOfAccounts);
		//return String.format("이름: " + getFirstName() +" "+ getLastName() +", 계좌의 갯수: " + numberOfAccounts);
	}
}
