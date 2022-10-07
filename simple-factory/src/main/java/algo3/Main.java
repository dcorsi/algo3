package algo3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<PoligonoRegular> c = new ArrayList<>();
        c.add(FactoriaDePoligonos.crearPoligono("TrianguloEquilatero", 5));
        c.add(FactoriaDePoligonos.crearPoligono("Cuadrado", 5));
        c.add(FactoriaDePoligonos.crearPoligono("PentagonoRegular", 5));

        for (int i = 0; i < c.size(); i++) {
            PoligonoRegular p = c.get(i);
            System.out.println(p.getNombre() + ": " + Math.floor(p.calcularArea() * 100) / 100);
        }
    }
}
