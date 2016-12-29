import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;


public class FianlMessage extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent arg0) {
		getMessageFrame();
        
	}
   public void getMessageFrame(){
	   JFrame frm=new JFrame();
	   frm.setBounds(300, 300, 200, 200);
	   ReceiveMessage messPanel=new ReceiveMessage();
	   frm.add(messPanel);
	   frm.setVisible(true);
	   
   }
	

}
