//Tajinder Sharma
// Exercise for Linked Stack
package graphs;

public final class LinkedStack<T> implements StackInterface<T>{
	private Node topNode; 

	
	public LinkedStack(){
		topNode = null;
	}
	
	public void push(T newEntry){
		Node newNode = new Node(newEntry, topNode);
		topNode = newNode;
	}
	
	public T pop(){
		T top = peek();
		assert topNode != null;
		topNode = topNode.getNextNode();
		return top;
	}
	
	public T peek(){
		if(isEmpty())
		{
			//throw new EmptyStackException();
			return null;
		}
		else 
			return topNode.getData(); 	
	}
	
	
	public boolean isEmpty(){
		return topNode == null;
	}
	
	public void clear(){
		topNode = null;
	}
	
	private class Node{
		private T data;
		private Node next;
		
		private Node(T dataPortion){            
			this(dataPortion, null);        
		} 
		
		private Node(T dataPortion, Node nextNode){            
			data = dataPortion;            
			next = nextNode;        
		} 
		
		private T getData() {            
			return data;
		} 
		
		
		private Node getNextNode() {            
			return next;        
		} 
		
	}// end Node
 

}// end LinkedStack
