import java.util.*;


/**Linked list implementation using Java. Taken from Big Java Late Objects by
 Cay Horstmann fifth edition Wiley 2013 - Code written January 2017 **/


public class LinkedList
{
	private Node first; //reference to the first node


	public LinkedList(){first = null;} // constructor


	public Object getFirst()
	{
		if (first == null) { throw new NoSuchElementException(); }
		return first.data;


	}

	class Node
	{  //inner class to represent nodes
		public Object data;
		public Node next;


	}
	
	class MyIterator implements MyListIterator  // inner class for iterator
	{  
		private Node position;
		private Node previous;
		private boolean isAfterNext;
		
		public MyIterator()
		{
			position = null;
			previous = null;
			isAfterNext = false;
			
			
			
		}

		public void add(Object e) {
			// TODO Auto-generated method stub

		}
		@Override
		public boolean hasNext() {
			if (position == null)
			{
			return first != null;
			}
			else
			{
			return position.next != null;
			}
		}
		
		
		@Override
		public Object next() {
			
			if(!hasNext()){throw new NoSuchElementException();}
			previous = position;
			isAfterNext = true;
			
			if (position == null)
			{
				position = first;
				
				
			}
			
			else		
			{
				
				position = position.next;
				
			}

			
			return position.data;
		}
		
		
		
		@Override
		public void remove() {
			
			if (!isAfterNext) { throw new IllegalStateException(); }
			
			if (position == first)
			{
			removeFirst();
			}
			else
			{
			previous.next = position.next; 
			}
			position = previous; 
			isAfterNext = false; 
			}
			
			// TODO Auto-generated method stub

		
		@Override
		public void set(Object element) {
			if (!isAfterNext) { throw new IllegalStateException(); }
			position.data = element;

		}


	}

	public void addFirst(Object element)  //method to add first node to linked list
	{
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = first;

		first = new Node();

	}
	public Object removeFirst()  //method to remove first element in list
	{
		if(first == null){throw new NoSuchElementException();}
		Object element = first.data;
		first = first.next;
		return element; 

	}




}
