import java.util.ArrayList;
import java.util.Scanner;

class Student{
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("ID: " +id + "| Name: " +name + " | Age: " +age);
    }
}

// __________________________________________________________________________________//
public class StudentManagmentSystem {
static ArrayList<Student> S1 = new ArrayList<>();
static Scanner sc = new Scanner(System.in);

//__________________________________________________________________________________//
    public static void main(String[] args){
        int choice;
        do {
            System.out.println("Student management System");
            System.out.println("1. Add student");
            System.out.println("2. Display all Students");
            System.out.println("3. search Student by ID");
            System.out.println("4. Delete Student by ID");
            System.out.println("5. Exit");
            System.out.println("Enter your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: displayStudent(); break;
                case 3: searchStudent(); break;
                case 4: deleteStudent(); break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }while (choice != 5);

    }

    private static void addStudent() {
        System.out.print("Enter id: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        S1.add(new Student(id, name, age));
        System.out.println("Student added successfully.");
    }

    private static void displayStudent() {
        if (S1.isEmpty()) {
            System.out.println("No Students Found.");
            return;
        }
        for (Student s : S1) {
            s.display();
        }
    }

    private static void searchStudent() {
        System.out.println("Enter ID to search: ");
        int id = sc.nextInt();
        for (Student s : S1) {
            if (s.id == id) {
                s.display();
                return;
            }
        }
        System.out.println("Student Not Found.");
    }

    private static void deleteStudent() {
        System.out.println("Enter ID to delete: ");
        int id = sc.nextInt();
        for (int i = 0; i < S1.size(); i++) {
            if (S1.get(i).id == id) {
                S1.remove(i);
                System.out.println("Student deleted.");
                return;
            }
        }
        System.out.println("Student Not Found.");
    }
}
