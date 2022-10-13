package algo3;

public interface FabricaDeVehiculos {
		Auto crearAuto(String modelo, double potencia, double capacidadDelBaul);
		Moto crearMoto(String modelo, double potencia);
}
