// import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

class LinkedList{
    Node head;
    public void insert(int data)
	{
		Node node=new Node(data);
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



    public void removelast()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if( head.next == null){
            head=null;
            return;
        }

        else{
            Node current=head;
            while(current.next.next!=null)
            {
                current=current.next;
            }
            current.next=null;
        }
    
    }

    public void show()
    {
       if(head==null)
       {
        System.out.println("Empty List");
       }

       Node current=head;
       
       while(current!=null)
       {
            System.out.print(current.data+"  ");
            current=current.next;
       }
       System.out.println();
    }

}

public class PalinLink {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        list.insert(4);
        list.insert(6);
        list.insert(9);
        list.insert(5);
        list.insert(10);

        System.out.println("Before remove");
        list.show();

        list.removelast();

        System.out.println("After remove");
        list.show();

    }
}
