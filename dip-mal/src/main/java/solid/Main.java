package solid;

public class Main {

    public static void main(String[] args) {
        Operario op = new Operario();
        Gerente ge = new Gerente();
        ge.asignarOperario(op);
        ge.trabajar();
    }
}
