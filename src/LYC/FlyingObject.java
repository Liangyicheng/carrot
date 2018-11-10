package LYC;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;



public class FlyingObject {
	private int height;
	private int width;
	
	/** 读取图片 */
	public static BufferedImage loadImage(String fileName) {
		try {
			BufferedImage img = ImageIO.read(FlyingObject.class.getResource(fileName)); //同包中读文件        
			return img;
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}
