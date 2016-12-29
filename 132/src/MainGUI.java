import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MainGUI extends JFrame {
	JPanel panel_1,panel_2,panel_3;

	public MainGUI() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("sign in");
		this.setBounds(400, 200, 400, 600);
		this.setLayout(new GridLayout(3,1));
		addmenubar();
        addpanel();
        addlabel();
	    addAboutMovieList();
		addbutton();
	}

	private void addlabel() {
		JLabel label_1=new JLabel("请选择电影:");
		label_1.setBounds(0, 0, 100, 30);
		panel_1.add(label_1);
		
		JLabel label_2=new JLabel("请选择票数:");
		label_2.setBounds(0, 40, 100, 30);
		panel_1.add(label_2);
		
		JLabel label1=new JLabel("请选择时间段:");
		label1.setBounds(0, 80, 100, 30);
		panel_1.add(label1);
		
		JLabel label_4=new JLabel("请选择座位:");
		label_4.setBounds(0, 120, 100, 30);
		panel_1.add(label_4);
	}

	private void addAboutMovieList() {
		String[]  movieList={"大鱼海棠","非常完美","非常完美2"};
		JComboBox movieCombBox=new JComboBox(movieList);
		movieCombBox.setBounds(100, 0, 100, 30);
		panel_1.add(movieCombBox);
		
		
		String[]  countList={"1","2","3"};
		JComboBox countCombBox=new JComboBox(countList);
		countCombBox.setBounds(100, 40, 100, 30);
		panel_1.add(countCombBox);
		
		String[]  timeList={"09:00","12:00","15:00","20:00","22:00"};
		JComboBox timeCombBox=new JComboBox(timeList);
		timeCombBox.setBounds(100, 80, 100, 30);
		panel_1.add(timeCombBox);

	}
	
	private void addpanel() {
		panel_1=new JPanel();
		panel_1.setLayout(null);
		this.getContentPane().add(panel_1);
		
		panel_2=new JPanel();
		GridLayout gridlayout=new GridLayout(5,5);
		panel_2.setLayout(gridlayout);
		panel_2.setBackground(Color.PINK);
		this.getContentPane().add(panel_2);
		
		panel_3=new JPanel();
		this.getContentPane().add(panel_3);
	}

	
	private void addbutton() {
		String[]seat={"1-1","1-2","1-3","1-4","1-5","2-1","2-2",
				"2-3","2-4","2-5","3-1","3-2","3-3","3-4","3-5","4-1","4-2","4-3","4-4","4-5","5-1","5-2",
				"5-3","5-4","5-5"};
		Button seatbutton;
		for(int i=0;i<seat.length;i++){
			seatbutton=new Button(seat[i]);
			seatbutton.addActionListener( new receiveSeat(seatbutton));
			panel_2.add(seatbutton);
		}
		
		Button ok=new Button("确认");
		Button canel=new Button("取消");
		ok.setBounds(100, 100, 100, 100);
		panel_3.add(ok);
		panel_3.add(canel);
	}

	private void addmenubar() {
		JMenuBar menubar = new JMenuBar();
		this.setJMenuBar(menubar);
		JMenu usermenu = new JMenu("user");
		JMenu helpmenu = new JMenu("help");
		menubar.add(usermenu);
		menubar.add(helpmenu);
		JMenuItem item1 = new JMenuItem("Sign in");
		JMenuItem item2 = new JMenuItem("About us");
		usermenu.add(item1);
		helpmenu.add(item2);
		item1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				Thread thread1 = new Thread(login);
				thread1.start();
			}
		});
		item2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				About about = new About();
			}
		});
	}

	public static void main(String[] args) {
		MainGUI gui = new MainGUI();

		gui.setVisible(true);
	}
}
