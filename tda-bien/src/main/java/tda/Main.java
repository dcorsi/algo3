package tda;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<SensorDeTemperatura> sensores = new ArrayList<>();

		sensores.add(new SensorDeTemperatura("S1", 40, 30));
		sensores.add(new SensorDeTemperatura("S2", 40, 90));
		sensores.add(new SensorDeTemperatura("S3", 40, 50));
		sensores.add(new SensorDeTemperatura("S4", 40, 40));

		for (SensorDeTemperatura sensorDeTemperatura : sensores) {
			sensorDeTemperatura.controlar();
		}
	}
}
