package algo3;

public class FileReader extends InputStreamReader {
	private String nomArchivo;

	public FileReader(String nomArchivo) {
		this.nomArchivo = nomArchivo;
	}

	@Override
	public int read() {
		System.out.println("read() de FileReader");
		System.out.println("Devuelve un carácter del archivo: " + nomArchivo);
		return super.read();
	}
}
