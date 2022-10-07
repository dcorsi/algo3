package algo3;

public class Usuario implements Observer {

    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void update(Observable o) {
        System.out.println("Solo para vos " + nombre + ": " + o);
    }

}
