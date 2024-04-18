import java.io.*;
import java.net.*;

public class ClienteTCP {

    public static void main(String[] args) {
        final String SERVIDOR = "localhost";
        final int PUERTO = 5000;

        try (Socket socket = new Socket(SERVIDOR, PUERTO);
             BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter salida = new PrintWriter(socket.getOutputStream(), true)) {

            System.out.println("Conexión establecida con el servidor.");

            // Enviar un mensaje al servidor
            salida.println(args[0]);

            // Leer la respuesta del servidor
            String respuesta = entrada.readLine();
            System.out.println("Respuesta del servidor: " + respuesta);
        } catch (IOException e) {
            System.err.println("Error de conexión: " + e.getMessage());
        }
    }
}
