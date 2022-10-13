package serializacion;

import java.io.*;
import java.util.ArrayList;

public class Lista implements Serializable {

    private ArrayList<String> valores;

    public Lista() {
        valores = new ArrayList<>();
    }

    public void agregar(String s) {
        valores.add(s);
    }

    public void mostrar() {
        String cadena = "La lista contiene:\n";
        for (String s : valores) {
            cadena += s + "\n";
        }
        EntradaSalida.mostrarString(cadena);
    }

    public Lista deSerializar(String nomArch) throws IOException, ClassNotFoundException {
        ObjectInputStream o =
                new ObjectInputStream(new BufferedInputStream(new FileInputStream(nomArch)));
        Lista j = (Lista) o.readObject();
        o.close();
        return j;
    }

    public void serializar(String nomArch) throws IOException {
        ObjectOutputStream o =
                new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(nomArch)));
        o.writeObject(this);
        o.close();
    }
}
