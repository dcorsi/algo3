package solid;

public class LlamadaHaciaFijoCABA {

    public void efectuar(int numero) {
        ServicioDeValidacion v = new ServicioDeValidacion();
        if (v.validar(numero)) {
            System.out.println("Llamando al +54 11 " + numero + "...");
        } else {
            System.err.println("Error: " + numero + " no es un numero fijo valido...");
        }
    }
}
