import java.awt.Graphics;

import javax.swing.JPanel;

public class DetailPanel extends JPanel{
	private static String aboutmovie;
	public static void setmovie(String movie) {
		aboutmovie=movie;
		
	}
	public void paint(Graphics g){
		  super.paint(g);
		  if(aboutmovie.equals("�ǳ�����"))
		    g.drawString("���㺣�ĵ���ϸ����", 20, 20);
	  }
}
