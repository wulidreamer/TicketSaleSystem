import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class About extends JFrame {

	public About() {
		this.setBounds(300, 300, 200, 300);
		this.setVisible(true);
		AboutPanel aboutPanel=new AboutPanel();
		this.add(aboutPanel);
		
	}
}
