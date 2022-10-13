package algo3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<PoligonoRegular> coleccionPolimorfica = new ArrayList<>();
		coleccionPolimorfica.add(new TrianguloEquilatero(5, new AreaConRaizCuadrada()));
		coleccionPolimorfica.add(new TrianguloEquilatero(5, new AreaConTrigonometria()));
		coleccionPolimorfica.add(new Cuadrado(5, new AreaConMultiplicacion()));
		coleccionPolimorfica.add(new Cuadrado(5, new AreaConTrigonometria()));
		coleccionPolimorfica.add(new PentagonoRegular(5, new AreaConTrigonometria()));

		for (PoligonoRegular poligono : coleccionPolimorfica) {
			poligono.mostrarArea();
		}

		coleccionPolimorfica.get(3).setEstrategiaParaCalcularArea(new AreaConMultiplicacion());

		System.out.println();
		System.out.println("Despues de cambiar la estrategia del segundo cuadrado...");
		for (PoligonoRegular poligono : coleccionPolimorfica) {
			poligono.mostrarArea();
		}
	}
}
