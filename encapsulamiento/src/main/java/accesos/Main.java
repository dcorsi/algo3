package accesos;

import otroPaquete.ClaseImportada;
import otroPaquete.SubclaseImportada;

public class Main {

  public static void main(String[] args) {
    MiClase objMiClase = new MiClase();
    OtraClase objOtraClase = new OtraClase();
    UnaSubclase objUnaSubclase = new UnaSubclase();
    ClaseImportada objClaseImportada = new ClaseImportada();
    SubclaseImportada objSubclaseImportada = new SubclaseImportada();
    System.out.print("Valor original del atributo: ");
    objMiClase.mostrarMiAtributo();
    objMiClase.metodoMiClase();
    System.out.print("Valor del atributo modificado por el propio objeto: ");
    objMiClase.mostrarMiAtributo();
    objOtraClase.metodoOtraClase(objMiClase);
    System.out.print("Valor del atributo modificado por un objeto de otra clase: ");
    objMiClase.mostrarMiAtributo();
    objUnaSubclase.metodoSubclase(objMiClase);
    System.out.print("Valor del atributo modificado por un objeto de una subclase: ");
    objMiClase.mostrarMiAtributo();
    System.out.print("** Valor del atributo en el objeto de esa subclase: ");
    objUnaSubclase.mostrarMiAtributo();
    objClaseImportada.metodoClaseImportada(objMiClase);
    System.out.print("Valor de atributo modificado por objeto de una clase importada: ");
    objMiClase.mostrarMiAtributo();
    objSubclaseImportada.metodoSubclaseImportada(objMiClase);
    System.out.print("Valor de atributo modificado por objeto de subclase importada:");
    objMiClase.mostrarMiAtributo();
    System.out.print("** Valor del atributo en el objeto de esa subclase importada: ");
    objSubclaseImportada.mostrarMiAtributo();
  }
}

