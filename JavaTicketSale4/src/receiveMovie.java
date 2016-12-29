import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;


public class receiveMovie implements ItemListener {

	private JComboBox movieCombBox;

	public receiveMovie(JComboBox movieCombBox) {
		this.movieCombBox=movieCombBox;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==movieCombBox){
			if(e.getStateChange()==ItemEvent.SELECTED){
				String movie=(String)movieCombBox.getSelectedItem();
				ReceiveMessage.setMovie(movie);
			}
		}

	}

}
