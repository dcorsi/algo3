package algo3;

public class FabricaDeAvisosTelefonicos extends FabricaDeAvisos {

	@Override
	public Aviso crearAviso(String tipoDeAviso) {
		switch (tipoDeAviso) {
		case "Llamada de linea":
			return new LlamadaDeLinea();
		case "Llamada de Whatsapp":
			return new LlamadaDeWhatsapp();
		default:
			return null;
		}
	}
}
