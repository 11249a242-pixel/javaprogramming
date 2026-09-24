import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);

            // Send message to server
            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);

            // Receive message from server
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            out.println("Hello Server!");

            String response = in.readLine();
            System.out.println("Server says: " + response);

            socket.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
