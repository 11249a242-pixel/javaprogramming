class Student {
    String name;
    int rollNo, marks;

    Student(String n, int r, int m) {
        name = n;
        rollNo = r;
        marks = m;
    }

    String grade() {
        if (marks >= 90) return "A";
        if (marks >= 75) return "B";
        if (marks >= 60) return "C";
        if (marks >= 40) return "D";
        return "F";
    }

    void display() {
        System.out.println(name + " " + rollNo + " " + marks + " Grade: " + grade());
    }
}

public class main{
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 101, 88);
        Student s2 = new Student("Priya", 102, 67);

        s1.display();
        s2.display();
    }
}