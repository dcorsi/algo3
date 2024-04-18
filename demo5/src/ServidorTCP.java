import java.io.*;
import java.net.*;

public class ServidorTCP {

    public static void main(String[] args) {
        final int PUERTO = 5000;

        try (ServerSocket servidor = new ServerSocket(PUERTO)) {
            System.out.println("Servidor TCP iniciado. Esperando conexiones...");

            while (true) {
                Socket cliente = servidor.accept(); // Esperar a que un cliente se conecte
                System.out.println("Cliente conectado desde: " + cliente.getInetAddress().getHostAddress());

                // Crear hilos para manejar múltiples clientes simultáneamente
                Thread clienteThread = new Thread(new ManejadorCliente(cliente));
                clienteThread.start();
            }
        } catch (IOException e) {
            System.err.println("Error al iniciar el servidor: " + e.getMessage());
        }
    }

    static class ManejadorCliente implements Runnable {
        private final Socket cliente;

        public ManejadorCliente(Socket cliente) {
            this.cliente = cliente;
        }

        public void run() {
            try (BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                 PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true)) {

                String mensajeEntrada;
                while ((mensajeEntrada = entrada.readLine()) != null) {
                    System.out.println("Mensaje recibido de " + cliente.getInetAddress().getHostAddress() + ": " + mensajeEntrada);

                    // Procesar el mensaje recibido (en este caso, simplemente devolverlo al cliente)
                    salida.println("Servidor: " + mensajeEntrada);
                }
            } catch (IOException e) {
                System.err.println("Error al manejar cliente: " + e.getMessage());
            } finally {
                try {
                    cliente.close(); // Cerrar la conexión con el cliente
                } catch (IOException e) {
                    System.err.println("Error al cerrar conexión: " + e.getMessage());
                }
            }
        }
    }
}