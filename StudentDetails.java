class Student {
    int id;
    String name;

    Student(int id, String name) { this.id = id; this.name = name; }

    @Override
    public String toString() { // Override toString[cite: 1]
        return "ID: " + id + ", Name: " + name;
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Student s = new Student(101, "Alice");
        System.out.println(s.toString());
    }
}