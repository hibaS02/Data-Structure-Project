
public class LinkedList {
	Node first;
	String customer;
	public boolean isEmpty() {
		if(customer==null)
			return true;
		else
			return false;
	}
	public void insertAtBack(String customer)
	{
		Node newNode=new Node(customer);
		Node current=first;
		if(!isEmpty())
		{
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=newNode;
		}
		else
			first=newNode;
	}
	public String deleteFromFront()
	{
		if(first!=null)
		{
			String a=first.data;
			first=first.next;
			return a;
		}
		return null;
	}
	public void display(){
		Node n = first;
		int count=0;
		System.out.println("The number of people currently waiting for rental is: ");
		while(n!=null){
			//System.out.println(n.data);
			n = n.next;
			count++;
		}
		System.out.println(count);	
	}
}
