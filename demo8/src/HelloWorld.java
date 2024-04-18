public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {

        MyTask myTask = new MyTask();
        Thread myThread = new Thread(myTask);
        myThread.start();
        System.out.println("Hello from main thread");
        myThread.join();
        System.out.println("Bye from main thread");
    }
}

class MyTask implements Runnable {
    public void run() {
        System.out.println("Hello from new thread");
    }
}
