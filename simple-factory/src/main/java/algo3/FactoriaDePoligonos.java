package algo3;

public class FactoriaDePoligonos {

    public static PoligonoRegular crearPoligono(String tipo, double lado) {
        PoligonoRegular p = null;
        if (tipo.equals("TrianguloEquilatero")) {
            p = new TrianguloEquilatero(lado);
        } else if (tipo.equals("Cuadrado")) {
            p = new Cuadrado(lado);
        } else if (tipo.equals("PentagonoRegular")) {
            p = new PentagonoRegular(lado);
        } else {
            throw new IllegalArgumentException(tipo);
        }
        return p;
    }
}
