package tda;

public class SensorDeTemperatura {

	private final String id;
	private final float temperatura;
	private final float limite;

	public SensorDeTemperatura(String id, float limite, float temperatura) {
		this.id = id;
		this.limite = limite;
		this.temperatura = temperatura;
	}

	public void controlar() {
		if (temperatura > limite) {
			System.err.println(id + " sobrecalentado!");
		}
	}
}
