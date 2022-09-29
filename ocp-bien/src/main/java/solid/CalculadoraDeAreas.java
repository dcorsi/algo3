package solid;

import java.util.ArrayList;

public class CalculadoraDeAreas {

  private ArrayList<PoligonoRegular> c;

  public CalculadoraDeAreas(ArrayList<PoligonoRegular> c) {
    this.c = c;
  }

  public void calcular() {
    for (int i = 0; i < c.size(); i++) {
        PoligonoRegular p = c.get(i);
        System.out.println(p.getNombre() + ": " + Math.floor(p.calcularArea() * 100) / 100);
    }
  }
}
