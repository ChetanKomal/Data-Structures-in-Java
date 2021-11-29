package Searching_Sorting;

public class TernarySearch {
public static boolean search(int[] arr,int data) {
	int low = 0;
	int high = arr.length-1;
	while(high>=low) {
		int mid1 = low+(high-low)/3;
		int mid2 = high-(high-low)/3;
		if(arr[mid1]==data) {
			return true;
		}
		if(arr[mid2]==data) {
			return true;
		}
		else if(arr[mid2]<data) {
			low = mid2+1;
		}
		else if(arr[mid1]>data) {
			high =  mid1-1;
		}
		else {
			low= mid1+1;
			high = mid2-1;
		}
	}
	return false;
}
}
