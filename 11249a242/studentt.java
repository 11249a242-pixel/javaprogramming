class studentt {
    int rollNo;
    String name;

    studentt(int r, String n) {
        rollNo = r;
        name = n;
    }
}

class Marks extends studentt {
    int[] marks;

    Marks(int r, String n, int[] m) {
        super(r, n);
        marks = m;
    }
}

class Result extends Marks {
    Result(int r, String n, int[] m) {
        super(r, n, m);
    }

    void display() {
        int total = 0;
        for (int m : marks)
            total += m;

        double average = total / 5.0;
        String grade;

        if (average >= 90) grade = "A";
        else if (average >= 75) grade = "B";
        else if (average >= 60) grade = "C";
        else if (average >= 40) grade = "D";
        else grade = "F";

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

class ResultTest {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 88, 80};

        Result s = new Result(101, "Rahul", marks);
        s.display();
    }
}