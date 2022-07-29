import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;

public class tab {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tab window = new tab();
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
	public tab() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("show jtable");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 try {
		                Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb","root", "Dhoni@123");
		                Statement st=conn.createStatement();
		                String sql=("Select PersonId, Name,D_O_B,Fathers_Name,Email_id,Contact_No,Location,Nationality,Course,Branch,accomdation,fees from Details");
		                ResultSet rs=st.executeQuery(sql);
		                while(rs.next()) {
		                	String PersonId=String.valueOf(rs.getInt("PersonId"));
		                	String Name=String.valueOf(rs.getInt("Name"));
		                	String Father_Name=String.valueOf(rs.getInt("Fathers_Name"));
		                	String D_O_B=String.valueOf(rs.getInt("D_O_B"));
		                	String Email=String.valueOf(rs.getInt("Email_id"));
		                	String Phone_No=String.valueOf(rs.getInt("Contact_No"));
		                	String location=String.valueOf(rs.getInt(" Location"));
		                	String Nationality=String.valueOf(rs.getInt("Nationality"));
		                	String Course=String.valueOf(rs.getInt("Course"));
		                	String Branch=String.valueOf(rs.getInt("Branch"));
		                	String Accomdation=String.valueOf(rs.getInt("accomdation"));
		                	String Fees=String.valueOf(rs.getInt("fees"));
		                }
		               String[]={"PersonId", "Name", "Father_Name", "D_O_B", "Email", "Phone_No", "location", "Nationality", "Course", "Branch", "Accomdation", " Fees"};

		                DefaultTableModel.addRow(String);
		                System.out.println("Successfully Connected");
		    			
		              } 
				 catch (SQLException sqlException) 
		            {
					   sqlException.printStackTrace();
		               System.out.println("Error is Present");
		            }

			}
		});
		btnNewButton.setBounds(10, 75, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(157, 128, 148, -65);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"PersonId", "Name", "Father_Name", "D_O_B", "Email", "Phone_No", "location", "Nationality", "Course", "Branch", "Accomdation", " Fees"
			}
		));
			
		
		table.setBounds(298, 113, 114, 33);
		frame.getContentPane().add(table);
		

		
	}
}
