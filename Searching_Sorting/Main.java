package Searching_Sorting;

public class Main {
	
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}


	public static void main(String[] args) {
        int[] arr  = {3,4,1,1,8,6,6,9,5,2,7,7,7};
		QuickSort.quicksort(arr,0,arr.length-1);
        print(arr);
	}

}
