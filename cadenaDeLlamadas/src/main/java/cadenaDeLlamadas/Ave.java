package cadenaDeLlamadas;

public class Ave extends Animal {

	public Ave() {
		System.out.println("No se me usa!");
	}

	public Ave(int n) {
		System.out.println("Soy" + (n == 1 ? " un " : " una ll") + "ave!");
	}
}
