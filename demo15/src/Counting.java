public class Counting {
    final static Counter counter = new Counter();

    public static void main(String[] args) throws InterruptedException {
        CountingThread t1 = new CountingThread();
        CountingThread t2 = new CountingThread();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCount());
    }

    static class CountingThread extends Thread {
        public void run() {
            for (int x = 0; x < 10000; ++x)
                counter.increment();
        }
    }

}

class Counter {
    private int count = 0;

    public synchronized void increment() {
        ++count;
    }

    public int getCount() {
        return count;
    }
}