package algo3;

import java.io.File;

public class EncoderJPEG {

	private BlockPreparation blockPreparation;
	private DiscreteCosineTransform discreteCosineTransform;
	private Quantization quantization;
	private DifferentialQuantization differentialQuantization;
	private RunLengthEncoding runLengthEncoding;
	private StatisticalOutputEncoding statisticalOutputEncoding;

	public EncoderJPEG() {
		blockPreparation = new BlockPreparation();
		discreteCosineTransform = new DiscreteCosineTransform();
		quantization = new Quantization();
		differentialQuantization = new DifferentialQuantization();
		runLengthEncoding = new RunLengthEncoding();
		statisticalOutputEncoding = new StatisticalOutputEncoding();
	}

	public File encode(String fileName) {
		System.out.println("EncoderJPEG: iniciando la compresion de " + fileName + ".");
		File file1 = blockPreparation.prepare(fileName);
		File file2 = discreteCosineTransform.transform(file1);
		File file3 = quantization.quantize(file2);
		File file4 = differentialQuantization.quantize(file3);
		File file5 = runLengthEncoding.encode(file4);
		File file6 = statisticalOutputEncoding.encode(file5);
		System.out.print("EncoderJPEG: compresion finalizada. Se ha generado: ");
		System.out.println(fileName.substring(0, fileName.indexOf('.'))+".jpg");
		return file6;
	}
}
