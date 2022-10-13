package algo3;

public class Main {

	public static void main(String[] args) {
        FabricaDeAvisos fabricaDeAvisos = new FabricaDeAvisosTelefonicos();
        Aviso aviso1 = fabricaDeAvisos.crearAviso("Llamada de linea");
        aviso1.avisar();
        Aviso aviso2 = fabricaDeAvisos.crearAviso("Llamada de Whatsapp");
        aviso2.avisar();
        fabricaDeAvisos = new FabricaDeAvisosPorCorreo();
        Aviso aviso3 = fabricaDeAvisos.crearAviso("Carta documento");
        aviso3.avisar();
	}
}
