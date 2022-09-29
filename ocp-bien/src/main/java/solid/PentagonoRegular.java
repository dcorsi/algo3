package solid;

public class PentagonoRegular extends PoligonoRegular {

  public PentagonoRegular(double lado) {
    super("Pentagono regular", lado);
  }

  @Override
  public double calcularArea() {
    return 5*getLado()*getLado()/(4*Math.tan(Math.PI/5.0));
  }
}
