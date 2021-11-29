package Trees;

import java.util.Scanner;

import Queue.EmptyQueueException;
import Queue.QueueLL;
public class Main {
	//using recursion takeinput;
    public static TreeNode<Integer> takeinput(Scanner s){
    	int n;
    	System.out.println("enter next node data");
    	n= s.nextInt();
    	TreeNode<Integer> root = new TreeNode<>(n);
    	System.out.println("enter number of nodes");
    	int children = s.nextInt();
    	for(int i=0;i<children;i++) {
    		TreeNode<Integer> child = takeinput(s);
    		root.children.add(child);
    	}
    	return root;
    }
    //using recursion print;
    public static void print(TreeNode<Integer> root){
    	String s =  root.data+":";
        for(int i=0;i<root.children.size();i++) {
        	s=s+root.children.get(i).data+",";
        }
        System.out.println(s);
        for(int i=0;i<root.children.size();i++) {
        	print(root.children.get(i));
        }
    }
    //without recursion tkinpt;
    public static TreeNode<Integer> takeinput2() throws EmptyQueueException{
        Scanner s = new Scanner(System.in);
        System.out.println("enter root data");
        int rootdata =s.nextInt();
        TreeNode<Integer> root = new TreeNode<>(rootdata);
        QueueLL<TreeNode<Integer>> pending = new QueueLL<>();
        pending.enqueue(root);
        while(!pending.isEmpty()) {
        	TreeNode<Integer> front = pending.dequeue();
        	System.out.println("enter no. of childern of "+front.data);
        	int children = s.nextInt();
        	for(int i=1;i<=children;i++) {
        		System.out.println("enter the "+i+"th element of "+front.data);
        		int nn = s.nextInt();
        		TreeNode<Integer> child = new TreeNode<>(nn);
        		front.children.add(child);
        		pending.enqueue(child);
        	}
        }
        s.close();
        return root;
    }
    //without recursion print, count total nodes and sum of all nodes;
    public static int print2(TreeNode<Integer> root) throws EmptyQueueException {
        int count = 0;
        int x = 0;
    	QueueLL<TreeNode<Integer>> q = new QueueLL<>();
    	q.enqueue(root);
        while(!q.isEmpty()) {
        	TreeNode<Integer> temp = q.dequeue();
           	count++;
        	String s = temp.data+":";
        	 x += temp.data;
            for(int i=0;i<temp.children.size();i++) {
            	s=s+temp.children.get(i).data+",";
            	q.enqueue(temp.children.get(i));
            }
            System.out.println(s);
        }
        System.out.println();
        return x;
    }
	//no of nodes recursive;
    public static int totalNodes(TreeNode<Integer> root) {
    	if(root == null) {
    		return 0;
    	}
    	int count =1;
    	for(int i=0;i<root.children.size();i++) {
    		count += totalNodes(root.children.get(i));
    	}
    	return count;
    }
    //no of nodes without recursion TODO;
    
    //sum of all nodes recursive;
    public static int sum(TreeNode<Integer> root) {
    	int sum=root.data;
    	for(int i=0;i<root.children.size();i++) {
    		sum += sum(root.children.get(i));
    	}
    	return sum;
    }
    //largest node recursively;
    public static int largestNode(TreeNode<Integer> root) {
    	if(root == null) {
    		return 0;
    	}
    	int child = root.data;
        for(int i =0;i<root.children.size();i++) {
        	int chlar = largestNode(root.children.get(i));
        	if(chlar>child) {
        		child = chlar;
        	}
        }
    	return child;
    }
    public static void main(String[] args) throws EmptyQueueException {
		//Scanner s = new Scanner(System.in);
//		TreeNode<Integer> root  = new TreeNode<>(4);
//		TreeNode<Integer> node1  = new TreeNode<>(2);
//		TreeNode<Integer> node2  = new TreeNode<>(3);
//		TreeNode<Integer> node3  = new TreeNode<>(4);
//		TreeNode<Integer> node4  = new TreeNode<>(6);
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		node3.children.add(node4);
		TreeNode<Integer> root = takeinput2();
		print2(root);
        System.out.println(largestNode(root));
	}

}
