package Practicals_ds;

public class insertion_sort {
	
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		
		for(int i = 1;i<n;i++) {
			
			int temp = arr[i];
			int j = i - 1;
			
			while(j>=0 && arr[j]>temp) {
				//swap
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr= {5,4,10,1,6,2};
		
		System.out.println("original array: ");
		printArray(arr);
		
		insertionSort(arr);
		
		System.out.println("sorted array: ");
		printArray(arr);
	}

}
