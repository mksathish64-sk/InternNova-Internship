package Week5.Task5;

class NumberThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Number Thread: " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Number Thread interrupted.");
            }
        }
    }
}

class MessageThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(
                    "Message Thread: Learning Java Multithreading"
            );

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Message Thread interrupted.");
            }
        }
    }
}

public class MultiThreadDemo {

    public static void main(String[] args) {

        NumberThread numberThread = new NumberThread();
        MessageThread messageThread = new MessageThread();

        numberThread.start();
        messageThread.start();
    }
}