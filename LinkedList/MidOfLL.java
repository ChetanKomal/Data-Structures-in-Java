package LinkedList;

public class MidOfLL {
	//this is by using lllength.
   public static void midpoint(Node<Integer> head) {
	 Node<Integer> i = Main.ithelementLL((Main.LengthLL(head)-1)/2, head);
	 System.out.print(i.data);
   }
   
   //without using lllength
   public static void midpoint1(Node<Integer> head) {
	   if (head==null || head.next==null)
       {
           System.out.print("empty LL");
           return;
       }
	   Node<Integer> slow = head;
	   Node<Integer> fast = head;
	   while(fast.next != null && fast.next.next!= null) {
		   slow = slow.next;
		   fast = fast.next.next;
	   }
	   System.out.print(slow.data);
	   
   }
}
