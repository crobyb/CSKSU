/*
This class define a linked list that stores integer values.
*/

public class LinkedList
{
	public Node head, tail;


	//constructor method to create a list of object with head, tail, and size. 

	public LinkedList()
	{
		head = null;
		tail = null;
	}
  
	//method add node to end of list
	public void addLastNode(int data) 
	{
		if (tail == null) 
			head = tail = new Node(data); //populates empty list
		else 
		{
			tail.next = new Node(data); //link new node as last node
			tail = tail.next; //make tail pointer points to last node
		}
	}
  
	//======== Your part to complete for this assignment =========
   
	//method #1: add first node
	public void addFirstNode(int data)
	{
		Node temp = head;
		head = new Node(data);
		head.next = temp;
	}
      
	//method #2: add node at index
	public void addAtIndex(int index, int data)
	{
		if(index < 0 || index > this.countNodes())
		{
			int count = 0;
			Node temp;
			temp = head;
			while(count != index)
			{
				temp = temp.next;
				count++;
			}
			temp.next = new Node(data);
			tail.next = temp;
		}
	}
      
	//method #3: remove first node
	public void removeFirstNode()
	{
		head = head.next;
	}
      
	//method #4: remove last node
	public void removeLastNode()
	{
		Node temp = ;
		int count = 0;
		while(count != this.countNodes() - 1)//iterates
		{
			temp = head.next.next;
		}
		head = temp;
	}
    
	//method #5: remove node at index
	public void removeAtIndex(int index)
	{
		int count = 0;
		Node temp1 = head;
		while(count != index)
		{
			temp1 = head.next;
			count++;
		}
		
	}
          
	//method #6: countNodes
	public int countNodes()//this method returns the list size
	{
		int listSize= 0;
  	   	Node temp;
  	   	temp = head;
  	   	while(temp != null)
  	   	{
  	   		listSize++;
  	   		temp = temp.next;
  	   	}
  	   	return listSize;
	}
   
	//method #7: pritnInReverse  (Recursive method)
	public void printInReverse(Node L)
	{
		//complete this method as recursive methods
	}

	//================= end of your part ==============

	//method to print out the list
	public void printList() 
	{
		Node temp;
		temp = head;
		while (temp != null)
		{
			System.out.print(temp.data + "   ");
			temp = temp.next;
		}
	}
  
	//class to create nodes as objects
	private class Node
	{
		private int data;  //data field
		private Node next; //link field
       
		public Node(int item) //constructor method
		{
			data = item;
			next = null;
		}
	}
}

