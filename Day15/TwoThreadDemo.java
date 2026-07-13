package Day15;

class FirstThread extends Thread {
    public void run() {
        System.out.println("First Thread");
    }
}

class SecondThread extends Thread {
    public void run() {
        System.out.println("Second Thread");
    }
}

public class TwoThreadDemo {
    public static void main(String[] args) {
        new FirstThread().start();
        new SecondThread().start();
    }
}
