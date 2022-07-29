import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class page2 extends JFrame{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page2 a = new page2();
					a.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public page2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(147, 112, 219));
		panel.setBounds(0, 0, 289, 226);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(219, 112, 147));
		panel_1.setBounds(0, 226, 289, 233);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton Student = new JButton("Add Student");
		Student.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fee t = new fee();
				t.setVisible(true);
			}
		});
		Student.setBackground(new Color(219, 112, 147));
		Student.setFont(new Font("Tahoma", Font.PLAIN, 40));
		Student.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		Student.setBounds(26, 61, 235, 77);
		panel_1.add(Student);
		
		frame.setBounds(100, 100, 305, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.setLayout(null);
		
		JButton Teacher = new JButton("Add Teacher");
		Teacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Teacher1 n = new Teacher1();
				n.setVisible(true);
			}
		});
		
		Teacher.setBackground(new Color(147, 112, 219));
		Teacher.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		Teacher.setFont(new Font("Tahoma", Font.PLAIN, 40));
		Teacher.setBounds(10, 80, 269, 80);
		panel.add(Teacher);

		
		
		
			}
}
