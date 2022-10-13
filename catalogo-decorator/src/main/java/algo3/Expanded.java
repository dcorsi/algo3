package algo3;

public class Expanded extends Decorador {

	public Expanded(MensajeAbstracto mensaje) {
		super(mensaje);
	}

	@Override
	public String getTexto() {
		String[] vectorCaracteres = super.getTexto().split("");
	    StringBuilder resultado = new StringBuilder();  
	    for(String caracter : vectorCaracteres){  
	        resultado.append(caracter);
	        resultado.append(" ");
	    }  
		return resultado.deleteCharAt(resultado.length()-1).toString();
	}
}


