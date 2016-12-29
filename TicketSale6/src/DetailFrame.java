import javax.swing.JFrame;

public class DetailFrame extends JFrame{
    

	public DetailFrame(){
    	this.setBounds(100, 200, 200, 300);
    	this.setVisible(true);
    	DetailPanel depanel=new DetailPanel();
    	this.getContentPane().add(depanel);
    }

}
