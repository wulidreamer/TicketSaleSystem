import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class Login extends JFrame implements Runnable {

	Hashtable<String, String> user=new Hashtable<String, String>();
	private int loginStatus=0;
	private static final long serialVersionUID = 1L;

	public Login() {
		this.setLocation(100, 100);
		this.setSize(400, 300);
		loginWindow();
		this.setVisible(true);

	}

	public void loginWindow() {
		JLabel nameLabel = new JLabel("�������û�������");
		JLabel passwordLabel = new JLabel("�������½���룺");
		final JTextField username = new JTextField(20);
		final JPasswordField password = new JPasswordField(20);
		JButton registerButton = new JButton("ע��");
		JButton loginButton = new JButton("��¼");
		JPanel pm = new JPanel();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		p1.add(nameLabel);
		p1.add(username);
		p2.add(passwordLabel);
		p2.add(password);
		registerButton.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
		
				//user.put("123", "123");
				if(!(user.containsKey(username.getText()))){
				user.put(username.getText(), password.getText());
				JOptionPane.showMessageDialog(null, "ע��ɹ�");
				username.setText("");
				password.setText("");
				}
				else
					JOptionPane.showMessageDialog(null, "���û���ע�ᣬ���¼");
			}
		});
		loginButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (username.getText() == null || password.getText() == null)
					JOptionPane.showMessageDialog(null, "�������û���������");

				if (!(user.containsKey(username.getText()) && user.contains(password.getText())))
					JOptionPane.showMessageDialog(null, "�û������������");
				else{
					JOptionPane.showMessageDialog(null, "��¼�ɹ�");
					loginStatus=1;
					ReceiveMessage.setLoginStatus(loginStatus);
					MainGUI.setLoginStatus(loginStatus);
				}

			}
		});
		p3.add(registerButton);
		p3.add(loginButton);
		pm.add(p1);
		pm.add(p2);
		pm.add(p3);
		this.add(pm);

	}

	@Override
	public void run() {

		loginWindow();
	}

}