package Task;

import java.util.*;

//Student class
class Student {
 int id;
 String name;

 Student(int id, String name) {
     this.id = id;
     this.name = name;
 }

 public String toString() {
     return "ID: " + id + ", Name: " + name;
 }
}

//Main class
public class StudentManagement {

 static ArrayList<Student> students = new ArrayList<>();
 static Stack<Student> deletedStudents = new Stack<>();
 static Queue<Student> serviceQueue = new LinkedList<>();

 static Scanner sc = new Scanner(System.in);

 public static void main(String[] args) {
     int choice;

     do {
         System.out.println("\n--- Student Management System ---");
         System.out.println("1. Add Student");
         System.out.println("2. View Students");
         System.out.println("3. Delete Student");
         System.out.println("4. Undo Last Delete");
         System.out.println("5. Add to Service Queue");
         System.out.println("6. Serve Next Student");
         System.out.println("7. Exit");
         System.out.print("Enter choice: ");

         choice = sc.nextInt();

         switch (choice) {
             case 1 -> addStudent();
             case 2 -> viewStudents();
             case 3 -> deleteStudent();
             case 4 -> undoDelete();
             case 5 -> addToQueue();
             case 6 -> serveStudent();
             case 7 -> System.out.println("Exiting...");
             default -> System.out.println("Invalid choice!");
         }

     } while (choice != 7);
 }

 static void addStudent() {
     System.out.print("Enter ID: ");
     int id = sc.nextInt();
     sc.nextLine();
     System.out.print("Enter Name: ");
     String name = sc.nextLine();

     students.add(new Student(id, name));
     System.out.println("Student added successfully.");
 }

 static void viewStudents() {
     if (students.isEmpty()) {
         System.out.println("No students available.");
         return;
     }
     for (Student s : students) {
         System.out.println(s);
     }
 }

 static void deleteStudent() {
     System.out.print("Enter ID to delete: ");
     int id = sc.nextInt();

     Iterator<Student> it = students.iterator();
     while (it.hasNext()) {
         Student s = it.next();
         if (s.id == id) {
             deletedStudents.push(s);
             it.remove();
             System.out.println("Student deleted.");
             return;
         }
     }
     System.out.println("Student not found.");
 }

 static void undoDelete() {
     if (deletedStudents.isEmpty()) {
         System.out.println("Nothing to undo.");
     } else {
         students.add(deletedStudents.pop());
         System.out.println("Last delete undone.");
     }
 }

 static void addToQueue() {
     System.out.print("Enter student ID to add to queue: ");
     int id = sc.nextInt();

     for (Student s : students) {
         if (s.id == id) {
             serviceQueue.offer(s);
             System.out.println("Student added to service queue.");
             return;
         }
     }
     System.out.println("Student not found.");
 }

 static void serveStudent() {
     if (serviceQueue.isEmpty()) {
         System.out.println("No students in queue.");
     } else {
         System.out.println("Serving: " + serviceQueue.poll());
     }
 }
}
