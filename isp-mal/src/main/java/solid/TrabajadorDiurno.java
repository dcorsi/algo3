package solid;

public class TrabajadorDiurno implements EmpleableParaTrabajar {

    public void trabajar() {
        System.out.println("Trabaja de dia...");
    }

    public void comer() {
        System.out.println("Hace una pausa para almorzar...");
    }
}
