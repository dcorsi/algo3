package comunicaciones;

public class Main {

    public static void main(String[] args) {
        Celular c = new Celular();
        c.tocar();
        c.enviar("Hola");
        PalomaMensajera p = new PalomaMensajera();
        p.enviar("Hola");
        p.dormir();
    }
}
