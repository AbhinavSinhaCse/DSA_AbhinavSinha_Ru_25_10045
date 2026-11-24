import java.util.*;

public class ContactManager {

    ArrayList<Student> students = new ArrayList<>();

    HashMap<Integer, Student> contactMap = new HashMap<>();

    // Adding student
    void addStudent(int roll, String name, String phone) {

        if (contactMap.containsKey(roll)) {
            System.out.println("Roll number already exists!");
            return;
        }

        Student s = new Student(roll, name, phone);

        students.add(s);
        contactMap.put(roll, s);

        System.out.println("Student added successfully!");
    }

    // displaying all students
    void displayStudents() {
        for (Student s : students) {
            s.display();
        }
    }

    // Searching student using HashMap
    void searchStudent(int roll) {

        Student s = contactMap.get(roll);

        if (s != null) {
            s.display();
        } else {
            System.out.println("Student not found!");
        }
    }

    // Deleting student
    void deleteStudent(int roll) {

        Student s = contactMap.remove(roll);

        if (s != null) {
            students.remove(s);
            System.out.println("Student deleted!");
        } else {
            System.out.println("Student not found!");
        }
    }
}
