package algo3;

public class CamelCase extends Decorador {

	public CamelCase(MensajeAbstracto mensaje) {
		super(mensaje);
	}

	@Override
	public String getTexto() {
		String[] vectorPalabras = super.getTexto().trim().split("\\P{L}+");
	    StringBuilder resultado = new StringBuilder();  
	    for(String palabra : vectorPalabras){  
	        resultado.append(palabra.substring(0,1).toUpperCase());
	        resultado.append(palabra.substring(1));
	    }  
		return resultado.toString();
	}
}
