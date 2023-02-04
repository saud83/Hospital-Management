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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchInfo {

	JFrame frame9;
	private JTextField textField;
	private JTable table;
	private JScrollPane scrollPane;
	private JLabel lblSearchPatientInfo;
	private JButton btnNext;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchInfo window = new SearchInfo();
					window.frame9.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SearchInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame9 = new JFrame();
		frame9.getContentPane().setBackground(new Color(0,42,75,255));
		frame9.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Asif\\Downloads\\Desktop\\HospitalManagement\\image\\icon.png"));
		frame9.setBounds(100, 100, 800, 700);
		frame9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame9.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/galaxy.gif")).getImage();
		
		btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame9.dispose();
				Lab si = new Lab();
				si.frame15.setVisible(true);
			}
		});
		btnNext.setForeground(new Color(0, 2, 49));
		btnNext.setFont(new Font("Agency FB", Font.BOLD, 30));
		btnNext.setBackground(new Color(143, 248, 224));
		btnNext.setBounds(648, 588, 108, 39);
		frame9.getContentPane().add(btnNext);
		
		lblNewLabel_2 = new JLabel("Diagnosis");
		lblNewLabel_2.setForeground(new Color(125, 215, 247));
		lblNewLabel_2.setFont(new Font("Agency FB", Font.BOLD, 30));
		lblNewLabel_2.setBounds(35, 481, 148, 39);
		frame9.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Agency FB", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(265, 411, 148, 38);
		frame9.getContentPane().add(textField_1);
		
		lblNewLabel_1 = new JLabel("Symptom");
		lblNewLabel_1.setForeground(new Color(125, 215, 247));
		lblNewLabel_1.setFont(new Font("Agency FB", Font.BOLD, 30));
		lblNewLabel_1.setBounds(35, 409, 97, 39);
		frame9.getContentPane().add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Agency FB", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(265, 483, 148, 38);
		frame9.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Agency FB", Font.PLAIN, 25));
		textField_3.setColumns(10);
		textField_3.setBounds(265, 552, 148, 38);
		frame9.getContentPane().add(textField_3);
		
		lblNewLabel_3 = new JLabel("Prescribed Medicine");
		lblNewLabel_3.setForeground(new Color(125, 215, 247));
		lblNewLabel_3.setFont(new Font("Agency FB", Font.BOLD, 30));
		lblNewLabel_3.setBounds(35, 550, 201, 39);
		frame9.getContentPane().add(lblNewLabel_3);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 169, 764, 129);
		frame9.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Patient Id", "FirstName", "LastName", "Phone No","Age", "Weight", "Gender", "Medical History"
			}
		));
		table.setFont(new Font("Agency FB", Font.PLAIN, 25));
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 156, 784, 505);
		frame9.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_7 = new JLabel("Enter Patient ID");
		lblNewLabel_7.setForeground(new Color(125,215,247,255));
		lblNewLabel_7.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblNewLabel_7.setBounds(105, 104, 148, 39);
		frame9.getContentPane().add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setFont(new Font("Agency FB", Font.PLAIN, 25));
		textField.setColumns(10);
		textField.setBounds(335, 106, 148, 38);
		frame9.getContentPane().add(textField);
		
		JButton search = new JButton("Search");
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		search.setForeground(new Color(0, 2, 49));
		search.setFont(new Font("Agency FB", Font.BOLD, 30));
		search.setBackground(new Color(143, 248, 224));
		search.setBounds(569, 106, 108, 39);
		frame9.getContentPane().add(search);
		
		lblSearchPatientInfo = new JLabel("SEARCH PATIENT INFO");
		lblSearchPatientInfo.setForeground(new Color(125,215,247,255));
		lblSearchPatientInfo.setFont(new Font("Agency FB", Font.PLAIN, 36));
		lblSearchPatientInfo.setBounds(299, 11, 222, 58);
		frame9.getContentPane().add(lblSearchPatientInfo);
	}
}
