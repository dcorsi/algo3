class Buffer {
    private final java.util.Queue<Integer> queue = new java.util.LinkedList<>();
    private int capacidad;

    public Buffer(int capacidad) {
        this.capacidad = capacidad;
    }

    public synchronized void producir(int elemento) throws InterruptedException {
        System.out.println("El hilo productor mandó el mensaje producir(" + elemento + ")");
        while (queue.size() == capacidad) {
            System.out.println("Buffer lleno! No se puede cargar el elemento: " + elemento + ". Se bloquea el productor...");
            wait();
        }
        queue.offer(elemento);
        System.out.println("Se cargó el elemento: " + elemento);
        notify(); // Notificar a un consumidor que hay elementos disponibles
        System.out.println("Se notifica al consumidor que el buffer no está vacío...");
    }

    public synchronized int consumir() throws InterruptedException {
        System.out.println("El hilo consumidor mandó el mensaje consumir()");
        while (queue.isEmpty()) {
            System.out.println("Buffer vacío! No se puede consumir. Se bloquea el consumidor...");
            wait();
        }
        int elemento = queue.poll();
        System.out.println("Se consumió el elemento: " + elemento);
        notify(); // Notificar a un productor que hay espacio disponible en el buffer
        System.out.println("Se notifica al productor que el buffer está vacío...");
        return elemento;
    }
}

public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5);

        Thread productor = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    buffer.producir(i);
                    Thread.sleep(100); // Simular una operación de producción
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumidor = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    buffer.consumir();
                    Thread.sleep(100); // Simular una operación de consumo
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        productor.start();
        consumidor.start();

        try {
            productor.join();
            consumidor.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Fin del programa");
    }
}