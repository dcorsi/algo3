package solid;

public class Cuadrado {

  private double lado;
  private String nombre;

  public Cuadrado(double lado) {
      this.lado = lado;
      nombre = "Cuadrado";
  }

  public String getNombre() {
      return nombre;
  }

  public double calcularArea() {
      return lado * lado;
  }
}
