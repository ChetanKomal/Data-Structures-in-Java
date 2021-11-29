//practise design by CK using Linked list;
package Stack;

public class StackLLCK<T> {

	private Node<T> head;
	private int size;
	
	public StackLLCK() {
		this.head = null;
		this.size =0;
	}
	
	void size() {
     System.out.println(size);  		
	}

	public void top() {
	  if(size==0) {
		  System.out.print("size zero");
	  }else {
		  System.out.print(head.data);
	  }
	}
	
	public boolean isEmpty() {
	  return (size==0);	
	}
	
	void push(T elem) {
		Node<T> newnode = new Node<T>(elem);
		newnode.next = head;
		head = newnode;
		size++;
	}
	
	void pop() {
     if(size==0) {
    	 System.out.print("Size zero");
     }else {
    	 head = head.next;
    	 size--;
     }
	}
	
	void print() {
		while(head!=null) {
			System.out.print(head.data+" ");
			head= head.next;
		}
	}
}
