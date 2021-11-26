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
