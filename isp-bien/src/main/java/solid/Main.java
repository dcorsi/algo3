package solid;

public class Main {

    public static void main(String[] args) {
        EmpleableHumano trabajadorDiurno = new TrabajadorDiurno();
        trabajadorDiurno.trabajar();
        trabajadorDiurno.comer();
        EmpleableHumano trabajadorNocturno = new TrabajadorNocturno();
        trabajadorNocturno.trabajar();
        trabajadorNocturno.comer();
        EmpleableParaTrabajar robot = new Robot();
        robot.trabajar();
    }
}
