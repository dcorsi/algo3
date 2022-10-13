package algo3;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

	private FabricaDeVehiculos fabricaDeVehiculos;
	private List<Auto> catalogoDeAutos;
	private List<Moto> catalogoDeMotos;

	public Catalogo(FabricaDeVehiculos fabricaDeVehiculos) {
		this.fabricaDeVehiculos = fabricaDeVehiculos;
		catalogoDeAutos = new ArrayList<>();
		catalogoDeMotos = new ArrayList<>();
	}

	public void agregarAuto(String modelo, double potencia, double capacidadDelBaul) {
		catalogoDeAutos.add(fabricaDeVehiculos.crearAuto(modelo, potencia, capacidadDelBaul));
	}

	public void agregarMoto(String modelo, double potencia) {
		catalogoDeMotos.add(fabricaDeVehiculos.crearMoto(modelo, potencia));
	}

	public void mostrar(String titulo) {
		System.out.println(titulo);
		for (Auto auto : catalogoDeAutos)
			auto.mostrarCaracteristicas();
		for (Moto moto : catalogoDeMotos)
			moto.mostrarCaracteristicas();
	}
}
