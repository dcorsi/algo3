package archivosBinariosAccesoAleatorio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JFileChooser;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String nomArch = "";
        JFileChooser fc = new JFileChooser("src/main/resources");
        if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            nomArch = fc.getSelectedFile().getPath();
        }

        RandomAccessFile raf = new RandomAccessFile(nomArch, "rw");

        long tam = raf.length();
        for (long i = 0; i < tam / 2; i++) {
            raf.seek(i);
            int b1 = raf.read();
            raf.seek(tam - i - 1);
            int b2 = raf.read();
            raf.seek(i);
            raf.write(b2);
            raf.seek(tam - i - 1);
            raf.write(b1);
        }
        
        raf.close();
    }
}