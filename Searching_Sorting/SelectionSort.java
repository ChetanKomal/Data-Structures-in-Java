package Searching_Sorting;
public class SelectionSort {
public static int[] sort(int[] arr) {
         for(int i=0;i<arr.length;i++) {
        	 int min_idx = i;
        	 for(int j=i+1;j<arr.length;j++) {
        		 if(arr[j]<arr[min_idx]) {
        			 min_idx = j;
        		 }
        	 }
        	 int temp = arr[min_idx];
        	 arr[min_idx] = arr[i];
        	 arr[i] = temp;
         }
return arr;
}
}
