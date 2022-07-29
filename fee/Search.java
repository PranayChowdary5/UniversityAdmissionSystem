import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.*;

public class Search{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search window = new Search();
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
	public Search() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 22));
		frame.setBounds(100, 100, 761, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel D_O_B = new JLabel("Date_Of_Birth");
		D_O_B.setFont(new Font("Tahoma", Font.PLAIN, 12));
		D_O_B.setBounds(10, 90, 94, 26);
		frame.getContentPane().add(D_O_B);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setBounds(130, 91, 193, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel Email = new JLabel("Father_Name :-");
		Email.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Email.setBounds(10, 129, 86, 26);
		frame.getContentPane().add(Email);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_1.setBounds(130, 128, 193, 29);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel Phone = new JLabel("Email_Id :-");
		Phone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Phone.setBounds(10, 180, 94, 20);
		frame.getContentPane().add(Phone);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_2.setBounds(130, 178, 193, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel Course = new JLabel("Contact No:-");
		Course.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Course.setBounds(10, 222, 86, 24);
		frame.getContentPane().add(Course);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_3.setBounds(130, 222, 193, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Search Student");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(298, 8, 180, 34);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel S_Name = new JLabel("Student Name:-");
		S_Name.setFont(new Font("Tahoma", Font.PLAIN, 12));
		S_Name.setBounds(10, 53, 94, 26);
		frame.getContentPane().add(S_Name);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_4.setBounds(130, 53, 193, 26);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel Branch = new JLabel("Course:-");
		Branch.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Branch.setBounds(10, 268, 46, 20);
		frame.getContentPane().add(Branch);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_5.setBounds(130, 259, 193, 26);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel Accomdation = new JLabel("Branch :-");
		Accomdation.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Accomdation.setBounds(10, 306, 86, 20);
		frame.getContentPane().add(Accomdation);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_6.setBounds(130, 304, 193, 26);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton Search = new JButton("Search By Id");
		Search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
		                Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb","root", "Dhoni@123");
		                PreparedStatement st = conn.prepareStatement("Select Name,D_O_B,Fathers_Name,Email_id,Contact_No,Course,Branch,accomdation,fees from Details where PersonId=?");
		                System.out.println("Successfully Connected");
		                int id = Integer.parseInt(textField_7.getText());
		    			st.setInt(1, id);
		    			ResultSet rs1 = st.executeQuery();
		    			if(rs1.next()==false)
		    			{
		    				JOptionPane.showMessageDialog(frame, "Sorry Record Not Found");
		    				                textField.setText("");
		    				                textField_1.setText("");
		    				                textField_2.setText("");
		    				                textField_3.setText("");
		    				                textField_4.setText("");
		    				                textField_5.setText("");
		    				                textField_6.setText("");
		    				                textField_7.setText("");
		    				                textField_8.setText("");
				                            textField_9.setText("");

		    			 }
		                 else
		                   {
		                        	textField_4.setText(rs1.getString("Name"));
		                            textField.setText(rs1.getString("D_O_B"));
		                            textField_1.setText(rs1.getString("Fathers_Name"));
		                            textField_2.setText(rs1.getString("Email_id"));
		                            textField_3.setText(rs1.getString("Contact_No"));
		                            textField_5.setText(rs1.getString("Course"));
		                            textField_6.setText(rs1.getString("Branch"));
		                            textField_8.setText(rs1.getString("accomdation"));
		                            textField_9.setText(rs1.getString("fees"));
		                    }
		              } 
				 catch (SQLException sqlException) 
		            {
					   sqlException.printStackTrace();
		               System.out.println("Error is Present");
		            }
		      }
		});
		Search.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Search.setBounds(436, 147, 168, 40);
		frame.getContentPane().add(Search);
		
		JLabel id = new JLabel("ID:-");
		id.setFont(new Font("Tahoma", Font.PLAIN, 17));
		id.setBounds(406, 87, 46, 29);
		frame.getContentPane().add(id);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField_7.setBounds(462, 88, 116, 26);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    textField.setText("");
	                textField_1.setText("");
	                textField_2.setText("");
	                textField_3.setText("");
	                textField_4.setText("");
	                textField_5.setText("");
	                textField_6.setText("");
	                textField_7.setText("");
	                textField_8.setText("");
                    textField_9.setText("");

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(380, 222, 125, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registration Form");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fee h=new fee();
				h.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(549, 219, 151, 34);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel Fees = new JLabel("Accomdation :-");
		Fees.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Fees.setBounds(10, 353, 86, 20);
		frame.getContentPane().add(Fees);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_8.setBounds(130, 349, 193, 29);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Fees :-");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 406, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField_9 = new JTextField();
		textField_9.setBounds(130, 389, 193, 34);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
	}
}
