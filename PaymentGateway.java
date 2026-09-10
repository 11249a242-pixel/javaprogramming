class PaymentProcess implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Payment Processing...");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        PaymentProcess payment = new PaymentProcess();

        Thread t = new Thread(payment);
        t.start();
    }
}
