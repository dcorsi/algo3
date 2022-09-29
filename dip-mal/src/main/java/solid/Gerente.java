package solid;

public class Gerente {

    private Operario operarioACargo;

    public void asignarOperario(Operario o) {
        operarioACargo = o;
    }

    public void trabajar() {
        System.out.println("Gerente dando ordenes...");
        operarioACargo.trabajar();
    }
}
