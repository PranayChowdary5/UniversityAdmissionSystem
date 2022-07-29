import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Cursor;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class login1{

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login1 window = new login1();
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
	public login1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 559, 321);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(199, 21, 133));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 285, 295);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		ImageIcon i4=new ImageIcon("srm.png");
		JLabel label3 = new JLabel("",i4,JLabel.CENTER);
		label3.setBounds(10, 0, 265, 294);
		panel.add(label3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 222, 173));
		panel_1.setBounds(284, 0, 311, 295);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Form");
		lblNewLabel.setBounds(56, 22, 159, 39);
		lblNewLabel.setForeground(new Color(0, 0, 205));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel_1.add(lblNewLabel);
		
		txtUsername = new JTextField();
		txtUsername.setDisabledTextColor(new Color(0, 0, 0));
		txtUsername.setSelectionColor(new Color(0, 0, 0));
		txtUsername.setForeground(new Color(0, 0, 0));
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUsername.setBorder(null);
		txtUsername.setBackground(new Color(255, 222, 173));
		txtUsername.setBounds(79, 89, 136, 20);
		panel_1.add(txtUsername);
		txtUsername.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setForeground(new Color(0, 0, 0));
		pwdPassword.setDisabledTextColor(new Color(0, 0, 0));
		pwdPassword.setSelectionColor(new Color(0, 0, 0));
		pwdPassword.setText("Password\r\n");
		pwdPassword.setEchoChar('*');
		pwdPassword.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		pwdPassword.setBorder(null);
		pwdPassword.setBackground(new Color(255, 222, 173));
		pwdPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pwdPassword.setToolTipText("****************");
		pwdPassword.setBounds(79, 133, 136, 20);
		panel_1.add(pwdPassword);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(205, 92, 92));
		separator.setBounds(79, 109, 159, 3);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(205, 92, 92));
		separator_1.setBounds(79, 153, 159, 3);
		panel_1.add(separator_1);
		
		JRadioButton rb33 = new JRadioButton("show Password");
		rb33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rb33.isSelected())
				{
					pwdPassword.setEchoChar((char)0);	
				}
				else
				{
					pwdPassword.setEchoChar('*');
				}
			}
		});
		rb33.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rb33.setBackground(new Color(255, 222, 173));
		rb33.setAutoscrolls(true);
		rb33.setForeground(new Color(106, 90, 205));
		rb33.setBounds(96, 164, 119, 23);
		panel_1.add(rb33);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1,s2;
	            char c4 []=pwdPassword.getPassword(); 
	            s1=txtUsername.getText();
	            s2=String.valueOf(c4);
	            try {
	                Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb","root", "Dhoni@123");
	                PreparedStatement st = conn.prepareStatement("Select name, password from Login_Details where name=? and password=?");

	                st.setString(1, s1);
	                st.setString(2, s2);
	                ResultSet rs = st.executeQuery();
	                if (rs.next()) {
	                      page3 p = new page3();
	                      p.setVisible(true);
	            
	                  } 
	                else {
	                    JOptionPane.showMessageDialog(frame, "Wrong Username & Password");
	                }
	            } catch (SQLException sqlException) 
	            {
	                sqlException.printStackTrace();
	            }
			}
		});
		btnNewButton.setActionCommand("Login");
		btnNewButton.setForeground(new Color(139, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton.setBackground(new Color(255, 222, 173));
		btnNewButton.setBounds(35, 205, 94, 32);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsername.setText("");
				pwdPassword.setText("");
			}
		});
		btnNewButton_1.setBackground(new Color(255, 222, 173));
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton_1.setForeground(new Color(128, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(164, 205, 89, 32);
		panel_1.add(btnNewButton_1);
		
		ImageIcon i2=new ImageIcon("icon1.png");
		JLabel l4 = new JLabel("",i2,JLabel.CENTER);
		l4.setBounds(20, 72, 46, 39);
		panel_1.add(l4);
		
	    
		ImageIcon i3=new ImageIcon("icon2.png");
		JLabel l3 = new JLabel("",i3,JLabel.CENTER);
		l3.setBounds(20, 115, 46, 52);
		panel_1.add(l3);
	}
}
