import java.util.Scanner;

class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = Integer.parseInt(sc.nextLine());

            int x = 10 / (age - age);
            System.out.println("Age: " + age);

        } catch (NumberFormatException e) {
            System.out.println("Enter a valid number!");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}