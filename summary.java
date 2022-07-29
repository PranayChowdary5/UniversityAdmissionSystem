import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
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

public class summary extends Frame {

	private JFrame frame;	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					summary window = new summary();
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
	public summary() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 669, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Summary Report ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(199, 11, 247, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("No.of Students in Cse :-");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(21, 72, 197, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label1 = new JLabel("");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label1.setBounds(242, 75, 46, 14);
		frame.getContentPane().add(label1);

		
		JLabel lblNewLabel_2 = new JLabel("No.of Students in Ece :-");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(21, 107, 197, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
        JLabel label2 = new JLabel(" ");
		label2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label2.setBounds(242, 110, 46, 14);
		frame.getContentPane().add(label2);
		
		JLabel lblNewLabel_3 = new JLabel("No.of Students in Civil :-");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(21, 143, 197, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel label3 = new JLabel(" ");
		label3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label3.setBounds(242, 146, 46, 14);
		frame.getContentPane().add(label3);
		
		JLabel lblNewLabel_4 = new JLabel("No.of Students in Mech :-");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(21, 178, 209, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel label4 = new JLabel(" ");
		label4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label4.setBounds(242, 178, 46, 14);
		frame.getContentPane().add(label4);
		
		JLabel lblNewLabel_5 = new JLabel("No.of Students in Eee :-");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(21, 213, 209, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel label5 = new JLabel(" ");
		label5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label5.setBounds(242, 213, 46, 14);
		frame.getContentPane().add(label5);
		
	    JLabel lblNewLabel_6 = new JLabel("No.of Students in Bba :-");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(21, 238, 197, 31);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel label6 = new JLabel("");
		label6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label6.setBounds(242, 246, 46, 14);
		frame.getContentPane().add(label6);
		
		JLabel lblNewLabel_7 = new JLabel("No.of Students in B.sc :-");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(21, 281, 197, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel label7 = new JLabel("");
		label7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label7.setBounds(242, 284, 46, 14);
		frame.getContentPane().add(label7);
		
		JLabel lblNewLabel_8 = new JLabel("No.of Students in Bus :-");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(21, 316, 197, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		
		JLabel label8 = new JLabel(" ");
		label8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label8.setBounds(242, 319, 46, 14);
		frame.getContentPane().add(label8);
		
		JLabel lblNewLabel_9 = new JLabel("No.of Students in Hostel :-");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(21, 349, 222, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel label9 = new JLabel(" ");
		label9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label9.setBounds(242, 349, 46, 14);
		frame.getContentPane().add(label9);
		
		JLabel lblNewLabel_10 = new JLabel("Total Count :-");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(419, 146, 116, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel label10 = new JLabel("");
		label10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label10.setBounds(579, 143, 46, 14);
		frame.getContentPane().add(label10);
		
		JLabel lblNewLabel_11 = new JLabel("Male Count :-");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_11.setBounds(419, 118, 129, 16);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel label11 = new JLabel("");
		label11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label11.setBounds(579, 115, 55, 16);
		frame.getContentPane().add(label11);
		
		JLabel lblNewLabel_12 = new JLabel("Female Count:-");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_12.setBounds(419, 95, 129, 16);
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel label12 = new JLabel("");
		label12.setFont(new Font("SansSerif", Font.PLAIN, 18));
		label12.setBounds(579, 95, 55, 16);
		frame.getContentPane().add(label12);

		
		
		JButton btnNewButton = new JButton("Count");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb","root", "Dhoni@123");
	                PreparedStatement st = conn.prepareStatement("Select count(Branch) from Details where Branch='CSE'");
	                PreparedStatement st1 = conn.prepareStatement("Select count(Branch) from Details where Branch='ECE'");
	                PreparedStatement st2 = conn.prepareStatement("Select count(Branch) from Details where Branch='CIVIL'");
	                PreparedStatement st3= conn.prepareStatement("Select count(Branch) from Details where Branch='MECH'");
	                PreparedStatement st4= conn.prepareStatement("Select count(Branch) from Details where Branch='EEE'");
	                PreparedStatement st5= conn.prepareStatement("Select count(Branch) from Details where Branch='B.B.A'");
	                PreparedStatement st6= conn.prepareStatement("Select count(Branch) from Details where Branch='B.SC'");
	                PreparedStatement st7= conn.prepareStatement("Select count(accomdation) from Details where accomdation='Day Scholor'");
	                PreparedStatement st8= conn.prepareStatement("Select count(accomdation) from Details where accomdation='Hostller'");
	                PreparedStatement st9= conn.prepareStatement("Select count(*) from Details");
	                PreparedStatement st10= conn.prepareStatement("Select count(Gender) from Details where Gender='Male'");
	                PreparedStatement st11= conn.prepareStatement("Select count(Gender) from Details where Gender='Female'");
	                ResultSet rs= st.executeQuery();
	                while(rs.next())
	                {
	                	int count=rs.getInt(1);
	                	label1.setText(String.valueOf(count));
	                }
	                ResultSet rs1= st1.executeQuery();
	                while(rs1.next())
	                {
	                	int count=rs1.getInt(1);
	                	label2.setText(String.valueOf(count));
	                }
	                ResultSet rs2= st2.executeQuery();
	                while(rs2.next())
	                {
	                	int count=rs2.getInt(1);
	                	label3.setText(String.valueOf(count));
	                }
	                ResultSet rs3= st3.executeQuery();
	                while(rs3.next())
	                {
	                	int count=rs3.getInt(1);
	                	label4.setText(String.valueOf(count));
	                }
	                ResultSet rs4= st4.executeQuery();
	                while(rs4.next())
	                {
	                	int count=rs4.getInt(1);
	                	label5.setText(String.valueOf(count));
	                }
	                ResultSet rs5= st5.executeQuery();
	                while(rs5.next())
	                {
	                	int count=rs5.getInt(1);
	                	label6.setText(String.valueOf(count));
	                }
	                ResultSet rs6= st6.executeQuery();
	                while(rs6.next())
	                {
	                	int count=rs6.getInt(1);
	                	label7.setText(String.valueOf(count));
	                }
	                ResultSet rs7= st7.executeQuery();
	                while(rs7.next())
	                {
	                	int count=rs7.getInt(1);
	                	label8.setText(String.valueOf(count));
	                }
	                ResultSet rs8= st8.executeQuery();
	                while(rs8.next())
	                {
	                	int count=rs8.getInt(1);
	                	label9.setText(String.valueOf(count));
	                }
	                ResultSet rs9= st9.executeQuery();
	                while(rs9.next())
	                {
	                	int count=rs9.getInt(1);
	                	label10.setText(String.valueOf(count));
	                }
	                ResultSet rs10= st10.executeQuery();
	                while(rs10.next())
	                {
	                	int count=rs10.getInt(1);
	                	label11.setText(String.valueOf(count));
	                }

	                ResultSet rs11= st11.executeQuery();
	                while(rs11.next())
	                {
	                	int count=rs11.getInt(1);
	                	label12.setText(String.valueOf(count));
	                }
	                System.out.println("Successfully Connected");
				}
				catch (SQLException sqlException) 
	            {
				   sqlException.printStackTrace();
	               System.out.println("Error is Present");
	            }
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton.setBounds(469, 297, 116, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registration Form");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fee f=new fee();
				f.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(468, 346, 156, 23);
		frame.getContentPane().add(btnNewButton_1);
		
				
		
	
		}
}
