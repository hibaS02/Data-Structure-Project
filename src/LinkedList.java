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
	public Node deleteAtIndex(int carNumber) {
		 Node temp = first;
		if (first == null)
           return null;
       if (carNumber == 0)
       {
           first = temp.next;  
           return null;
       }
       if(temp!=null) {
	        for (int i=0;i<carNumber-1; i++)
	            temp = temp.next;
       }
       if (temp == null || temp.next == null)
           return null;  
       Node next = temp.next.next;
       temp.next = next; 
       return temp;
	}
	public void insertAtPosition(int position, String data)
    {
        Node node=new Node(data);
    	node.data=data;
    	node.next=null;
    	if(position==0) {
    		node.next=first;
    		first=node;
    	}
    	
    	else {
    	Node n=first;
    	for(int j=1;j<position-1;j++) {
    		n=n.next;
    	}
    	node.next=n.next;
    	n.next=node;
    	}
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
