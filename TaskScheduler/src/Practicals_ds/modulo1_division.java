package Practicals_ds;
import java.util.Scanner;

public class modulo1_division {

	static final int SIZE = 10;
	static int[] hashTable = new int[SIZE];
	
	static int hashFunction(int key) {
		return key%SIZE;
	}
	
	static void display() {
		System.out.println("\nHash Table: ");
		for(int i = 0; i<SIZE;i++) {
			if(hashTable[i]!=0) {
				System.out.println("index "+i+" : "+hashTable[i]);
			}else {
				System.out.println("index "+i+" : Empty");
			}
		}
	}
	
	static void insert(int key) {
		int index = hashFunction(key);
		hashTable[index]=key;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of elements: ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.print("enter key: ");
			int key = sc.nextInt();
			insert(key);
		}
		
		display();
		sc.close();
		
	}
}
