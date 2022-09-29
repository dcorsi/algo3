package solid;

public class PentagonoRegular {

  private double lado;
  private String nombre;

  public PentagonoRegular(double lado) {
    this.lado = lado;
    nombre = "Pentagono regular";
  }

  public String getNombre() {
    return nombre;
  }

  public double calcularSup() {
    return 5 * lado * lado / (4 * Math.tan(Math.PI / 5.0));
  }
}
