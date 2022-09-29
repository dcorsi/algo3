package tda;

public class SensorDeTemperatura {

	private String id;
	private float temperatura;

	public SensorDeTemperatura(String id, float temperatura) {
		this.id = id;
		this.temperatura = temperatura;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public String getId() {
		return id;
	}
}
