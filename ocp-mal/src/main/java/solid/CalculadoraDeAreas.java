package solid;

import java.util.ArrayList;

public class CalculadoraDeAreas {

  private ArrayList c;

  public CalculadoraDeAreas(ArrayList c) {
    this.c = c;
  }

  public void calcular() {
    for (int i = 0; i < c.size(); i++) {
        Object p = c.get(i);
        if (p instanceof TrianguloEquilatero) {
            TrianguloEquilatero t = (TrianguloEquilatero) p;
            System.out.println(t.getNombre() + ": " + Math.floor(t.calcular() * 100) / 100);
        } else if (p instanceof Cuadrado) {
            Cuadrado q = (Cuadrado) p;
            System.out.println(q.getNombre() + ": " + Math.floor(q.calcularArea() * 100) / 100);
        } else if (p instanceof PentagonoRegular) {
            PentagonoRegular z = (PentagonoRegular) p;
            System.out.println(z.getNombre() + ": " + Math.floor(z.calcularSup() * 100) / 100);
        }
    }
  }
}
