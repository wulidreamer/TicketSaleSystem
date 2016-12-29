import java.awt.Graphics;

import javax.swing.JPanel;


public class ReceiveMessage extends JPanel{

	private static int LoginStatus;
	private static String Seat;
	private static String Movie;
	private static String Count;
	private static String Time;
	private static int moviemoney;
	
    
	public static void setLoginStatus(int loginStatus) {
		LoginStatus=loginStatus;
		
	}
	public static void setMovie(String movie) {
		Movie = movie;
		
	}

	public static void setCount(String count) {
		Count=count;
		
	}
	
	public static void setTime(String time) {
		Time=time;
		
	}
	
	public static void setseat(String seat) {
		Seat=seat;
		
	}
	public static void calculateMoney(){
		
		if(Movie.equals("大鱼海棠"))
			moviemoney=20;
	}
	 public void paint(Graphics g){
		  super.paint(g);
		  if(LoginStatus==1){
		  if(Movie!=null)
			     g.drawString("你选择的电影为："+Movie, 10, 10);
			  else
				  g.drawString("请先选择电影", 10, 10);
		  if(Count!=null)
			     g.drawString("你选择的电影票数为："+Count, 10, 30);
			  else
				  g.drawString("请先选择电影票数", 10, 30);
		  if(Time!=null)
			     g.drawString("你选择的时间段为："+Time, 10, 50);
			  else
				  g.drawString("请先选择时间段", 10, 50);
		  if(Seat!=null)
		     g.drawString("你选择的座位为："+Seat, 10, 70);
		  else
			  g.drawString("请先选择座位", 10, 70);
		  
	  }
		  else
			  g.drawString("请先登录", 10, 10);
	 }

	

	

	
}
