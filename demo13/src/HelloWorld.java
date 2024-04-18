public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {

        Thread myThread = new Thread() {
            public void run() {
                synchronized (this) { // Lock implícito en el objeto myThread
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Hello from new thread");
                    }
                }
            }
        };
        myThread.start();

        synchronized (myThread) { // Lock implícito en el objeto myThread
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello from main thread");
            }
        }

        myThread.join();
        System.out.println("Bye from main thread");
    }
}