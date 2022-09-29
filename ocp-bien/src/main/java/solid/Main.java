package solid;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<PoligonoRegular> c = new ArrayList<>();
    c.add(new TrianguloEquilatero(5));
    c.add(new Cuadrado(5));
    c.add(new PentagonoRegular(5));
    CalculadoraDeAreas calcu = new CalculadoraDeAreas(c);
    calcu.calcular();
  }
}
