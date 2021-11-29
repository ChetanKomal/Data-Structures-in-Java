package Searching_Sorting;

public class BinarySearch {
    public static boolean search(int[] arr,int data) {
    	int low =0;
    	int high = arr.length-1;
    	
    	while(low<=high) {
    	
    		int mid = low + (high-low)/2;
    	
    	if(arr[mid] == data) {
    		return true;
    	}
    	else if(arr[mid]<data) {
    		low = mid + 1;
    	}
    	else {
    		high = mid - 1;
    	}
    	}
    		return false;
    }
}
