package net.codejava.sql;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;

public class DoctorSignUp {

	JFrame frame3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorSignUp window = new DoctorSignUp();
					window.frame3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	Connection connecting;
	private JTextField textFieldDFN;
	private JTextField textFieldDLN;
	private JTextField textFieldDEMAIL;
	private JTextField textFieldDPN;
	private JPasswordField DpasswordField;
	private JTextField textFieldS;
	public DoctorSignUp() {
		connecting = ConnectToSql.dbconnect();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame3 = new JFrame();
		frame3.getContentPane().setBackground(new Color(51,153,204,255));

	

		frame3.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Asif\\Downloads\\Desktop\\HospitalManagement\\image\\icon.png"));
		frame3.setBounds(100, 100, 800, 700);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOCTOR'S SIGN UP PAGE");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Agency FB", Font.PLAIN, 36));
		lblNewLabel.setBounds(453, 32, 256, 58);
		frame3.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Doctor's First Name");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(419, 127, 186, 39);
		frame3.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Doctor's Last Name");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(419, 195, 178, 43);
		frame3.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_5 = new JLabel("Phone Number");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblNewLabel_5.setBounds(419, 323, 152, 42);
		frame3.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(419, 395, 108, 41);
		frame3.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblNewLabel_4.setBounds(419, 454, 108, 48);
		frame3.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Specialize");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblNewLabel_6.setBounds(419, 258, 108, 41);
		frame3.getContentPane().add(lblNewLabel_6);
		
		textFieldS = new JTextField();
		textFieldS.setFont(new Font("Agency FB", Font.PLAIN, 25));
		textFieldS.setColumns(10);
		textFieldS.setBounds(627, 271, 108, 31);
		frame3.getContentPane().add(textFieldS);
		
		textFieldDFN = new JTextField();
		textFieldDFN.setFont(new Font("Agency FB", Font.PLAIN, 25));
		textFieldDFN.setBounds(627, 132, 108, 31);
		frame3.getContentPane().add(textFieldDFN);
		textFieldDFN.setColumns(10);
		
		textFieldDLN = new JTextField();
		textFieldDLN.setFont(new Font("Agency FB", Font.PLAIN, 25));
		textFieldDLN.setBounds(627, 202, 108, 31);
		frame3.getContentPane().add(textFieldDLN);
		textFieldDLN.setColumns(10);
		
		textFieldDEMAIL = new JTextField();
		textFieldDEMAIL.setFont(new Font("Agency FB", Font.PLAIN, 25));
		textFieldDEMAIL.setBounds(627, 400, 108, 31);
		frame3.getContentPane().add(textFieldDEMAIL);
		textFieldDEMAIL.setColumns(10);
		
		DpasswordField = new JPasswordField();
		DpasswordField.setFont(new Font("Agency FB", Font.PLAIN, 25));
		DpasswordField.setBounds(627, 464, 108, 31);
		frame3.getContentPane().add(DpasswordField);
		
		textFieldDPN = new JTextField();
		textFieldDPN.setFont(new Font("Agency FB", Font.PLAIN, 25));
		textFieldDPN.setBounds(627, 330, 108, 31);
		frame3.getContentPane().add(textFieldDPN);
		textFieldDPN.setColumns(10);
		
		JButton back = new JButton("Back");
		back.setForeground(new Color(0, 2, 49, 255));
		back.setBackground(new Color(143,248,224,255));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame3.dispose();
				Category ca = new Category();
				ca.frame2.setVisible(true);
			
			}
		});
		back.setFont(new Font("Agency FB", Font.BOLD, 30));
		back.setBounds(419, 544, 96, 39);
		frame3.getContentPane().add(back);
		
		JButton next2 = new JButton("Next");
		next2.setFont(new Font("Agency FB", Font.BOLD, 30));
		next2.setForeground(new Color(0, 2, 49, 255));
		next2.setBackground(new Color(143,248,224,255));

		next2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					//String url = "jdbc:sqlserver://LAPTOP-Q876CUHC\\SQLEXPRESS:1433;databaseName=HospitalManagement";
					//String user = "sa";
					//String password = "123456";
					//Connection conn = DriverManager.getConnection(url,user,password);
					String DFN = textFieldDFN.getText();
					String DLN = textFieldDLN.getText();
					String S = textFieldS.getText();
					String DEMAIL = textFieldDEMAIL.getText();
					String DPN = textFieldDPN.getText();
					String DPF = DpasswordField.getText();
					String sql = "INSERT INTO DOCTOR (DoctorFirstName,DoctorLastName,Specialize,DoctorPhoneNo,Email,Password) VALUES("+"'"+DFN+"',"+"'"+DLN+"',"+"'"+S+"',"+"'"+DPN+"',"+"'"+DEMAIL+"',"+"'"+DPF+"'"+")";
					Statement statement = connecting.createStatement();
					int rows = statement.executeUpdate(sql);
					if(rows > 1) {
						System.out.println("Executed Successfully");
					}
					//edit baki
					frame3.dispose();
					DoctorSignIn si = new DoctorSignIn();
					si.frame6.setVisible(true);
					connecting.close();
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		next2.setBounds(628, 544, 96, 39);
		frame3.getContentPane().add(next2);
		
		JLabel label2 = new JLabel("");

		label2.setBounds(393, 11, 391, 700);
		
	

		frame3.getContentPane().add(label2);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(37,183,225,255));

		Image img = new ImageIcon(this.getClass().getResource("/Doctor2.gif")).getImage();
		label.setIcon(new ImageIcon(img));
		
		label.setBounds(-230, 0, 620, 700);
		frame3.getContentPane().add(label);
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}