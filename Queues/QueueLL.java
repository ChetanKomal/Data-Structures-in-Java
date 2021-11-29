package Queue;

public class QueueLL<T> {

	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	public QueueLL() {
		this.front = null;
		this.rear = null;
		this.size = 0;
	}
	
	int size() {
		return size;
	}
	
	T front() throws EmptyQueueException{
		if(size == 0) {
			throw new EmptyQueueException();
		}
		return front.data;
	}
	
	public boolean isEmpty() {
		return (size == 0);  
	}

	void show() {
		Node<T> temp = front;
		while(temp!= null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public void enqueue(T elem) {
        Node<T> newnode = new Node<>(elem);
        if(rear == null) {
        	rear = newnode;
        	front = newnode;
        }else {
        	rear.next = newnode;
        	rear = newnode;
        }size++;
	}
	public T dequeue() throws EmptyQueueException{
	 if(size ==0) {
		 throw new EmptyQueueException();
	 }
	 T temp = front.data;
	 front = front.next;
	 if(size == 1) {
		 rear = null;
	 }
	 size--;
	 return temp; 
	}
	
}
