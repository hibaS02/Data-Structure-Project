
public class LinkedList {
	private Node first; 
	public LinkedList() {
		first =null;
	}
	public boolean isEmpty() {
		if (first==null)
			return true;
		else
			return false;
	}
	public void insertAtBack(String a) {
		Node current = first;
		Node newNode = new Node(a);
		if (!isEmpty()) {
			while(current.next!=null)
				current=current.next;
			current.next=newNode;
		}else
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
	public void display() {
		Node current = first;
		while(current!=null) {
			System.out.println(current.data);
			System.out.println();
			current=current.next;
		}
		
	}
}
