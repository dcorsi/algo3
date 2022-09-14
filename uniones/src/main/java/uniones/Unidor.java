package uniones;

public class Unidor {

    public String unir(String a, String b) {
        return a.concat(b);
    }

    public int unir(int a, int b) {
        return (int) (a * Math.pow(10, Math.ceil(Math.log10(b))) + b);
    }
}
