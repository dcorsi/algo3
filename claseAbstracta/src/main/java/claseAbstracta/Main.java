package claseAbstracta;

public class Main {
	public static void main(String[] args) {
		TrianguloEquilatero tri = new TrianguloEquilatero(5);
		Cuadrado cua = new Cuadrado(5);
		System.out.println("Triangulo: " + tri.calcularArea());
		System.out.println("Cuadrado : " + cua.calcularArea());
	}
}
