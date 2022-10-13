package archivosDeTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import javax.swing.JFileChooser;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String nomArch = "";
        JFileChooser fc = new JFileChooser("src/main/resources");
        if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            nomArch = fc.getSelectedFile().getPath();
        }
        FileReader fr = new FileReader(nomArch);
        BufferedReader br = new BufferedReader(fr);
        LineNumberReader lr = new LineNumberReader(br);

        FileWriter fw = new FileWriter(nomArch + ".bak");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        String renglon;
        while ((renglon = lr.readLine()) != null) {
            pw.println(lr.getLineNumber() + ") " + renglon);
        }

        pw.close();
    }
}
