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
		JLabel name = new JLabel("请输入用户姓名：");
		JLabel password = new JLabel("请输入登陆密码：");
		final JTextField tfName = new JTextField(20);
		final JPasswordField tfPassword = new JPasswordField(20);
		JButton ok = new JButton("注册");
		JButton cancel = new JButton("登录");
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
				JOptionPane.showMessageDialog(null, "注册成功");
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
							JOptionPane.showMessageDialog(null, "登陆成功");
							
						} else {
							JOptionPane.showMessageDialog(null, "用户名或密码有误");
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