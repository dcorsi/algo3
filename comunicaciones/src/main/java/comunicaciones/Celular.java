package comunicaciones;

public class Celular extends Telefono implements EnviadorDeMensajes {

    public void enviar(String mensaje) {
        System.out.println("RING RING: " + mensaje);
    }
}
