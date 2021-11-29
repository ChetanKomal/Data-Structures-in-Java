package Searching_Sorting;

public class MergeSort {
	
	static void mergesort(int[] arr,int l,int r) {
		if(l<r) {
			int mid = (l+r)/2;
	        mergesort(arr,l,mid);
	        mergesort(arr,mid+1,r);
	        Merge(arr,l,mid,r);
		}
	}
	
	static void Merge(int[] arr, int l,int mid,int r) {
		
		int i = l;
		int j = mid+1;
		int k = l;
		int b[] = new int[r+1];
		while(i<=mid && j<=r) {
			if(arr[i]<arr[j]) {
				b[k]=arr[i];
				i++;
			}else {
				b[k]=arr[j];
				j++;
			}
			k++;
		}
		if(i>mid) {
			while(j<=r) {
				b[k]=arr[j];
				k++;
				j++;
			}
		}else {
			while(i<=mid) {
				b[k]=arr[i];
				k++;
				i++;
			}
		}
		for(int q=l;q<=r;q++) {
			arr[q]=b[q];
		}
	}
	
}
