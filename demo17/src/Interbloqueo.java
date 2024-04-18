public class Interbloqueo {
    private static final Object recursoL = new Object();
    private static final Object recursoM = new Object();

    public static void main(String[] args) {
        Thread hiloA = new Thread(() -> {
            synchronized (recursoL) {
                System.out.println("Hilo A: Adquirió recurso L");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Hilo A: Esperando por recurso M");
                synchronized (recursoM) {
                    System.out.println("Hilo A: Adquirió recurso M");
                }
            }
        });

        Thread hiloB = new Thread(() -> {
            synchronized (recursoM) {
                System.out.println("Hilo B: Adquirió recurso M");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Hilo B: Esperando por recurso L");
                synchronized (recursoL) {
                    System.out.println("Hilo B: Adquirió recurso L");
                }
            }
        });

        hiloA.start();
        hiloB.start();
    }
}