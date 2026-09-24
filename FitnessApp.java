import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FitnessApp {
    public static void main(String[] args) {
        String fileName = "userprofile.txt";

        String profile = "Name: Rahul\n"
                       + "Age: 22\n"
                       + "Weight: 65 kg\n"
                       + "Height: 175 cm\n";

        // Writing data to file
        try {
            FileOutputStream fos = new FileOutputStream(fileName);

            byte[] data = profile.getBytes();
            fos.write(data);

            fos.close();
            System.out.println("Profile data written successfully.");
        } catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }

        // Reading data from file
        try {
            FileInputStream fis = new FileInputStream(fileName);

            int ch;
            System.out.println("\nUser Profile:");

            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

            fis.close();
        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }
    }
}
