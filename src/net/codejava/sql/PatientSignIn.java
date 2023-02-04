package net.codejava.sql;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PatientSignIn {

	JFrame frame8;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientSignIn window = new PatientSignIn();
					window.frame8.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PatientSignIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame8 = new JFrame();
		frame8.getContentPane().setBackground(new Color(244,125,33,255));
		frame8.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Asif\\Downloads\\Desktop\\HospitalManagement\\image\\icon.png"));
		frame8.setBounds(100, 100, 800, 700);
		frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame8.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/patient2.gif")).getImage();
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Agency FB", Font.PLAIN, 25));
		passwordField.setBounds(632, 338, 108, 31);
		frame8.getContentPane().add(passwordField);
		
		JLabel lblPatientssSignUp = new JLabel("PATIENTS'S SIGN IN PAGE");
		lblPatientssSignUp.setForeground(Color.BLACK);
		lblPatientssSignUp.setFont(new Font("Agency FB", Font.PLAIN, 36));
		lblPatientssSignUp.setBounds(468, 118, 272, 58);
		frame8.getContentPane().add(lblPatientssSignUp);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame8.dispose();
				Category ca = new Category();
				ca.frame2.setVisible(true);
			}
		});
		back.setForeground(new Color(0, 2, 49));
		back.setFont(new Font("Agency FB", Font.BOLD, 30));
		back.setBackground(new Color(255, 206, 0));
		back.setBounds(444, 475, 96, 39);
		frame8.getContentPane().add(back);
		
		JButton next2 = new JButton("Next");
		next2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame8.dispose();
				PatientInformation si = new PatientInformation();
				si.frame10.setVisible(true);
			}
		});
		next2.setForeground(new Color(0, 2, 49));
		next2.setFont(new Font("Agency FB", Font.BOLD, 30));
		next2.setBackground(new Color(255, 206, 0));
		next2.setBounds(644, 475, 96, 39);
		frame8.getContentPane().add(next2);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(448, 249, 108, 41);
		frame8.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblNewLabel_4.setBounds(444, 328, 108, 48);
		frame8.getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setFont(new Font("Agency FB", Font.PLAIN, 25));
		textField.setColumns(10);
		textField.setBounds(632, 255, 108, 31);
		frame8.getContentPane().add(textField);
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(-183, 0, 590, 661);
		frame8.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(408, 0, 376, 661);
		frame8.getContentPane().add(lblNewLabel_1);
	}

}
