package algo3;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		EncoderJPEG encoder = new EncoderJPEG();
		File jPEGfile = encoder.encode("photo.raw");
		// Aqui ya esta disponible photo.jpg
		
	}
}
