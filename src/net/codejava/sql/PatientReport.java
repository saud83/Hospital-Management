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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PatientReport {

	JFrame frame11;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientReport window = new PatientReport();
					window.frame11.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PatientReport() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame11 = new JFrame();
		frame11.getContentPane().setBackground(new Color(251,182,170,255));

		frame11.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Asif\\Downloads\\Desktop\\HospitalManagement\\image\\icon.png"));
		frame11.setBounds(100, 100, 800, 700);
		frame11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame11.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, -18, 400, 693);
		Image img = new ImageIcon(this.getClass().getResource("/pattern.gif")).getImage();
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame11.dispose();
				DoctorSignIn si = new DoctorSignIn();
				si.frame6.setVisible(true);
			}
		});
		back.setForeground(new Color(0, 2, 49));
		back.setFont(new Font("Agency FB", Font.BOLD, 30));
		back.setBackground(new Color(146,211,207,255));
		back.setBounds(444, 536, 96, 39);
		frame11.getContentPane().add(back);
		
		JButton next2 = new JButton("Next");
		next2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame11.dispose();
				Lab si = new Lab();
				si.frame15.setVisible(true);
			
			}
		});
		next2.setForeground(new Color(0, 2, 49));
		next2.setFont(new Font("Agency FB", Font.BOLD, 30));
		next2.setBackground(new Color(146,211,207,255));
		next2.setBounds(655, 536, 96, 39);
		frame11.getContentPane().add(next2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Agency FB", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(643, 235, 108, 31);
		frame11.getContentPane().add(textField_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Agency FB", Font.PLAIN, 25));
		textField_4.setColumns(10);
		textField_4.setBounds(643, 432, 108, 31);
		frame11.getContentPane().add(textField_4);
		
		textField = new JTextField();
		textField.setFont(new Font("Agency FB", Font.PLAIN, 25));
		textField.setColumns(10);
		textField.setBounds(643, 172, 108, 31);
		frame11.getContentPane().add(textField);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Agency FB", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(643, 297, 108, 31);
		frame11.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Agency FB", Font.PLAIN, 25));
		textField_3.setColumns(10);
		textField_3.setBounds(643, 362, 108, 31);
		frame11.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_7_1 = new JLabel("Doctor ID");
		lblNewLabel_7_1.setForeground(new Color(56, 73, 156));
		lblNewLabel_7_1.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblNewLabel_7_1.setBounds(410, 230, 148, 39);
		frame11.getContentPane().add(lblNewLabel_7_1);
		
		JLabel lblSearchPatientInfo = new JLabel("SEARCH PATIENT INFO");
		lblSearchPatientInfo.setForeground(new Color(56,73,156,255));
		lblSearchPatientInfo.setFont(new Font("Agency FB", Font.PLAIN, 36));
		lblSearchPatientInfo.setBounds(477, 53, 222, 58);
		frame11.getContentPane().add(lblSearchPatientInfo);
		
		JLabel lblNewLabel_2 = new JLabel("Diagnosis");
		lblNewLabel_2.setForeground(new Color(56,73,156,255));
		lblNewLabel_2.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(410, 357, 148, 39);
		frame11.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Symptom");
		lblNewLabel_1_1.setForeground(new Color(56,73,156,255));
		lblNewLabel_1_1.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(412, 292, 97, 39);
		frame11.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Prescribed Medicine");
		lblNewLabel_3.setForeground(new Color(56,73,156,255));
		lblNewLabel_3.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(410, 424, 199, 39);
		frame11.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_7 = new JLabel("Patient ID");
		lblNewLabel_7.setForeground(new Color(56,73,156,255));
		lblNewLabel_7.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblNewLabel_7.setBounds(410, 167, 148, 39);
		frame11.getContentPane().add(lblNewLabel_7);
		lblNewLabel.setIcon(new ImageIcon(img));
		frame11.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(401, 0, 383, 650);
		frame11.getContentPane().add(lblNewLabel_1);
	}
}
