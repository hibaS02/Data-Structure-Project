
public class CustomerList extends LinkedList {
	String customer;
	Node first;
	
	public CustomerList(String customer) {
		this.customer = customer;
		first=null;
	}
	public CustomerList(){
		super();
	}
	
	public void enqueue(String customer){
		super.insertAtBack(customer);
	}
	public String dequeue(){
		
		return super.deleteFromFront();
	}
	public void display(){
		super.display();
	}
}
