package Practicals_ds;
import java.util.Scanner;

public class StackArray {
	int size;
	int top;
	int stack[];
	
	StackArray(int size){
		this.size = size;
		stack = new int[size];
		top = -1;
	}
	
	//push
	void push(int value) {
		if(top == size-1) {
			System.out.println("stack overflow"+value);
		}
		else {
			top++;
			stack[top]=value;
			System.out.println(value+"pushed intoo stack");
		}
	}
	
	//pop
	void pop() {
		if(top==-1) {
			System.out.println("stack is empty");
		}else {
			System.out.println(stack[top]+"popped from the stack");
			top--;
		}
	}
	
	void peek() {
		if(top==-1) {
			System.out.println("empty stack");
		}else {
			System.out.println(stack[top]+"is the top element");
		}
	}
	
	//display
	void display() {
		if(top==-1) {
			System.out.println("stack is empty");
		}else {
			System.out.println("stack element are: ");
			for(int i = top; i>=0;i--) {
				System.out.println(stack[i]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();
        
        StackArray s = new StackArray(size);
        
        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
        s.peek();

        s.pop();
        s.display();

        sc.close();

	}

}
