package poligonosRegulares;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<PoligonoRegular> coleccionPolimorfica = new ArrayList<>();
        coleccionPolimorfica.add(new TrianguloEquilatero(5));
        coleccionPolimorfica.add(new Cuadrado(5));
        coleccionPolimorfica.add(new PentagonoRegular(5));

        for (PoligonoRegular poligono: coleccionPolimorfica) {
            poligono.mostrarArea();
        }
    }
}
