import java.util.*;

public class Shop {
	Scanner input = new Scanner(System.in);
	int current;
	public Node category[];
	public static CustomerList customers;
	LinkedList ll = new LinkedList();
	Cars c1 = new Cars("Sports", "Ferrari", "Red", 2021, 700);
	Cars c2 = new Cars ("Economics", "Mercedes","Black",2015,400);
	//Cars c3= new Cars("","","", , );
	//Cars c4= new Cars("","","", , );
	//Cars c5= new Cars("","","", , );
	//Cars c6= new Cars("","","", , );
	//Cars c7= new Cars("","","", , );
	//Cars c8= new Cars("","","", , );
	//Cars c9= new Cars("","","", , );
	//Cars c10= new Cars("","","", , );
	
	public void OurCars() {
		
		ll.insertAtBack(c1.toString());
		ll.insertAtBack(c2.toString());
		//ll.insertAtBack(c3.toString());
		//ll.insertAtBack(c4.toString());
		//ll.insertAtBack(c5.toString());
		//ll.insertAtBack(c6.toString());
		//ll.insertAtBack(c7.toString());
		//ll.insertAtBack(c8.toString());
		//ll.insertAtBack(c9.toString());
		//ll.insertAtBack(c10.toString());
		ll.display();
	}
	public void WelcomeNote() {
		System.out.println("Welcome to Rent A Car! \nHere is a list of all our available cars:");
		System.out.println("Please note that all our prices are in usd ");
		OurCars();
		System.out.println("Would you like to rent now?");
		String ans= input.next();
		String y="yes";
		String n="no";
		if(ans.equals(n)) {
			System.out.println("Thank you for visting our shop! Have a look around.");
		}else if(ans.equals(y)) {
			System.out.println("Please fill in the form below to start your rental process:");
			CustomerInfo CI = new CustomerInfo();
			CI.getFirstName(); CI.getLastName(); CI.getStatus(); CI.getLocation(); CI.getContact();
			CI.display();
		}
		
	}
	
	public Shop() {
		category=null;
		current=0;
	}
	public Shop(int size,CustomerList customers) {
		category = new Node[size];
		Shop.customers=customers;
		current=0;
	}
	
	
	public boolean isEmpty() {
		if (current==0) 
			return true;
		else
			return false;
	
	
	}

}
