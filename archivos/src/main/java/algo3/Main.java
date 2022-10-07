package algo3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String nomArch = "";
		JFileChooser fc = new JFileChooser("src/main/resources");
		if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			nomArch = fc.getSelectedFile().getPath();
		}
		FileReader fr = new FileReader(nomArch);
		System.out.println((char) fr.read());
		System.out.println();
		FileReader fr2 = new FileReader(nomArch);
		BufferedReader br = new BufferedReader(fr2);
		System.out.println((char) br.read());
		System.out.println(br.readLine());
		
		fr.close();
		br.close();
	}
}