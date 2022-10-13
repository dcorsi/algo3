package claseFile;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JFileChooser;

public class Main {

    public static void main(String[] args) {
        String nomElegido = "";
        JFileChooser fc = new JFileChooser("src/main/java/claseFile");
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            nomElegido = fc.getSelectedFile().getPath();
        }

        File f = new File(nomElegido);
        System.out.println("Nombre: " + f.getName());
        System.out.println("Ubicado en: " + f.getParent());
        System.out.println("Última modificación: " + DateFormat.getInstance().format(new Date(f.lastModified())));
        if (f.isFile()) {
            System.out.println("ES UN ARCHIVO");
            System.out.println("Tamaño: " + f.length() + " bytes");
        }
        if (f.isDirectory()) {
            System.out.println("ES UN DIRECTORIO");
            System.out.println("Contenido:");
            int cantArchivos = 0;
            long tamArchivos = 0;
            int cantDirectorios = 0;
            for (File elemento : f.listFiles()) {
                System.out.print(DateFormat.getInstance().format(new Date(elemento.lastModified())));
                if (elemento.isFile()) {
                    cantArchivos++;
                    tamArchivos += elemento.length();
                    System.out.printf("     %,14d  ", elemento.length());
                } else if (elemento.isDirectory()) {
                    cantDirectorios++;
                    System.out.printf("     <DIR>           ");
                }
                System.out.println(elemento.getName());
            }
            System.out.printf(" %,7d archivos  %,14d  bytes\n", cantArchivos, tamArchivos);
            System.out.printf(" %,7d dirs      %,14d  bytes libres\n", cantDirectorios, f.getFreeSpace());
        }
    }
}
