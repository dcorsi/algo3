package patos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pato> c = new ArrayList<>();
        FactoriaDePatos fp = FactoriaDePatos.getInstance();
        c.add(fp.crearPato("PatoOvero"));
        c.add(fp.crearPato("PatoCapuchino"));
        c.add(fp.crearPato("PatoDeGoma"));

        for (int i = 0; i < c.size(); i++) {
            Pato p = c.get(i);
            p.mostrar();
            p.parpar();
            p.nadar();
            p.volar();
            System.out.println();
        }
    }
}
