package patos;

import java.lang.reflect.InvocationTargetException;

public class FactoriaDePatos {

    private FactoriaDePatos() {
    }
    private static FactoriaDePatos f = null;

    public static FactoriaDePatos getInstance() {
        if (f == null) {
            f = new FactoriaDePatos();
        }
        return f;
    }

    public Pato crearPato(String patoID) {
        Pato p = null;
        try {
            p = (Pato) Class.forName(f.getClass().getPackage().getName() + "."
                    + patoID).getDeclaredConstructor().newInstance();
        } catch (InvocationTargetException | SecurityException | NoSuchMethodException
                | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.err.println(ex);
        }
        if (p == null) {
            throw new IllegalArgumentException(patoID);
        }
        return p;
    }
}
