import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class Teacher1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_Phone;
	private JTextField textField_Name;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textField_Sub;
	private JTextField textField_Loc;
	private JTextField textField_Aadhar;
	private JTextField textField_Age;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teacher1 frame = new Teacher1();
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
	public Teacher1() {
		setBackground(new Color(218, 112, 214));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 349, 497);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(220, 20, 60));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Teacher Details");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setBounds(75, 22, 199, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name :- ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(10, 79, 75, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Age :-");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(10, 124, 75, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Phone No :-");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3.setBounds(10, 256, 108, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Subject :-");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_4.setBounds(10, 299, 108, 24);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Location :-");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_5.setBounds(10, 345, 108, 27);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Aadhar No :-");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_6.setBounds(10, 392, 123, 23);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Gender :-");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(10, 165, 75, 30);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("D.O.B :-");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_8.setBounds(10, 216, 75, 23);
        contentPane.add(lblNewLabel_8);
		
		
		JRadioButton rb1 = new JRadioButton("Male");
		buttonGroup.add(rb1);
		rb1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rb1.setBounds(133, 170, 59, 23);
		contentPane.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Female");
		buttonGroup.add(rb2);
		rb2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rb2.setBounds(225, 170, 75, 23);
		contentPane.add(rb2);
		
				
		JDateChooser dateChooser_DOB = new JDateChooser();
		dateChooser_DOB.setBounds(135, 216, 165, 20);
		contentPane.add(dateChooser_DOB);
		
		textField_Name = new JTextField();
		textField_Name.setBounds(133, 77, 169, 20);
		contentPane.add(textField_Name);
		textField_Name.setColumns(10);
		
		textField_Phone = new JTextField();
		textField_Phone.setBounds(135, 262, 165, 20);
		contentPane.add(textField_Phone);
		textField_Phone.setColumns(10);
		
		textField_Sub = new JTextField();
		textField_Sub.setBounds(133, 305, 167, 20);
		contentPane.add(textField_Sub);
		textField_Sub.setColumns(10);
		
		textField_Loc = new JTextField();
		textField_Loc.setBounds(133, 352, 167, 20);
		contentPane.add(textField_Loc);
		textField_Loc.setColumns(10);
		
		textField_Aadhar = new JTextField();
		textField_Aadhar.setBounds(133, 392, 167, 20);
		contentPane.add(textField_Aadhar);
		textField_Aadhar.setColumns(10);
		
		textField_Age = new JTextField();
		textField_Age.setBounds(133, 124, 167, 20);
		contentPane.add(textField_Age);
		textField_Age.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				   Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb","root","Dhoni@123");
		           System.out.println("Successfully Connected");
		           String query="Insert into Teacher(Name,age,gender,D_O_B,phone_no,subject_teaches,location,aadhar_no)values(?,?,?,?,?,?,?,?)";            
		           PreparedStatement ps=conn.prepareStatement(query);
		           ps.setString(1,textField_Name.getText());
		           ps.setString(2,textField_Age.getText());
		           String gender = null;
				   if(rb1.isSelected())
		            {
		               gender="Male";
		            }
		           if(rb2.isSelected())
		            {
		                gender="Female";
		            }
		           ps.setString(3,gender);
		           SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		           String date=sdf.format(dateChooser_DOB.getDate());
		           ps.setString(4,date);
		           ps.setString(5,textField_Phone.getText());
		           ps.setString(6,textField_Sub.getText());
		           ps.setString(7,textField_Loc.getText());
		           ps.setString(8,textField_Aadhar.getText());
		           ps.executeUpdate();
		           conn.close();
		           System.out.println("sucessfully Updated");
				}
				catch(SQLException ex){
		             System.out.println("Error is present");
		             ex.printStackTrace();
		          } 
			}
		});
		btnNewButton.setBounds(33, 424, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page3 p = new page3();
				p.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(226, 424, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
	}
}
