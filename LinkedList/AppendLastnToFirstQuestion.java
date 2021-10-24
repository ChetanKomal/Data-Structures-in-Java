/*  You have been given a singly linked list of integers along with an integer 'N'.
 *  Write a function to append the last 'N' nodes towards the front of the singly linked list 
 *  and returns the new head to the list.
 *  
    Sample Input 1 :
2
1 2 3 4 5 -1
3
10 20 30 40 50 60 -1
5
    Sample Output 1 :
3 4 5 1 2
20 30 40 50 60 10

 * */

package LinkedList;

public class AppendLastnToFirstQuestion {
 public static Node<Integer> soluction(Node<Integer> head,int data){
	 Node<Integer> temp = head;
	 int len = Main.LengthLL(head);
	 head = Main.ithelementLL(len-1, head);
	 head.next = temp;
	 head = temp;
	 int indexnull = (len-data)-1;
	 while(indexnull!=0) {
		 temp = temp.next;
		 indexnull--;
	 }
	 head = temp.next;
	 temp.next= null;
	 return head;
 }
}
