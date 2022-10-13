package archivosBinariosSecuenciales;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String nomArch = "";
        JFileChooser fc = new JFileChooser("src/main/resources");
        if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            nomArch = fc.getSelectedFile().getPath();
        }
        FileInputStream fis = new FileInputStream(nomArch);
        BufferedInputStream bis = new BufferedInputStream(fis);
        DataInputStream dis = new DataInputStream(bis);

        FileOutputStream fos = new FileOutputStream(nomArch + ".bak");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataOutputStream dos = new DataOutputStream(bos);

        int byteLeido;      // byte no permite contener 128..255. Por eso: int
        boolean finDeArchivo = false;
        while (!finDeArchivo) {
            try {
                byteLeido = dis.readByte();
                dos.writeByte(byteLeido);
            } catch (EOFException ex) {
                dos.close();
                finDeArchivo = true;
            }
        }
    }
}
