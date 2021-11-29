package Searching_Sorting;

public class LinearSearch {

	public static boolean search(int[] arr,int data) {
		for(int i=0;i<arr.length;i++) {
			if(data == arr[i]) {
				return true;
			}
		}
		return false;
	}
}
