package algo3;

public class ColaDeImpresion {

    private static ColaDeImpresion uniqueInstance = null;
    
    // Aqui irian otros atributos de la clase que implementa este patron

    private ColaDeImpresion() {
    }
    
    public static ColaDeImpresion getInstance() {
        if (uniqueInstance == null) {
        	uniqueInstance = new ColaDeImpresion();
        }
        return uniqueInstance;
    }

    // Aqui irian otros metodos de la clase que implementa este patron
}
