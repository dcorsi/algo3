package algo3;

public class BufferedReader extends Reader {
	private Reader c;

	public BufferedReader(Reader c) {
		this.c = c;
	}

	@Override
	public int read() {
		System.out.println("read() de BufferedReader");
		System.out.println("Devuelve un carácter del buffer cargado a partir de: " + c);
		return 65;
	}

	public String readLine() {
		System.out.println("readLine() de BufferedReader");
		System.out.println("Devuelve un renglón del buffer cargado a partir de: " + c);
		return "Hola mundo";
	}
}
