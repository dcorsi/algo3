package serializacion;

import javax.swing.JOptionPane;

public class EntradaSalida {

    public static String leerString(String texto) {
        String st = JOptionPane.showInputDialog(texto);
        return (st == null ? "" : st);
    }

    public static boolean leerBoolean(String texto) {
        int i = JOptionPane.showConfirmDialog(null, texto, "Consulta", JOptionPane.YES_NO_OPTION);
        return i == JOptionPane.YES_OPTION;
    }

    public static void mostrarString(String s) {
        JOptionPane.showMessageDialog(null, s);
    }
}
