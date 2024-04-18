public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {

        MyTask myThread = new MyTask();
        myThread.start();
        System.out.println("Hello from main thread");
        myThread.join();
        System.out.println("Bye from main thread");
    }
}

class MyTask extends Thread {
    public void run() {
        System.out.println("Hello from new thread");
    }
}