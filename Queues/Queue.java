package Queue;

public class Queue {

	private int data[];
	private int size;
	private int front;
	private int rear;
	
	public Queue() {
		data = new int[5];
		front =-1;
		rear = -1;
		size=0;
	}
	public Queue(int capacity) {
		data = new int[capacity];
		front= -1;
		rear = -1;
		size= 0;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return (size()==0);
	}
	public int front() throws EmptyQueueException {
		if(size==0) {
			throw new EmptyQueueException();
		}
		return data[front];
	}
	private void doublecap() {
		int temp[] = data;
		data = new int[2*temp.length];
		int indx =0;
		for(int i= front ; i < temp.length;i++) {
			data[indx]=temp[i];
			indx++;
		}
		for(int i= 0;i <= front-1;i++) {
			data[indx] = temp[i];
			indx++;
		}
		
	}
	public void enqueue(int elem){
		if(size == data.length) {
			doublecap();
		}
		if(size==0) {
			front++;
		}      
		rear++;
		if(rear == data.length) {
			rear = 0;
		}
	    size++;
	    data[rear] = elem;
	}
	public void dequeue() throws EmptyQueueException{
		if(size == 0) {
			throw new EmptyQueueException();
		}
		size--;
		front++;
		if(front == data.length) {
			front =0;
		}
		if(size==0) {
			front = -1;
			rear  = -1;
		}
	}
	
	public void show() {	
        //print array as it is;
		for(int i=0;i<data.length;i++) {
        	System.out.print(data[i]+" ");
        }
		System.out.println();
		//print array acc to front and rear;
		for(int i= front ; i < data.length;i++) {
			System.out.print(data[i]+" ");
		}
		for(int i= 0;i <= front-1;i++) {
		    System.out.print(data[i]+" ");	
		}
        
    }
    public boolean isFull() {
    	return (size == data.length);
    }
}
