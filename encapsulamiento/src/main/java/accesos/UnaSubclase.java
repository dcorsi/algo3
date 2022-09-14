package accesos;

public class UnaSubclase extends MiClase {

    public void metodoSubclase(MiClase o) {
        o.atributoMiClase++;
    }

    public void mostrarMiAtributo() {
        System.out.println(atributoMiClase);
    }
}
