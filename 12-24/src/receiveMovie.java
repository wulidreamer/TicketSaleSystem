import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;


public class receiveMovie implements ActionListener {

	private Object movieCombBox;

	public receiveMovie(JComboBox movieCombBox) {
		this.movieCombBox=movieCombBox;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String movie=e.getSource().toString();
		String[]  movieList={"���㺣��","�ǳ�����","�ǳ�����2"};
		for(String i:movieList){
			if(movie.equals(i))
				Total.setMovie(movie);
		}
	}

}
