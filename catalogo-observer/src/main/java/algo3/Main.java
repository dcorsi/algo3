package algo3;

public class Main {

	private static void mostrarEstadoDeUsuarios(Observer u1, Observer u2, Observer u3) {
		((ConcreteObserverUsuario) u1).mostrar();
		((ConcreteObserverUsuario) u2).mostrar();
		((ConcreteObserverUsuario) u3).mostrar();
		System.out.println();
	}

	public static void main(String[] args) {

		ConcreteSubjectSpam s = new ConcreteSubjectSpam();
		ConcreteObserverUsuario u1 = new ConcreteObserverUsuario("Matias", s);
		ConcreteObserverUsuario u2 = new ConcreteObserverUsuario("Diego", s);
		ConcreteObserverUsuario u3 = new ConcreteObserverUsuario("Esteban", s);

		s.registrarObserver(u1);
		s.registrarObserver(u2);
		s.setMensajeSpam("Solo por hoy! Laptops 30% Off");
		mostrarEstadoDeUsuarios(u1, u2, u3);
		s.registrarObserver(u3);
		s.setMensajeSpam("Oferta imperdible! Cartuchos HP 3x2");
		mostrarEstadoDeUsuarios(u1, u2, u3);

		s.removerObserver(u2);
		s.setMensajeSpam("Ultima oportunidad! Impresoras Brother 10% Off");
		mostrarEstadoDeUsuarios(u1, u2, u3);
	}
}


