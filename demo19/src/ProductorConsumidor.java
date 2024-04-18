import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProductorConsumidor {
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int capacidad = 5; // Capacidad máxima del buffer
    private final Lock lock = new ReentrantLock();
    private final Condition bufferLleno = lock.newCondition(); // Condición para buffer lleno
    private final Condition bufferVacio = lock.newCondition(); // Condición para buffer vacío

    public void producir(int valor) throws InterruptedException {
        lock.lock();
        try {
            while (buffer.size() == capacidad) {
                System.out.println("El buffer está lleno. El productor espera.");
                bufferLleno.await(); // El productor espera aquí si el buffer está lleno
            }
            buffer.offer(valor); // Se agrega el valor al buffer
            System.out.println("Se produjo el valor: " + valor);
            bufferVacio.signal(); // Se señala que el buffer ya no está vacío
        } finally {
            lock.unlock();
        }
    }

    public int consumir() throws InterruptedException {
        lock.lock();
        try {
            while (buffer.isEmpty()) {
                System.out.println("El buffer está vacío. El consumidor espera.");
                bufferVacio.await(); // El consumidor espera aquí si el buffer está vacío
            }
            int valorConsumido = buffer.poll(); // Se consume el valor del buffer
            System.out.println("Se consumió el valor: " + valorConsumido);
            bufferLleno.signal(); // Se señala que el buffer ya no está lleno
            return valorConsumido;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ProductorConsumidor pc = new ProductorConsumidor();

        Thread hiloProductor = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    pc.producir(i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread hiloConsumidor = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    pc.consumir();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        hiloProductor.start();
        hiloConsumidor.start();

        try {
            hiloProductor.join();
            hiloConsumidor.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}