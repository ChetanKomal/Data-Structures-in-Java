package Searching_Sorting;
//pivot is the ist element of array.
public class QuickSort {

	public static void swap(int[] arr,int i,int j) {
		int temp =0;
		temp = arr[i];
		arr[i] =arr[j];
		arr[j] =temp;
	}
	
	public static void quicksort(int[] arr,int l,int h) {
		if(l<h) {
			int pivot = partition(arr,l,h);
			quicksort(arr,l,pivot-1);
			quicksort(arr,pivot+1,h);
		}
	}
	
	public static int partition(int[] arr,int l,int h) {
		int pivot = arr[l];
		int i =l;
		int j = h;
		while(i<j) {
			while(arr[i]<=pivot) {
				i++;
			}
			while(arr[j]>pivot) {
				j--;
			}
			if(i<j) {
				swap(arr,i,j);
			}
		}
		swap(arr,j,l);
		return j;
	}
}
