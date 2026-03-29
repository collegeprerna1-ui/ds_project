package Practicals_ds;
import java.util.Scanner;

public class Digit_Extraction {
	
	static int hashFuntion(int key) {
		return key%100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Key: ");
		int key = sc.nextInt();
		int index = hashFuntion(key);
		System.out.println("Hash Index: "+index);
		
		sc.close();
				
	}

}
