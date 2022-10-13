package algo3;

public class FabricaDeVehiculosNafteros implements FabricaDeVehiculos {

	public Auto crearAuto(String modelo, double potencia, double capacidadDelBaul) {
		return new AutoNaftero(modelo, potencia, capacidadDelBaul);
	}

	public Moto crearMoto(String modelo, double potencia) {
		return new MotoNaftera(modelo, potencia);
	}
}
