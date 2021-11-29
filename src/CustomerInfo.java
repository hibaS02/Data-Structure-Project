import java.util.*;

public class CustomerInfo {
	private String firstName, lastName, gender, status, location;
	private int contact;
	Scanner input = new Scanner(System.in);
	public CustomerInfo() {
	
		firstName = "";
		lastName = "";
		gender = "";
		status = "";
		location = "";
		contact = 0;
	}
	
	public void setCustomer(String fN, String lN, String g, String s, String l, int c){
	
		firstName = fN;
		lastName = lN;
		gender = g;
		status = s;
		location = l;
		contact = c;
	}
	
	public String getFirstName() {
		System.out.print("First Name: ");
		String firstName = input.next();
		return firstName;
	}
	
	public String getLastName() {
		System.out.print("Last Name: ");
		String lastName = input.next();
		return lastName;
	}
	
	public String getFullName() {
		return getFirstName() + " " + getLastName();
	}
	
	
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		System.out.print("Gender: ");
		String gender = input.next();
		return gender;
	}
	
	public String getStatus() {
		System.out.print("Marital status: ");
		String status = input.next();
		return status;
	}
	
	public String getLocation() {
		System.out.print("Address:");
		String location = input.next();
		return location;
	}
	
	public int getContact() {
		System.out.print("Phone number: ");
		int contact =input.nextInt();
		return contact;
		
	}
	public void display() {
		String m= "male";
		if (getGender().equalsIgnoreCase(m)) {
			System.out.println();
			System.out.print("Welcome ");
			System.out.print("Mr. "+getFullName().toString());

		}else {
			System.out.println("not working");

		}
	}
}
