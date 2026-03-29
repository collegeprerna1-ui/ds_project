package Practicals_ds;

import java.util.Arrays;

public class shell_sort {
	
	public static void shellSort(int[] arr) {
		int n = arr.length;
		
		for(int gap = n/2; gap>0; gap/=2) {
			for(int i = gap; i<n; i+=1) {
				int temp = arr[i];
				int j;
				for(j=i; j>=gap && arr[j-gap]>temp; j-=gap) {
					arr[j] = arr[j-gap];
				}
				arr[j] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] data = {23,29,15,19,31,7,9,5,2};
		
		System.out.println("original array: "+ Arrays.toString(data));
		
		shellSort(data);
		
		System.out.println("sorted array: "+ Arrays.toString(data));
		
	}

}
