import com.google.zxing.BarcodeFormat;
import com.google.zxing.Writer;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.pdf417.encoder.PDF417Writer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;


public class barcode {

	public static void main(String srgs[]){
		
		BitMatrix bitMatrix;
		Writer writer = new PDF417Writer();
		try{
		// bit matrix encode method (String contents, BarcodeFormat format, int width, int height, Map<EncodeHintType,?> hints)
		//thorws Exception so try catch 
		bitMatrix = writer.encode("Hi this is Tejas Here !!", BarcodeFormat.PDF_417, 80, 150);
		bitMatrix = writer.encode("HI SSUP !!", BarcodeFormat.PDF_417, 80, 150);
		//Writes a BitMatrix to BufferedImage, file or stream in this case OutputStream on specified path
		MatrixToImageWriter.writeToStream(bitMatrix, "png", new FileOutputStream("/Users/tejassawant/Documents/workspace/PDF417_writer/File/PDF417_1.png"));
		System.out.println("PDF417 Generated !!");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
