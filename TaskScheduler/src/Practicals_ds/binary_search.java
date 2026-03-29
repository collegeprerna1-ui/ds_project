package Practicals_ds;

public class binary_search {
	
	public static int binarySearch(int[] arr, int target) {
		
		int low = 0;
		int high = arr.length - 1;
		
		while(low<=high) {
			int mid = low + (high-low)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			if(arr[mid]<target) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
		
		int value_to_find = 12;
		
		int result = binarySearch(arr, value_to_find);
		
		if(result==-1) {
			System.out.println("value not found");
		}else {
			System.out.println("value found at index: "+result);
		}
	}

}
