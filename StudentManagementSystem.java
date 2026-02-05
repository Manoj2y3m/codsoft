import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

    
    static class Student {
        int rollNo;
        String name;
        String grade;

        Student(int rollNo, String name, String grade) {
            this.rollNo = rollNo;
            this.name = name;
            this.grade = grade;
        }
    }

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 5:
                    System.out.println(" Exiting Student Management System");
                    break;
                default:
                    System.out.println(" Invalid choice!");
            }
        } while (choice != 5);
    }

    
    static void addStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();

        students.add(new Student(roll, name, grade));
        System.out.println(" Student added successfully!");
    }

    
    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println(" No students found.");
            return;
        }

        System.out.println("\n Student List:");
        for (Student s : students) {
            System.out.println("Roll No: " + s.rollNo +
                    ", Name: " + s.name +
                    ", Grade: " + s.grade);
        }
    }


    static void searchStudent() {
        System.out.print("Enter Roll No to search: ");
        int roll = sc.nextInt();

        for (Student s : students) {
            if (s.rollNo == roll) {
                System.out.println("Student Found:");
                System.out.println("Roll No: " + s.rollNo +
                        ", Name: " + s.name +
                        ", Grade: " + s.grade);
                return;
            }
        }
        System.out.println(" Student not found.");
    }

    
    static void removeStudent() {
        System.out.print("Enter Roll No to remove: ");
        int roll = sc.nextInt();

        for (Student s : students) {
            if (s.rollNo == roll) {
                students.remove(s);
                System.out.println("Student removed successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
