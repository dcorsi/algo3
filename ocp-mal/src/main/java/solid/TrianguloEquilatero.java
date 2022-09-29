package solid;

public class TrianguloEquilatero {

  private double lado;
  private String nombre;

  public TrianguloEquilatero(double lado) {
    this.lado = lado;
    nombre = "Triangulo equilatero";
  }

  public String getNombre() {
    return nombre;
  }

  public double calcular() {
    return lado * lado * Math.sqrt(3) / 4;
  }
}
