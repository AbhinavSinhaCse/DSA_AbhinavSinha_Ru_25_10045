import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContactManager cm = new ContactManager();

        while (true) {

            System.out.println("\n--- STUDENT CONTACT DIRECTORY ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Phone: ");
                    String phone = sc.nextLine();

                    cm.addStudent(roll, name, phone);
                    break;

                case 2:
                    cm.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter Roll No: ");
                    int r = sc.nextInt();

                    cm.searchStudent(r);
                    break;

                case 4:
                    System.out.print("Enter Roll No: ");
                    int d = sc.nextInt();

                    cm.deleteStudent(d);
                    break;

                case 5:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}