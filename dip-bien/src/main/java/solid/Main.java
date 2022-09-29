package solid;

public class Main {

    public static void main(String[] args) {
        Operario op = new Operario();
        Secretaria se = new Secretaria();
        Gerente ge = new Gerente();
        ge.asignarTrabajador(op);
        ge.trabajar();
        ge.asignarTrabajador(se);
        ge.trabajar();
    }
}
