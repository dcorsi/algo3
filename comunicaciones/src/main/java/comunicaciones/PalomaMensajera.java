package comunicaciones;

public class PalomaMensajera extends Animal implements EnviadorDeMensajes {

    public void enviar(String mensaje) {
        System.out.println("Llega volando: " + mensaje);
    }
}
