package chapter07.ex.c;

public class Bank {
	//필드
	private Customer[] customers; 
	private int numberOfCustomers; // 배열이 10칸이어도 고객이 몇명인지 몰라서 따로 카운트
	
	//생성자
	public Bank() {
		customers = new Customer[10];
	}
	
	//메소드	
	public void addCustomer(Customer customer) {
		customers[numberOfCustomers++] = customer; // 배열 ?번째에 외부에서 넘어온 값(customer)을 대입
		//numberOfCustomers++; <--이 코드를 위에 [] 안에 ++로 넣어서 줄임.
		return;
	}
	
	public Customer[] getCustomers() {
		return customers;
	}
	
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	public Customer getCustomer(int index) {
		return customers[index];
	}

}
