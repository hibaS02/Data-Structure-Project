 import java.util.*;

public class CustomerInfo extends CustomerList {
	private String firstName, lastName, location;
	private int contact;
	CustomerList cl = new CustomerList();
	Scanner input = new Scanner(System.in);
	public CustomerInfo() {
		
		firstName = "";
		lastName =  "";
		location =  "";
		contact =  0;
	}
	public CustomerInfo(String fN, String lN,  String l, int c) {
	
		this.firstName = fN;
		this.lastName = lN;
		this.location = l;
		this.contact = c;
	}
	public Object customer() {
		System.out.print("First Name: ");
		firstName = input.next();
		System.out.print("Last Name: ");
		lastName = input.next();
		System.out.print("Address:");
		location = input.next();
		System.out.print("Phone number: ");
		contact =input.nextInt();
		return  CustomerInfo2(firstName,lastName,location,contact) ;
		
	}

	private Object CustomerInfo2(String fN, String lN,  String l, int c) {
		this.firstName = fN;
		this.lastName = lN;
		this.location = l;
		this.contact = c;
		return firstName+" "+lastName+" "+location+" "+contact;
		
	}
	public void display() {
		System.out.println("Name: "+firstName+" "+lastName);
		System.out.println("Adress: "+location);
		System.out.println("Phone: "+contact);
	}
	 
}
