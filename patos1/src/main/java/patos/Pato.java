package patos;

public abstract class Pato {

    public void parpar() {
        System.out.println("Cua cua!");
    }

    public void nadar() {
        System.out.println("Pato nadando...");
    }

    public abstract void mostrar();

	public void volar() {
        System.out.println("Pato volando...");
	}
}
