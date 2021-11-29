/*Stack implementation using only Array*/
package Stack;
public class Stack {
	
    private int data[];
    private int top;
    
    //constructor 1
    public Stack() {
    	data = new int[10];
        top = -1;
    }
    
    //constructor 2 
    public Stack(int capacity) {
		data = new int[capacity];
    	top = -1;
    }
    
    //returns stack size
    public int size() {
    	return top+1;
    }
    
    //check for empty stack
    public boolean isEmpty() {
      return (top==-1);	
    }
    
    //increase the stack size by 2x when limit is reached
    private void incrcap() {
    	int[] temp = data; // copy the data of data array to temp array
    	data = new int[2*temp.length];
    	for(int i=0;i<temp.length;i++) {
    		data[i]=temp[i];
    	}
    }
    
    //add elem to the top of stack
    public void push(int elem) {
    	if(size() == data.length) {
    		incrcap();
    	}
    	top++;
    	data[top]=elem; 
    }
    
    //removes the top elem
    public void pop() throws EmptyStack{
    	if(size() == 0) {
    		EmptyStack e = new EmptyStack();
    		throw e;
    	}else {
    	top--;}
    }
    
    //prints all the elements of stack
    public void show() {
    	for(int x: data) {
    		System.out.print(x+" ");
    	}
    }
    
    //gives the top elem
    public int top() {
    	return data[top];
    }
}
