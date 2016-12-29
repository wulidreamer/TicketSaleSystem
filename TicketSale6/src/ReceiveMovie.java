import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;


public class ReceiveMovie implements ItemListener {

	private JComboBox movieCombBox;

	public ReceiveMovie(JComboBox movieCombBox) {
		this.movieCombBox=movieCombBox;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==movieCombBox){
			if(e.getStateChange()==ItemEvent.SELECTED){
				String movie=(String)movieCombBox.getSelectedItem();
				DetailPanel.setmovie(movie);
				ReceiveMessage.setMovie(movie);
			}
		}

	}

}
