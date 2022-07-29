import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.io.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Teacher extends JFrame{

	private JFrame frame;
	private JTextField textField_name;
	private JTextField textField_age;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_phone;
	private JTextField textField_sub;
	private JTextField textField_Loc;
	private JTextField textField_AAdhar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teacher window = new Teacher();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(186, 85, 211));
		frame.setBounds(100, 100, 324, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Teacher Details");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 41));
		lblNewLabel.setBounds(10, 0, 288, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name :- ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(10, 79, 75, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Age :-");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(10, 124, 75, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Phone No :-");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3.setBounds(10, 273, 108, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Subject :-");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_4.setBounds(10, 319, 108, 24);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Location :-");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_5.setBounds(10, 354, 108, 27);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Aadhar No :-");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_6.setBounds(10, 392, 123, 23);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Gender :-");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(10, 176, 75, 30);
		frame.getContentPane().add(lblNewLabel_7);
		
		textField_name = new JTextField();
		textField_name.setBounds(133, 82, 165, 25);
		frame.getContentPane().add(textField_name);
		textField_name.setColumns(10);
		
		textField_age = new JTextField();
		textField_age.setBounds(133, 132, 165, 23);
		frame.getContentPane().add(textField_age);
		textField_age.setColumns(10);
		
		JRadioButton rb1 = new JRadioButton("Male");
		buttonGroup.add(rb1);
		rb1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rb1.setBounds(133, 181, 59, 23);
		frame.getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Female");
		buttonGroup.add(rb2);
		rb2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rb2.setBounds(227, 181, 75, 23);
		frame.getContentPane().add(rb2);
		
		JLabel lblNewLabel_8 = new JLabel("D.O.B :-");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_8.setBounds(10, 228, 75, 23);
		frame.getContentPane().add(lblNewLabel_8);
		
		JDateChooser dateChooser_DOB = new JDateChooser();
		dateChooser_DOB.setBounds(133, 228, 165, 20);
		frame.getContentPane().add(dateChooser_DOB);
		
		textField_phone = new JTextField();
		textField_phone.setBounds(133, 279, 165, 20);
		frame.getContentPane().add(textField_phone);
		textField_phone.setColumns(10);
		
		textField_sub = new JTextField();
		textField_sub.setBounds(133, 319, 165, 20);
		frame.getContentPane().add(textField_sub);
		textField_sub.setColumns(10);
		
		textField_Loc = new JTextField();
		textField_Loc.setBounds(132, 361, 166, 20);
		frame.getContentPane().add(textField_Loc);
		textField_Loc.setColumns(10);
		
		textField_AAdhar = new JTextField();
		textField_AAdhar.setBounds(133, 397, 165, 20);
		frame.getContentPane().add(textField_AAdhar);
		textField_AAdhar.setColumns(10);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				   Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb","root","Dhoni@123");
		           System.out.println("Successfully Connected");
		           String query="Insert into Teacher(Name,age,gender,D_O_B,phone_no,subject_teaches,location,aadhar_no)values(?,?,?,?,?,?,?,?)";            
		           PreparedStatement ps=conn.prepareStatement(query);
		           ps.setString(1,textField_name.getText());
		           ps.setString(2,textField_age.getText());
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
		           ps.setString(5,textField_phone.getText());
		           ps.setString(6,textField_sub.getText());
		           ps.setString(7,textField_Loc.getText());
		           ps.setString(8,textField_AAdhar.getText());
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
		submit.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		submit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		submit.setBounds(20, 420, 98, 36);
		frame.getContentPane().add(submit);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    page2 t= new page2();
        		t.setVisible(true);
			}
		});
		back.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		back.setFont(new Font("Tahoma", Font.PLAIN, 18));
		back.setBounds(180, 423, 89, 30);
		frame.getContentPane().add(back);
	}
	public Teacher() {
		initialize();
	}
}
