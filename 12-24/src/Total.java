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
		     g.drawString("��ѡ�����λΪ��"+Seat, 10, 10);
		  else
			  g.drawString("����ѡ����λ", 10, 10);
		  g.drawString("��ѡ��ĵ�ӰΪ��"+Movie, 40, 40);
	  }

	public static void setMovie(String movie) {
		Movie = movie;
		
	}

}
