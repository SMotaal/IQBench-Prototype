
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class ORCodeDecoder {
	
	public static void main(String[] args) throws IOException{
		
		File imageFile = new File("/Users/tejassawant/Documents/workspace/PDF417_writer/File/Better_Sample_PDF417.png");
		BufferedImage image = ImageIO.read(imageFile);
		//BufferedImage cropedImage = image.getSubimage(0, 0, 900, 400);
		
		try{
			
			LuminanceSource source = new BufferedImageLuminanceSource(image);
			BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
			Reader reader = new MultiFormatReader();
			Result result = reader.decode(bitmap);
			
			System.out.println("Barcode Result: "+result.getText());
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
	} 

}
