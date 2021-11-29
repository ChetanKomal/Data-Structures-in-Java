/*the Main.java may get modified depending on questions i am doing and the requirements.*/
package LinkedList;
import java.util.Scanner;

public class Main {
	//with O(n^2)
	public static Node<Integer> TakeInput1(){
	    Node<Integer> head = null;
	    Scanner sc = new Scanner(System.in);
	    int data = sc.nextInt();
		while(data != -1) {
			Node<Integer> NewNode = new Node<>(data);
			if(head==null) {
				head = NewNode;
			}else {
				Node<Integer> temp = head;
				while(temp.next != null) {
				    	temp = temp.next;
				}
				temp.next = NewNode;
			}
	    	data = sc.nextInt();
	    }
		sc.close();
		return head;	
	}
	
	
	//with O(n)
	public static Node<Integer> TakeInput(){
		Node<Integer> head = null;
		Node<Integer> tail = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		while(data != -1) {
			Node<Integer> NewNode = new Node<Integer>(data); 
			if(head == null) {
			 head= NewNode;
			 tail = NewNode;
			}
			else {
				tail.next = NewNode;
				tail = NewNode;
			}
			data = sc.nextInt();
		}
		sc.close();
		return head;
	}
	
	
	public static void printLL(Node<Integer> head) {
		while(head != null)
		{
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}
	
	
	public static int LengthLL(Node<Integer> head) {
		int count=0;
		while(head!= null) {
			count++;
			head=head.next;
		}
		return count;
	}
	
	
	public static Node<Integer> ithelementLL(int index, Node<Integer> head) {
		int count=0;
//		  Node<Integer> t = head;
//        int j=0;
//        while(j<i){
//            t=t.next;
//            j++;
//        }
//        System.out.print(t.data);
		while(head!=null) {
		 	count++;
		 	if(index == count-1)
		 	{
		 	   break;
		 	}
		 	head = head.next;
		}
		return head;
	}
	
	
	public static Node<Integer> insert(Node<Integer> head,int pos,int data){
		Node<Integer> NewNode = new Node<Integer>(data);
		if(pos ==0) {
			NewNode.next = head;
			return NewNode;
		}
		int i=0;
		Node<Integer> temp = head;
		while(i<pos-1) {
			temp = temp.next;
			i++;
		}
		NewNode.next = temp.next;
		temp.next = NewNode;
		return head;
	}
	
	
	public static Node<Integer> delete(Node<Integer> head,int pos) {
		int i=0;
		Node<Integer> temp = head;
		if(pos == 0) {
			head = head.next;
			return head;
		}
		while(i<pos-1 && temp!=null) {
			temp = temp.next;
			i++;
		}
		temp.next = temp.next.next;
		return head;
	}
	
	
	public static void search(Node<Integer> head,int data) {
		Node<Integer> temp = head;
		int c=0;
		while(temp.next != null) {
			if(temp.data == data) {
				c=1;
				break;
			}
			else
			temp = temp.next;
			}
		if(c==1) {
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}
	}
	
	
	//O(n)
	public static Node<Integer> printRev(Node<Integer> head){
		Node<Integer> prev = null;
		Node<Integer> current = head;
		while(current!=null) {
			Node<Integer> next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
	
	
	//more easy way to reverse
	public static void printRev1(Node<Integer> head) {
		int len = LengthLL(head);
		for(int i= len-1;i>=0;i--) {
			System.out.print(ithelementLL(i,head).data+" ");
		}
	}
	
	
	//reverse using recursion
	public static void printRev2(Node<Integer> head){
		if(head == null) return;
		printRev2(head.next);
		System.out.print(head.data+" ");
	}
	
	//this method will add data to end of LL.
	public static Node<Integer> push(Node<Integer> head,int data) {
		Node<Integer> newNode = new Node<>(data);
		Node<Integer> temp = head;
		while(temp.next!= null) {
			temp = temp.next;
		}
		temp.next = newNode;
		return head;
	}
	
	
	public static void main(String[] args) {
     //Node<Integer> LL1 = new Node<Integer>();
		Node<Integer> LL1 = TakeInput();
//      Scanner sc = new Scanner(System.in);
//      System.out.print("Enter Index: ");
//      int index = sc.nextInt();
//      ithelementLL(index,LL1);
//      sc.close();
      //LL1 = insert(LL1,3,4);
      //LL1 = delete(LL1,5);
      //search(LL1,3);
      //printLL(LL1);
      //LL1 = AppendLastnToFirstQuestion.soluction(LL1,5);
      //LL1 = PrintRev(LL1);

//      LL1 = printRev(LL1);
//      System.out.println();
//      printRev1(LL1);
//      System.out.println();
//      printLL(LL1);
      //printRev2(LL1);
	  
      //MidOfLL.midpoint1(LL1);
      MidOfLL.midpoint1(LL1);
      
	}
	
}

