package algo3;

public class FabricaDeVehiculosElectricos implements FabricaDeVehiculos {

	public Auto crearAuto(String modelo, double potencia, double capacidadDelBaul) {
		return new AutoElectrico(modelo, potencia, capacidadDelBaul);
	}

	public Moto crearMoto(String modelo, double potencia) {
		return new MotoElectrica(modelo, potencia);
	}
}
