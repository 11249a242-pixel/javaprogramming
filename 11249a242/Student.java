import java.util.Scanner;

class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int regNo;
        String name;
        int course;
        String department;

        System.out.print("Enter Reg Number: ");
        regNo = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter course: ");
        course = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Department: ");
        department = sc.nextLine();

        System.out.println("\n--- Student Details ---");
        System.out.println("Reg Number : " + regNo);
        System.out.println("Name        : " + name);
        System.out.println("course         : " + course);
        System.out.println("Department  : " + department);

        sc.close();
    }
}