package algo3;

public class Main {

    public static void main(String[] args) {
        Spam s = new Spam();
        Usuario u1 = new Usuario("Matias");
        Usuario u2 = new Usuario("Diego");
        Usuario u3 = new Usuario("Esteban");

        s.addObserver(u1);
        s.addObserver(u2);
        s.setPromocion("Laptops 30% Off");
        
        s.addObserver(u3);
        s.setPromocion("Cartuchos HP 3x2");

        s.removeObserver(u2);
        s.setPromocion("Impresoras Brother 10% Off");
    }
}
