package solid;

public class TrianguloEquilatero extends PoligonoRegular {

  public TrianguloEquilatero(double lado) {
    super("Triangulo equilatero", lado);
  }

  @Override
  public double calcularArea() {
    return getLado() * getLado() * Math.sqrt(3) / 4;
  }
}
