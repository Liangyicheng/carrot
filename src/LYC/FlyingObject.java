package LYC;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;



public class FlyingObject {
	private int height;
	private int width;
	
	/** ��ȡͼƬ */
	public static BufferedImage loadImage(String fileName) {
		try {
			BufferedImage img = ImageIO.read(FlyingObject.class.getResource(fileName)); //ͬ���ж��ļ�        
			return img;
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}
