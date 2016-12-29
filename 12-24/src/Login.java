import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class Login extends JFrame implements Runnable {
	/**
		 * 
		 */
	ArrayList<String> names = new ArrayList<String>();
	ArrayList<String> pwd = new ArrayList<String>();
	private static final long serialVersionUID = 1L;

	public Login() {
		this.setLocation(100, 100);
		this.setSize(400, 300);
		loginWindow();
		this.setVisible(true);
		
	}

	public void loginWindow() {
		JLabel name = new JLabel("�������û�������");
		JLabel password = new JLabel("�������½���룺");
		final JTextField tfName = new JTextField(20);
		final JPasswordField tfPassword = new JPasswordField(20);
		JButton ok = new JButton("ע��");
		JButton cancel = new JButton("��¼");
		JPanel pm = new JPanel();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		p1.add(name);
		p1.add(tfName);
		p2.add(password);
		p2.add(tfPassword);
		ok.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				names.add(tfName.getText());
				pwd.add(tfPassword.getText());
				JOptionPane.showMessageDialog(null, "ע��ɹ�");
				tfName.setText("");
				tfPassword.setText("");
			}
		});
		cancel.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				for (int i = 0; i < names.size(); i++) {
					if (names.get(i).equals(tfName.getText())) {
						if (pwd.get(i).equals(tfPassword.getText())) {
							JOptionPane.showMessageDialog(null, "��½�ɹ�");
							
						} else {
							JOptionPane.showMessageDialog(null, "�û�������������");
						}
					}
				}

			}
		});
		p3.add(ok);
		p3.add(cancel);
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