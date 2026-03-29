package Practicals_ds;

public class selection_sort {
	
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		
		for(int i = 0; i<n-1;i++) {
			int min = i;
			
			for(int j = i+1; j<n;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			//swap
			int temp = arr[min];
			arr[min] =  arr[i];
			arr[i] = temp;
		}
	}
	
	public static void main(String[] args) {
	   int[] arr = {7,4,10,8,3,1};
	   selectionSort(arr);
	   
	   for(int i = 0; i<arr.length;i++) {
		   System.out.println("Selection sort" +arr[i] + " ");
	   }
	   System.out.println();
	}

}
