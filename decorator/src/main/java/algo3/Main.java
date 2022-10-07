package algo3;

public class Main {
	public static void main(String[] args) {
		String nomArch = "hola.txt";
		FileReader fr = new FileReader(nomArch);
		System.out.println((char) fr.read());
		System.out.println();
		FileReader fr2 = new FileReader(nomArch);
		BufferedReader br = new BufferedReader(fr2);
		System.out.println((char) br.read());
		System.out.println(br.readLine());
	}
}