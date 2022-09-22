package tateti;

public class Main {
    public static final java.util.Scanner teclado = new java.util.Scanner(System.in);
    public static final java.io.PrintStream pantalla = new java.io.PrintStream(System.out);
    
    public static void main(String[] args) {

        TaTeTi juego = new TaTeTi(3);
        String result;

        do {
            pantalla.print("Fila: ");
            int fila = Integer.parseInt(teclado.nextLine());

            pantalla.print("Columna: ");
            int columna = Integer.parseInt(teclado.nextLine());

            result = juego.jugar(fila, columna);

            pantalla.println('\n' + juego.generarTablero());

        } while(result.equals("Aun no hay un ganador!"));

        pantalla.println(result);
    }
}
