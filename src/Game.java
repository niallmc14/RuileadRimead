import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Game extends JPanel {
	private static JPanel panel = new JPanel();
	static BufferedImage img;
	static int panelWidth;
	static int panelHeight;
	
	public Game() {
		try
		{
			img = ImageIO.read(this.getClass().getResource("rrBg.jpg")); // loads in the image of the board
			panelWidth = img.getWidth();
			panelHeight = img.getHeight(); 
			setPreferredSize(new Dimension(1000, 1000));
		}
		catch (IOException e) {
		}
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(img, 0, 0, 1000, 1000, this); // paints the board image
	}
	
	public static void loadGame()
	{
		panel.add(new Game());
	}
	
	public static JPanel getGame(){
		return panel;
	}
	
	public static void pushButton(){
	int randomNumber = (int)(Math.random() * 8) + 1;
	
	switch(randomNumber){
	
	case 1:
		Game1();
		break;
	case 2:
		Game2();
		break;
		
	case 3:
		Game3();
		break;
		
	case 4:
		Game4();
		break;
		
	case 5:
		Game5();
		break;
		
	case 6:
		Game6();
		break;
		
	case 7:
		Game7();
		break;
	case 8:
		Game8();
		break;
	default: 
		JOptionPane.showMessageDialog(null, "Unlik");
	}
}
	public static void Game1(){
		JOptionPane.showMessageDialog(null, "Tóg 2 shots ! If no shots left skull that drink \n");
	}
	
	public static void Game2(){
		JOptionPane.showMessageDialog(null, "M8s....pick a chara");
	}
	
	public static void Game3(){
		JOptionPane.showMessageDialog(null, "Shot do gach duine eile !\n");

	}
	
	public static void Game4(){
		JOptionPane.showMessageDialog(null, "Catagóir ! ");

	}
	
	public static void Game5(){
		JOptionPane.showMessageDialog(null, "Ni dhearna me riamh ! ");
	}
	
	public static void Game6(){
		JOptionPane.showMessageDialog(null, "Ól an cupán");

	}
	
	public static void Game7(){
		JOptionPane.showMessageDialog(null, "Shot amháin");

	}
	
	public static void Game8(){
		JOptionPane.showMessageDialog(null, "Lion an cupán suas");

	}
}
	public static void refresh() {
		panel.repaint();
	}
}
