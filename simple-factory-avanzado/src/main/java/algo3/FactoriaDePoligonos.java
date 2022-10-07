package algo3;

import java.lang.reflect.InvocationTargetException;

public class FactoriaDePoligonos {

    private FactoriaDePoligonos() {
    }
    
    private static FactoriaDePoligonos f = null;

    public static FactoriaDePoligonos getInstance() {
        if (f == null) {
            f = new FactoriaDePoligonos();
        }
        return f;
    }

    public PoligonoRegular crearPoligono(String poligonoRegularID, double lado) {
        PoligonoRegular p = null;
        try {
            p = (PoligonoRegular) Class.forName(f.getClass().getPackage().getName() + "."
                    + poligonoRegularID).getDeclaredConstructor().newInstance();
        } catch (InvocationTargetException | SecurityException | NoSuchMethodException
                | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.err.println(ex);
        }
        if (p == null) {
            throw new IllegalArgumentException(poligonoRegularID);
        } else {
            p.setLado(lado);
        }
        return p;
    }
}
