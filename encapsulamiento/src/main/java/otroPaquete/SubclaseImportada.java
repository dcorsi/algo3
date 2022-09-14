package otroPaquete;

import accesos.MiClase;

public class SubclaseImportada extends MiClase {

    public void metodoSubclaseImportada(MiClase o) {
        o.atributoMiClase++;
    }

    public void mostrarMiAtributo() {
        System.out.println(atributoMiClase);
    }
}

