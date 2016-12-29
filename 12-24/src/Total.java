import java.awt.Graphics;

import javax.swing.JPanel;


public class Total extends JPanel{

	private static String Seat;
	private static String Movie;

	public static void setseat(String seat) {
		Seat=seat;
		
	}
	
	 public void paint(Graphics g){
		  super.paint(g);
		  if(Seat!=null)
		     g.drawString("你选择的座位为："+Seat, 10, 10);
		  else
			  g.drawString("请先选择座位", 10, 10);
		  g.drawString("你选择的电影为："+Movie, 40, 40);
	  }

	public static void setMovie(String movie) {
		Movie = movie;
		
	}

}
