package coercion;

public class CoercionTest {

    public static void main(String[] args) {
        double x = 12.5;
        int n = 12;
        Duplicador d = new Duplicador();
        System.out.println(d.duplicar(x));
        System.out.println(d.duplicar(n));
    }
}
