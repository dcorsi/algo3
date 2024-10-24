import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class ConcurrentSumExample {
    private static final int TOTAL_NUMBERS = 100;
    private static final int THREAD_COUNT = 4;
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);
        Future<Integer>[] futures = new Future[THREAD_COUNT];
        int range = TOTAL_NUMBERS / THREAD_COUNT;
        for (int i = 0; i < THREAD_COUNT; i++) {
            final int start = i * range + 1;
            final int end = (i == THREAD_COUNT - 1) ? TOTAL_NUMBERS : (i + 1) * range;
            futures[i] = executorService.submit(new Callable<Integer>() {
                @Override
                public Integer call() {
                    int sum = 0;
                    for (int j = start; j <= end; j++) sum += j;
                    return sum;
                }
            });
        }

        int totalSum = 0;
        for (int i = 0; i < THREAD_COUNT; i++) {
            try {
                totalSum += futures[i].get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println("La suma total de números del 1 al " + TOTAL_NUMBERS + " es: " + totalSum);
        executorService.shutdown();
    }
}