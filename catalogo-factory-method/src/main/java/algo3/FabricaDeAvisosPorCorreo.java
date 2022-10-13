package algo3;

public class FabricaDeAvisosPorCorreo extends FabricaDeAvisos {

	@Override
	public Aviso crearAviso(String tipoDeAviso) {
		switch (tipoDeAviso) {
		case "Carta documento":
			return new CartaDocumento();
		default:
			return null;
		}
	}
}
