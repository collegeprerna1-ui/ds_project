package Practicals_ds;
import java.util.Scanner;

public class linear_probe {
	
	static final int SIZE = 10;
	static int[] hashTable = new int[SIZE];
	
	static int hashFunction(int key) {
		return key%SIZE;
	}
	
	static void insert(int key) {
		int index = hashFunction(key);
		
		while(hashTable[index]!=0) {
			index = (index+1)%SIZE;
		}
		hashTable[index]=key;
	}
	
	static void display() {
		for(int i = 0; i<SIZE; i++) {
			if(hashTable[i]!=0) {
				System.out.println("Index " + i + " : " + hashTable[i]);
			}
			else {
				System.out.println("Index " + i + " : Empty");
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter key: ");
            int key = sc.nextInt();
            insert(key);
        }

        display();
        sc.close();
    
	}

}
