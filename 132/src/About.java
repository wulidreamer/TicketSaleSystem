import javax.swing.JFrame;


class About extends JFrame{
   public About(){
	this.setBounds(300, 300, 200, 100);   
	this.setVisible(true);
	AboutPanel aboutpanel=new AboutPanel();
	this.add(aboutpanel);
   }
}
