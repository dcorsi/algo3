package solid;

public class Gerente {

    private ContratableParaTrabajar trabajadorACargo;

    public void asignarTrabajador(ContratableParaTrabajar t) {
        trabajadorACargo = t;
    }

    public void trabajar() {
        System.out.println("Gerente dando ordenes...");
        trabajadorACargo.trabajar();
    }
}
