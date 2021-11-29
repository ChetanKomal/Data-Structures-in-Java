package LinkedList;

public class Node<T> {
   T data;
   Node<T> next;
   Node(){
	   this.data=null;
	   this.next =null;
   }
   Node(T data){
	   this.data = data;
	   this.next = null;
   }
 	
} 