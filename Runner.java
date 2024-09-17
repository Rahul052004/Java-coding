class Node{
	int data;
	Node next;
}


class Linkedlist{
	Node head;
	
	public void insert(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		if(head==null)
		{
			head=node;
		}
		else{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
			
		}
		
	}
	
	public void insertAtfirst(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		node.next=head;
		head=node;
	}
	
	
	public void insertAtpos(int pos, int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(pos==0)
		{
			insertAtfirst(data);
		}
		else{
			Node n= head;
			for(int i=0;i<pos-1;i++)
			{
				n=n.next;
			}
			node.next=n.next;
			n.next=node;
		}
	}


	public void show()
	{
		Node node=head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
		
}

public class Runner{
	public static void main(String args[])
	{
		Linkedlist list=new Linkedlist();
		list.insert(18);
		list.insert(20);
		list.insert(24);
		list.insertAtfirst(15);
		list.insertAtpos(3,25);
		list.show();
		
		
	}
}
