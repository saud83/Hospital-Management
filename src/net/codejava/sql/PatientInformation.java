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
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class PatientInformation {

	JFrame frame10;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientInformation window = new PatientInformation();
					window.frame10.setVisible(true);
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
	
	private JTextField textFieldPA;
	private JTextField textFieldPLN;
	private JTextField textFieldPFN;
	private JTextField textFieldPW;
	private JTextField textFieldPG;
	private JTextField textFieldPID;
	private JTextField textFieldPMH;
	
	public PatientInformation() {
		connecting = ConnectToSql.dbconnect();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame10 = new JFrame();
		frame10.getContentPane().setBackground(new Color(255,255,255,255));
		frame10.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Asif\\Downloads\\Desktop\\HospitalManagement\\image\\icon.png"));
		frame10.setBounds(100, 100, 800, 700);
		frame10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame10.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(-56, 97, 475, 564);
		Image img = new ImageIcon(this.getClass().getResource("/doctor7.jpg")).getImage();
		
		textFieldPG = new JTextField();
		textFieldPG.setFont(new Font("Agency FB", Font.PLAIN, 25));
		textFieldPG.setColumns(10);
		textFieldPG.setBounds(664, 418, 108, 31);
		frame10.getContentPane().add(textFieldPG);
		
		textFieldPID = new JTextField();
		textFieldPID.setFont(new Font("Agency FB", Font.PLAIN, 25));
		textFieldPID.setColumns(10);
		textFieldPID.setBounds(664, 126, 108, 31);
		frame10.getContentPane().add(textFieldPID);
		
		JLabel lblNewLabel_2_1 = new JLabel("Patient ID");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblNewLabel_2_1.setBounds(436, 119, 178, 43);
		frame10.getContentPane().add(lblNewLabel_2_1);
		
		textFieldPMH = new JTextField();
		textFieldPMH.setFont(new Font("Agency FB", Font.PLAIN, 25));
		textFieldPMH.setColumns(10);
		textFieldPMH.setBounds(664, 481, 108, 31);
		frame10.getContentPane().add(textFieldPMH);
		
		JLabel lblNewLabel_5_1 = new JLabel("Medical History");
		lblNewLabel_5_1.setForeground(Color.BLACK);
		lblNewLabel_5_1.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblNewLabel_5_1.setBounds(436, 474, 218, 42);
		frame10.getContentPane().add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("Gender");
		lblNewLabel_7_1.setForeground(Color.BLACK);
		lblNewLabel_7_1.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblNewLabel_7_1.setBounds(436, 414, 186, 39);
		frame10.getContentPane().add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7 = new JLabel("Patient's First Name");
		lblNewLabel_7.setForeground(Color.BLACK);
		lblNewLabel_7.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblNewLabel_7.setBounds(436, 184, 186, 39);
		frame10.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_5 = new JLabel("Age");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblNewLabel_5.setBounds(436, 298, 218, 42);
		frame10.getContentPane().add(lblNewLabel_5);
		
		JButton next2 = new JButton("Next");
		next2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//String url = "jdbc:sqlserver://LAPTOP-Q876CUHC\\SQLEXPRESS:1433;databaseName=HospitalManagement";
					//String user = "sa";
					//String password = "123456";
					//Connection conn = DriverManager.getConnection(url,user,password);
					//PatientInfoId int IDENTITY(1,1) PRIMARY KEY,
					//PatientFirstName varchar(20) NOT NULL,
					//PatientLastName varchar(20) NOT NULL,
					//Age int NOT NULL,
					//Weight float NOT NULL,
					//Gender varchar(10) NOT NULL,
					//Disease text NOT NULL,
					//MedicalHistory text NOT NULL,
					
					
					String PFN = textFieldPFN.getText();
					String PLN = textFieldPLN.getText();
					String PA = textFieldPA.getText();
					String PW = textFieldPW.getText();
					String PG = textFieldPG.getText();
					String PMH = textFieldPMH.getText();
					String PID = textFieldPID.getText();
					String sql = "INSERT INTO PATIENTINFO (PatientFirstName,PatientLastName,Age,Weight,Gender,MedicalHistory,PatientId) VALUES("+"'"+PFN+"',"+"'"+PLN+"',"+"'"+PA+"',"+"'"+PW+"',"+"'"+PG+"',"+"'"+PMH+"',"+"'"+PID+"'"+")";
					Statement statement = connecting.createStatement();																
					int rows = statement.executeUpdate(sql);
					if(rows > 1) {
						System.out.println("Executed Successfully");
					}
					//edit baki
					frame10.dispose();
					Lab si = new Lab();
					si.frame15.setVisible(true);
					connecting.close();
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		next2.setForeground(new Color(0, 2, 49));
		next2.setFont(new Font("Agency FB", Font.BOLD, 30));
		next2.setBackground(new Color(255, 206, 0));
		next2.setBounds(676, 590, 96, 39);
		frame10.getContentPane().add(next2);
		
		textFieldPLN = new JTextField();
		textFieldPLN.setFont(new Font("Agency FB", Font.PLAIN, 25));
		textFieldPLN.setColumns(10);
		textFieldPLN.setBounds(664, 246, 108, 31);
		frame10.getContentPane().add(textFieldPLN);
		
		JLabel lblNewLabel_2 = new JLabel("Patient's Last Name");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(436, 239, 178, 43);
		frame10.getContentPane().add(lblNewLabel_2);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame10.dispose();
				PatientSignIn si = new PatientSignIn();
				si.frame8.setVisible(true);
			}
		});
		back.setForeground(new Color(0, 2, 49));
		back.setFont(new Font("Agency FB", Font.BOLD, 30));
		back.setBackground(new Color(255, 206, 0));
		back.setBounds(465, 590, 96, 39);
		frame10.getContentPane().add(back);
		
		textFieldPFN = new JTextField();
		textFieldPFN.setFont(new Font("Agency FB", Font.PLAIN, 25));
		textFieldPFN.setColumns(10);
		textFieldPFN.setBounds(664, 189, 108, 31);
		frame10.getContentPane().add(textFieldPFN);
		
		textFieldPA = new JTextField();
		textFieldPA.setFont(new Font("Agency FB", Font.PLAIN, 25));
		textFieldPA.setColumns(10);
		textFieldPA.setBounds(664, 305, 108, 31);
		frame10.getContentPane().add(textFieldPA);
		
		textFieldPW = new JTextField();
		textFieldPW.setFont(new Font("Agency FB", Font.PLAIN, 25));
		textFieldPW.setColumns(10);
		textFieldPW.setBounds(664, 361, 108, 31);
		frame10.getContentPane().add(textFieldPW);
		
		JLabel lblNewLabel_3 = new JLabel("Weight");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(436, 355, 108, 41);
		frame10.getContentPane().add(lblNewLabel_3);
		lblNewLabel.setIcon(new ImageIcon(img));
		frame10.getContentPane().add(lblNewLabel);
		
		JLabel lblSearchPatientInfo = new JLabel("PATIENT INFORMATION");
		lblSearchPatientInfo.setForeground(new Color(58,48,83,255));
		lblSearchPatientInfo.setFont(new Font("Agency FB", Font.PLAIN, 36));
		lblSearchPatientInfo.setBounds(286, 11, 222, 58);
		frame10.getContentPane().add(lblSearchPatientInfo);
	}
}
