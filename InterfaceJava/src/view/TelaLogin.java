package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class TelaLogin extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField txtPassword;
	private JTextField txtLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setTitle("RoroSwing");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaLogin.class.getResource("/images/javita.jpg")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 0, 606, 312);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel labelSenha = new JLabel("Contrase\u00F1a:");
		labelSenha.setFont(new Font("Tahoma", Font.BOLD, 18));
		labelSenha.setBounds(96, 104, 143, 27);
		panel.add(labelSenha);
		
		JLabel labelLogin = new JLabel("Login:");
		labelLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		labelLogin.setBounds(96, 38, 143, 27);
		panel.add(labelLogin);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(96, 131, 161, 20);
		panel.add(txtPassword);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {
				if (txtLogin.getText().equals("rodrigo")&&txtPassword.getText().equals("1234"))
				{
					JOptionPane.showMessageDialog(null, "¡Bienvenido Rodrigo!");
				}else {
					JOptionPane.showMessageDialog(null, "¡Acceso Denegado!");
				}}
			});
		btnNewButton.setBounds(165, 187, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/javita.jpg")));
		lblNewLabel_1.setBounds(270, -80, 336, 388);
		panel.add(lblNewLabel_1);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(96, 76, 161, 20);
		panel.add(txtLogin);
		txtLogin.setColumns(10);
	}
		}
