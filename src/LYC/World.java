package LYC;

import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class World extends JPanel{
	public static final int WIDTH = 1300;// ���ڵĿ�
	public static final int HEIGHT = 700;// ���ڵĸ�
	private static BufferedImage image; 
		static{
			image=FlyingObject.loadImage("background.png");
		}
	

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		World world = new World();
		frame.add(world);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true); // 1)���ô��ڿɼ� 2)�������paint()����


	}

}
