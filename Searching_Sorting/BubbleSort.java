package Searching_Sorting;

public class BubbleSort {
public static int[] sort(int[] arr) {
	int temp =0;
	boolean swap = true;
	for(int i=0;i<arr.length;i++) {
		for(int j =0;j<arr.length-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				swap = true;
			}
		}
		if(swap == false) break;
	}
	return arr;
}
}