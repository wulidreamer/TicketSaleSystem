import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;


public class receiveTime implements ItemListener {

	private JComboBox timeCombBox;

	public receiveTime(JComboBox timeCombBox) {
		this.timeCombBox=timeCombBox;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==timeCombBox){
			if(e.getStateChange()==ItemEvent.SELECTED){
				String time=(String)timeCombBox.getSelectedItem();
				ReceiveMessage.setTime(time);
			}
		}

	}

}
