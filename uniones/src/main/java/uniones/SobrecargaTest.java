package uniones;

public class SobrecargaTest {

    public static void main(String[] args) {
        Unidor u = new Unidor();
        System.out.println(u.unir("123", "45"));
        System.out.println(u.unir(123, 45));
    }
}
