package Queue;

public class Main {
       
	public static void main(String[] args) throws EmptyQueueException{
	   	 
//       Queue q1 = new Queue(5);
//       for(int i=1;i<=10;i++) {
//       	   q1.enqueue(i);
//       }
//       q1.show();
		Queue q = new Queue();
		for(int i=1;i<=5;i++) {
			q.enqueue(i);
		}
		q.dequeue();
		q.enqueue(66);
		q.dequeue();
		q.enqueue(77);
		
		q.show();
	}

}
