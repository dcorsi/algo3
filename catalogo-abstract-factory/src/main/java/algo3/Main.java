package algo3;

public class Main {

	public static void main(String[] args) {

		FabricaDeVehiculos fabricaDeNafteros = new FabricaDeVehiculosNafteros();
		FabricaDeVehiculos fabricaDeElectricos = new FabricaDeVehiculosElectricos();

		Catalogo catalogoDeNafteros = new Catalogo(fabricaDeNafteros);
		Catalogo catalogoDeElectricos = new Catalogo(fabricaDeElectricos);

		catalogoDeNafteros.agregarAuto("Honda Pilot", 280, 827);
		catalogoDeNafteros.agregarAuto("Toyota SW4 SRX", 204, 900);
		catalogoDeNafteros.agregarMoto("Ducati 1100 Tribute PRO 2022", 86);

		catalogoDeElectricos.agregarAuto("Coradir Tito", 6, 80);
		catalogoDeElectricos.agregarMoto("KTM SX-E 5", 6.7);
		catalogoDeElectricos.agregarMoto("Zanella E-Styler", 1.6);

		catalogoDeNafteros.mostrar("CATALOGO DE VEHICULOS NAFTEROS");
		catalogoDeElectricos.mostrar("CATALOGO DE VEHICULOS ELECTRICOS");
	}
}
