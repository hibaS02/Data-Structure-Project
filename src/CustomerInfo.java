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
	
	public void getContact() {
		System.out.print("Phone number: ");
		int contact =input.nextInt();
		
		
	}
	public void display() {
		System.out.print("Welcome ");
		//String gender = getGender();
		String m= "male";//hek azdik?btzbt ?a
		if (getGender()=="m") {// haide el gender hon bade yehaa tekhod el input value li hatta el user bl getGender method 
			System.out.print("Mr. "+firstName+" "+lastName);
			System.out.println(getGender());
		}else {
			System.out.println("sherke");// w ha krml shuf shu aam ysir 5ALINE EKBOS ELE SE3A 3AM JARIB ez AHHAHAH ok rja3e farjine sorry aam tawil 3leik aatine 1 min eza b3d bet2ule sorry 7a shutik ma fik w ma fiyyye ma oul sorry l2n aam bkhdlk mn wa2tak aal fade 
			// okay so
		}//okay fike tzakrine shu ken badik ta3mle?  bade haide el gender taamol referc=nce aa ha 
	}
}
