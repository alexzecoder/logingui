package loginPack;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblUserName;
	private JLabel lblPassword;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		setTitle("Please Login");
		Image bgimg = new ImageIcon(this.getClass().getResource("/img1.jpg")).getImage();
		Image okimg = new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		JButton btnOk = new JButton("Login");
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 55));
		btnOk.setHorizontalAlignment(SwingConstants.LEFT);
		btnOk.setIcon(new ImageIcon(okimg));
		btnOk.setBounds(324, 423, 199, 69);
		contentPane.add(btnOk);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.ITALIC, 24));
		passwordField.setBounds(542, 261, 252, 35);
		contentPane.add(passwordField);
		
		lblUserName = new JLabel("UserName : ");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblUserName.setBounds(324, 100, 199, 79);
		contentPane.add(lblUserName);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPassword.setBounds(324, 239, 199, 79);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setFont(new Font("Serif", Font.ITALIC, 24));
		textField.setBounds(532, 121, 262, 38);
		contentPane.add(textField);
		textField.setColumns(1);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(bgimg));
		bg.setBounds(0, 0, 794, 503);
		contentPane.add(bg);
		
		
	}
}