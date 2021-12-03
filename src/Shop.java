import java.util.*;
import java.text.SimpleDateFormat;  
 
public class Shop {
	Scanner input = new Scanner(System.in);

	static Node node;
	static LinkedList ll = new LinkedList();
	CustomerInfo CI = new CustomerInfo();
	//Each node refers to a car
	
	
	public static void OurCars() {
		Cars c1 = new Cars("Sports", "Ferrari", "Red", 2021, 200);
		Cars c2 = new Cars ("Luxury", "Mercedes","Black",2015,100);
		Cars c3= new Cars("Economics","Kia","Red", 2012, 15);
		Cars c4= new Cars("Luxury","Range Rover","Black", 2017, 120);
		Cars c5= new Cars("Sports","Dodge","Black", 2015, 130);
		Cars c6= new Cars("Luxury","Bentley","Black", 2016, 170);
		Cars c7= new Cars("Economics","Hyundai","Bronze", 2019, 25);
		Cars c8= new Cars("Sports","Lamborghini","Blue", 2018, 300);
		Cars c9= new Cars("Luxury","Cadillac","White", 2017, 130);
		Cars c10= new Cars("Luxury","GMC-Yokun","Black", 2019, 200);
		
		ll.insertAtBack("1.\n"+c1.toString());
		ll.insertAtBack("2.\n"+c2.toString());
		ll.insertAtBack("3.\n"+c3.toString());
		ll.insertAtBack("4.\n"+c4.toString());
		ll.insertAtBack("5.\n"+c5.toString());
		ll.insertAtBack("6.\n"+c6.toString());
		ll.insertAtBack("7.\n"+c7.toString());
		ll.insertAtBack("8.\n"+c8.toString());
		ll.insertAtBack("9.\n"+c9.toString());
		ll.insertAtBack("10.\n"+c10.toString());
		//ll.display();

		
	}
	public void chooseCar() {
		System.out.println("Enter the number of the car that you want:");
		int carNumber = input.nextInt();
		node=ll.deleteAtIndex(carNumber-1);
	}
	public void WelcomeNote() {
		System.out.println("Welcome to Rent A Car! \nWhere we have a wide variety of cars to pamper yourself with:");
		System.out.println("Please note that all our prices are in USD/day: \n");
		System.out.println("Would you like to rent now?");
		String ans= input.next();
		String y="yes";
		String n="no";
		OurCars();
		ll.display();
		if(ans.equals(n)) {
			System.out.println("Thank you for visting our shop! Have a look around.");
			
		}else if(ans.equals(y)) {
			System.out.println("Take a look at our available cars!");
			//display the cars and let the customer choose
			
			chooseCar(); 
			ll.display();
			System.out.println("Rental form");
			//take customerInfo
			CI.customer();
			reciept();
		}
		
		if(isEmpty())
			System.out.println("We are closed today!");
	}
	public boolean isEmpty() {
		if (Cars.counter==0) 
			return true;
		return false;
	}
	public void reciept() {
		System.out.println("\nRent A Car");
		CI.display();
		System.out.println("Car Details: "+node.data);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
		System.out.print("Date: "+formatter.format(date));
		
	}

	
}
