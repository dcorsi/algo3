package excepciones;

public class Main {

    public static void main(String[] args) {

        Alumno a1 = new Alumno("Pedro", 4);

        Alumno a2 = new Alumno("Pablo", 5);

        try {
            if (a1.getNota() >= 4) {
                throw new AprobadoException(a1.getNombre() + " ha aprobado!");
            } else {
                throw new ReprobadoException(a1.getNombre() + " fue reprobado!");
            }
        } catch (AprobadoException | ReprobadoException ex) {
            System.out.println(ex.getMessage());
        }

        if (a2.getNota() >= 4) {
            try {
                a2.sonreir();
            } catch (RuntimeException ex) {
                System.out.println("Sonrie " + a2.getNombre() + "...");
            } catch (Exception ex) {
                System.out.println("Se rie " + a2.getNombre() + "...");
            } finally {
                System.out.println("Porque se ha sacado un " + a2.getNota() + "!");
            }
        } else {
            try {
                a2.llorar();
            } catch (Exception ex) {
                System.out.println("Llora " + a2.getNombre() + "...");
            } finally {
                System.out.println("Porque le pusieron un " + a2.getNota() + "!");
            }
        }
    }
}
