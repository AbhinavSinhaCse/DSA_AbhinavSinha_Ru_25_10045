public class Student {
    int rollNo;
    String name;
    String phone;

    Student(int rollNo, String name, String phone) {
        this.rollNo = rollNo;
        this.name = name;
        this.phone = phone;
    }

    void display() {
        System.out.println(
            rollNo + " | " + name + " | " + phone
        );
    }
}