package Practicals_ds;

class ordinary_queue {
    int queue[];
    int front, rear, size;

    // Constructor
    ordinary_queue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // ENQUEUE
    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1)
                front = 0;
            rear++;
            queue[rear] = value;
            System.out.println(value + " inserted");
        }
    }

    // DEQUEUE
    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[front] + " deleted");
            front++;
        }
    }

    // DISPLAY
    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    // MAIN
    public static void main(String[] args) {
    	ordinary_queue q = new ordinary_queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();
        q.display();
    }
}
