package serializacion;

import java.io.IOException;

public class Main {

  public static void main(String[] args) {
      Lista li = new Lista();
      try {
          li = li.deSerializar("src/main/resources/lista.txt");
          if (!EntradaSalida.leerBoolean("Ya hay una lista. ¿Desea reutilizarla?")) {
              li = new Lista();
          }
      } catch (IOException | ClassNotFoundException e) {
          EntradaSalida.mostrarString("Lista nueva!");
      }

      do {
          String dato = EntradaSalida.leerString("Ingrese una cadena");
          li.agregar(dato);
      } while (EntradaSalida.leerBoolean("Desea seguir agregando valores?"));

      li.mostrar();

      try {
          li.serializar("src/main/resources/lista.txt");
      } catch (Exception e) {
          EntradaSalida.mostrarString(e.getMessage() + "\nERROR AL GRABAR!");
      }
  }
}

