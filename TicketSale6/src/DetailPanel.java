import java.awt.Graphics;

import javax.swing.JPanel;

public class DetailPanel extends JPanel{
	private static String aboutmovie;
	public static void setmovie(String movie) {
		aboutmovie=movie;
		
	}
	public void paint(Graphics g){
		  super.paint(g);
		  if(aboutmovie.equals("非常完美"))
		    g.drawString("大鱼海棠的详细介绍", 20, 20);
	  }
}
