package tda;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<SensorDeTemperatura> sensores = new ArrayList<>();

		sensores.add(new SensorDeTemperatura("s1", 30));
		sensores.add(new SensorDeTemperatura("s2", 90));
		sensores.add(new SensorDeTemperatura("s3", 50));
		sensores.add(new SensorDeTemperatura("s4", 40));

		for (SensorDeTemperatura sensorDeTemperatura : sensores) {
			if (sensorDeTemperatura.getTemperatura() > 40) {
				System.err.println(sensorDeTemperatura.getId() + " sobrecalentado!");
			}
		}
	}
}
