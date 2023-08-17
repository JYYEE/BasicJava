package chapter07.ex.d;

public class Bank {
	//필드
	private Customer[] customers;
	private int numberOfCustomers;
	
	//생성자
	public Bank() {
		customers = new Customer[10];
	}
	
	//메소드	
	public void addCustomer(Customer customer) {
		customers[numberOfCustomers] = customer;
		numberOfCustomers++;
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

