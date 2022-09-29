package solid;

public class Main {

    public static void main(String[] args) {
        EmpleableParaTrabajar trabajadorDiurno = new TrabajadorDiurno();
        trabajadorDiurno.trabajar();
        trabajadorDiurno.comer();
        EmpleableParaTrabajar trabajadorNocturno = new TrabajadorNocturno();
        trabajadorNocturno.trabajar();
        trabajadorNocturno.comer();
    }
}
