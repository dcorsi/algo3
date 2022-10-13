package algo3;

public abstract class PoligonoRegular {

	private double lado;
	private String nombre;
	private int cantidadDeLados;
	private EstrategiaParaCalcularArea estrategiaParaCalcularArea;

	public PoligonoRegular(double lado, String nombre, int cantidadDeLados,
			EstrategiaParaCalcularArea estrategiaParaCalcularArea) {
		this.lado = lado;
		this.nombre = nombre;
		this.cantidadDeLados = cantidadDeLados;
		this.estrategiaParaCalcularArea = estrategiaParaCalcularArea;
	}

	public void setEstrategiaParaCalcularArea(EstrategiaParaCalcularArea estrategiaParaCalcularArea) {
		this.estrategiaParaCalcularArea = estrategiaParaCalcularArea;
	}

	public void mostrarArea() {
		System.out.print("Area del " + nombre + ": ");
		System.out.println(estrategiaParaCalcularArea.calcularArea(cantidadDeLados, lado));
	}
}
