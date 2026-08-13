import java.util.Scanner;

class books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books = new String[10];

        for (int i = 0; i < 10; i++)
            books[i] = sc.nextLine();

        System.out.println("Books starting with A:");

        for (String book : books)
            if (book.startsWith("A"))
                System.out.println(book);
    }
}