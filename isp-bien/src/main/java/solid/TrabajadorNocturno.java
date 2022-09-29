package solid;

public class TrabajadorNocturno implements EmpleableHumano {

    public void trabajar() {
        System.out.println("Trabaja de noche...");
    }

    public void comer() {
        System.out.println("Hace una pausa para cenar...");
    }
}
