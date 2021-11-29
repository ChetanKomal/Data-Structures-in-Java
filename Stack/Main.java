package Stack;

public class Main {

	public static void main(String[] args) throws EmptyStack {
//		Stack s1 = new Stack(3);
//        s1.push(1);
//        s1.push(2);
//        s1.push(3);
//        s1.push(4);
//        s1.push(5);
//        s1.push(6);
//        while(!s1.isEmpty()) {
//        	s1.pop();
//        }
//        System.out.print(s1.isEmpty());
//        s1.show(); 
        
		//StackLLCK<Integer> s1 = new StackLLCK<Integer>();
        StackLL<Integer> s1 = new StackLL<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.print();
        
        s1.print();
        
	}

}
