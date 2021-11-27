import java.util.*;

public class Shop {
	Scanner input = new Scanner(System.in);
	int current;
	public Node category[];
	public static CustomerList customers;
	public Shop() {
		category=null;
		current=0;
	}
	public Shop(int size,CustomerList customers) {
		category = new Node[size];
		this.customers=customers;
		current=0;
	}
	public void WelcomeNote() {//FARJINE WEN 
		System.out.println("Welcome to Rent A Car! \nWould you like to rent now?");
		String ans= input.next();
		String y="yes";
		String n="no";
		if(ans.equals(n)) {
			System.out.println("Thank you for visting our shop! Have a look around.");
		}else if(ans.equals(y)) {
			System.out.println("Please fill in the form below to start your rental process:");
			CustomerInfo CI = new CustomerInfo();
			CI.getFirstName(); CI.getLastName(); CI.getGender(); CI.getStatus(); CI.getLocation(); CI.getContact();
			//CI.display();
		}// KIFFF ESH3AAAAA
		// fike tfute ente di2a la 3ende la rjike l fare2? deal senye tyt
		
	}
	public boolean isEmpty() {
		if (current==0) 
			return true;
		else
			return false;
	}
	public void insertCars(Cars car) {
		if(isEmpty()) {
			category[0]=new Node(car);
			current++;
		}
	}

}
