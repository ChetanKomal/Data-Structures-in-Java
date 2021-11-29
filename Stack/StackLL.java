package Stack;

public class StackLL<T> {
      private Node<T> head;
      private int size;
      
      public StackLL() {
    	  this.head=null;
    	  this.size=0;
      }
      int size() {
    	  return size;
      }
      boolean isEmpty() {
    	  return (size()==0);
      }
      void Top() throws EmptyStack{
    	  if(size()==0) {
    		  throw new EmptyStack();
    	  }
    	  System.out.println(head.data);
      }
      void push(T elem) {
    	Node<T> newnode = new Node<T>(elem);
  		newnode.next = head;
  		head = newnode;
  		size++;
      }
      void pop() throws EmptyStack{
    	  if(size()==0) {
    		  throw new EmptyStack();
    	  }
    		  head = head.next;
    	      size--;
    	  
      }
      void print() {
    	  Node<T> temp = head;
    	  while(temp!=null) {
  			System.out.print(temp.data+" ");
  			temp= temp.next;
  		}
    	  System.out.println();
          
      }
      
      


}

