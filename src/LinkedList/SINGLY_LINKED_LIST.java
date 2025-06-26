package LinkedList;
class Node{
	int data;
	Node link;
}
class Method{
	static Node head;
	public static void insertAtBegain(int data) {
		Node newNode=new Node();
		newNode.data=data;
		newNode.link=null;
		if(head==null) {
		head=newNode;	
		}
		else
		{
			newNode.link=head;
			head=newNode;
		}
		  //System.out.print(head);
	}
	public static void traverse()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.link;
		}
	}
	public static void insertend(int data)
	{
		Node newNode=new Node();
		Node temp=head;
		newNode.data=data;
		newNode.link=null;
		if(head==null) {
		head=newNode;	
		}
		else
		{
			while(temp.link!=null)
			{
				temp=temp.link;
			}
			temp.link=newNode;
		}
	//	System.out.println(data);
	}
	public static void insertatmiddle(int data,int pos)
	{
		Node newNode=new Node();
		Node temp=head;
		newNode.data=data;
		newNode.link=null;
		int a=1;
		while(a<pos)
		{
			a=a+1;
			temp=temp.link;
		}
		newNode.link=temp.link;
		temp.link=newNode;
	}
	//System.out.println(newNode.data);
}


public class SINGLY_LINKED_LIST extends Method{
	public static void main(String[] args) {
		insertAtBegain(1);
		insertend(2);
		insertend(3);
		insertend(4);
		insertend(5);
		insertatmiddle(6,3);
		traverse();
		
	}

}
