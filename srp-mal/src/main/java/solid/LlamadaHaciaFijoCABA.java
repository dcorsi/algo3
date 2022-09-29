package solid;

public class LlamadaHaciaFijoCABA {

    public void efectuar(int numero) {
        if (validar(numero)) {
            System.out.println("Llamando al +54 11 " + numero + "...");
        } else {
            System.err.println("Error: " + numero + " no es un numero fijo valido...");
        }
    }

    public boolean validar(int numero) {
        return numero > 19999999 && numero < 70000000;
    }
}
