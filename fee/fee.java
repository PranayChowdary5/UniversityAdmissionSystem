import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*; 
import java.sql.*;
import java.text.SimpleDateFormat;
import com.toedter.calendar.JDateChooser;
public class fee extends Frame
 {  
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l12,l13,l14,l11,l15,l16,l17;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13;
    JTextArea area2,area1;
    JRadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7;
    JFileChooser f1;
    int count=10;
    String gender,Groups,Stay,Fee;
    fee(){
        tf11=new JTextField();
        tf11.setBounds(250,100, 250,20);
        l16=new JLabel ("Student ID:-");
        l16.setBounds(50,100, 250,20); 
        l2=new JLabel("Name of the Student:");  
        l2.setBounds(50,150, 250,20);
        tf1=new JTextField();  
        tf1.setBounds(250,150,250,20);  
        l3=new JLabel("Name of the Father:");  
        l3.setBounds(50,200, 250,20); 
        tf2=new JTextField();  
        tf2.setBounds(250,200,250,20);  
        l4=new JLabel("Date Of Birth :-");  
        l4.setBounds(50,250, 250,20);
        //tf3=new JTextField();  
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(250,250,250,20);  
        l5=new JLabel("Email ID:");
        l5.setBounds(50,300, 250,20); 
        tf4=new JTextField();  
        tf4.setBounds(250,300,250,20);  
        l6=new JLabel("Contact Number :-");  
        l6.setBounds(50,350, 250,20); 
        tf5=new JTextField(); 
        tf5.setBounds(250,350,250,20);  
        l7=new JLabel("Location :-");  
        l7.setBounds(50,400, 250,20);    
        tf12=new JTextField();  
        tf12.setBounds(250,400,250,20); 
        l17=new JLabel("Nationality :-");  
        l17.setBounds(50,450, 250,20);
        tf13=new JTextField();  
        tf13.setBounds(250,450,250,20); 
        l9=new JLabel("Gender :-");  
        l9.setBounds(50,500, 250,20); 
        rb5=new JRadioButton("Male");
        rb6=new JRadioButton("Female");   
        rb5.setBounds(250,500,100,30);    
        rb6.setBounds(350,500,100,30);    
        ButtonGroup bg=new ButtonGroup();    
        bg.add(rb5);
        bg.add(rb6);   
        l10=new JLabel("12th Percentage / Cgpa :-");  
        l10.setBounds(50,550, 250,20);
        tf6=new JTextField();  
        tf6.setBounds(250,550,250,20);  
        l11=new JLabel("Year of passing 10th");  
        l11.setBounds(50,600, 250,20); 
        String language[]={"2016","2015","2014"};        
        final JComboBox<?> cb1=new JComboBox<Object>(language);    
        cb1.setBounds(250, 600,90,20);  
        l12=new JLabel("Year of passing 12th");  
        l12.setBounds(50,650, 250,20); 
        String languagess[]={"2019","2018","2017"};  
        l13=new JLabel("Points Secured in 10th:");  
        l13.setBounds(50,700, 250,20);
        tf7=new JTextField();  
        tf7.setBounds(250,700,250,20); 
        ImageIcon i2=new ImageIcon("SRM2.png");
        JLabel l15= new JLabel("",i2,JLabel.CENTER);
        l15.setBounds(1090,25,300,270);
        
        final JComboBox<?> cb2=new JComboBox<Object>(languagess);    
        cb2.setBounds(250, 650,90,20);  
        l8=new JLabel("Groups Offered here are:");  
        l8.setBounds(800,150, 250,20); 
        rb1=new JRadioButton("SEAS");    
        rb1.setBounds(550,150,100,30);      
        rb2=new JRadioButton("SLABS");    
        rb2.setBounds(650,150,100,30);    
        ButtonGroup bg1=new ButtonGroup();    
        bg1.add(rb1);bg1.add(rb2);  
        rb3=new JRadioButton("HOSTELLER");    
        rb3.setBounds(550,200,100,30);      
        rb4=new JRadioButton("DAY SCHOLAR");    
        rb4.setBounds(650,200,120,30);   
        ButtonGroup bg2=new ButtonGroup();    
        bg2.add(rb3);bg2.add(rb4); 
        String languages[]={"CSE","ECE","EEE","CIVIL","MECH","B.B.A","B.SC"};        
        final JComboBox<?> cb=new JComboBox<Object>(languages);    
        cb.setBounds(800, 200,90,20);  
        final JLabel label = new JLabel();          
        label.setBounds(600,430,500,30);  
        JButton b=new JButton("Show");  
        b.setBounds(1000,300,80,30);  
         DefaultListModel<String> li1 = new DefaultListModel<>();  
          li1.addElement("CSE(2,50,000)");  
          li1.addElement("ECE(2,50,000)");  
          li1.addElement("EEE(2,50,000)");  
          li1.addElement("MECH(2,50,000)"); 
          li1.addElement("CIVIL(2,50,000)");
          li1.addElement("BBA(2,50,000)");
          li1.addElement("B.SC(2,50,000)");
          
         JList<String> list1 = new JList<>(li1);  
          list1.setBounds(600,300, 125,125);  
          DefaultListModel<String> li2 = new DefaultListModel<>();  
          li2.addElement("2 SHARE(1,50,000)");  
          li2.addElement("3 SHARE(1,40,000)");  
          li2.addElement("5 SHARE(1,20,000)");  
          li2.addElement("8 SHARE(1,10,000)"); 
          li2.addElement("bus(40,000)"); 
         
        JList<String> list2 = new JList<>(li2);  
          list2.setBounds(800,300, 125,125); 
          JButton Receipt=new JButton("Generate Receipt");  
          Receipt.setBounds(600,490,150,30);  
          JButton b2=new JButton("Reset");  
          b2.setBounds(750,490,150,30);  
          JButton Print=new JButton("Print");  
          Print.setBounds(900,490,150,30);  
          
          area2=new JTextArea();
          area2.setBounds(600,540,450,240); 
         
          java.util.Date date=new java.util.Date();
		 java.sql.Date sqlDate=new java.sql.Date(date.getTime());
  
        
        add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);add(l8);add(l9);
        add(l10);add(l11);add(l12);add(l13);
        add(tf1);add(tf2);add(dateChooser);add(tf4);add(tf5);add(tf6);add(tf7);
        add(area2);add(l15);add(rb1);add(rb2);add(rb3);add(rb4);add(rb5);
        add(rb6);add(cb); add(cb1); add(cb2);add(list1); add(list2);add(b);add(label); 
        add(Receipt);add(b2);add(Print);add(tf11);add(l16);add(tf12);add(l17);add(tf13);
       
           
         b.addActionListener(new ActionListener() {  
        	 public void actionPerformed(ActionEvent e) {   
            String data = "";  
            if (list1.getSelectedIndex() != -1) {                       
                    data = "You had selected the Group:" + list1.getSelectedValue();   
                    label.setText(data);  
                 }  
            if(list2.getSelectedIndex() != -1){  
              data += " and Hostel with facility of: ";  
              for(Object frame :list2.getSelectedValuesList()){  
                       data += frame + " ";  
                 }  
              }  
            label.setText(data);  
          }  
        });  
     
    
         b2.addActionListener(new ActionListener() {  
          public void actionPerformed(ActionEvent e) {   
           area2.setText("");
           area1.setText(" ");
           tf11.setText("");
           tf1.setText("");
           tf2.setText("");
           tf3.setText("");
           tf4.setText("");
           tf5.setText("");
           tf6.setText(" ");
           tf7.setText(" ");
           tf8.setText(" ");
         }
        });
         
         Print.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
                try
                {
                 area2.print();
                }
               catch(java.awt.print.PrinterException  a)
               {
                  System.err.format("NoPrinter Found",a.getMessage());
            
                 }
          }
       });    
        
    
          Receipt.addActionListener(new ActionListener() {  
         public void actionPerformed(ActionEvent e) {   
           
           area2.setText("----------------------------------------Registration Form---------------------------------------------------------------------------\n");
           area2.setText(area2.getText()+"Student Name:- "+tf1.getText()+"\n");
           area2.setText(area2.getText()+"Father's Name:- "+tf2.getText()+"\n");
           area2.setText(area2.getText()+"Student Id:- "+tf11.getText()+"\n");
           area2.setText(area2.getText()+"Email ID: "+tf4.getText()+"\n");
           area2.setText(area2.getText()+"Contact Number:- "+tf5.getText()+"\n");
           area2.setText(area2.getText()+"Wants to take:- "+cb.getSelectedItem().toString()+"\n");
     
           if(rb1.isSelected()){    
           area2.setText(area2.getText()+"Wants to Join in School of Engineering and Applied Sciences\n");
           }
           if(rb2.isSelected()){    
           area2.setText(area2.getText()+"Wants to Join in School of Liberal Arts and Sciences\n");
           }
           if(rb3.isSelected()){    
             area2.setText(area2.getText()+"Wants to be a Hosteller \n");
             } 
           if(rb4.isSelected()){    
            area2.setText(area2.getText()+"Wants to be a Day Scholar \n");
            }
           area2.setText(area2.getText()+"Had choosen: "+list1.getSelectedValue().toString()+"\n");
           area2.setText(area2.getText()+"Had choosen: "+list2.getSelectedValue().toString()+"\n");
           
           
          int index2=list2.getSelectedIndex();
           if(index2==0){
               area2.setText(area2.getText()+"                    Total amount to be paid is 4 Lakhs   \n");}
           if(index2==1){
               area2.setText(area2.getText()+"                    Total amount to be paid is 3.9 Lakhs   \n");}
           if(index2==2){
               area2.setText(area2.getText()+"                    Total amount to be paid is 3.8 Lakhs   \n");}
           if(index2==3){
                area2.setText(area2.getText()+"                    Total amount to be paid is 3.7 Lakhs   \n");}
           if(index2==4){
               area2.setText(area2.getText()+"                    Total amount to be paid is 2.9 Lakhs   \n");
            }
            
           if (e.getSource()==Receipt)
           {
               try{
                  FileWriter fw=new FileWriter("java.txt",true);
                  fw.write(area2.getText());
                  fw.close();
               }
                catch(Exception ae)
               {
                 System.out.println(ae);
               }
           } 
           JOptionPane.showMessageDialog(area2,"DATA SAVED SUCESSFULLY");
          try 
           {
           Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb","root","Dhoni@123");
           System.out.println("Successfully Connected");
           String query="Insert into Details(PersonId,Date_of_join,Name,Fathers_Name,D_O_B,Email_id,Contact_No,Location,Nationality,Gender,12th_percentage,Marks_10,Course,Branch,accomdation,fees)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";            
           PreparedStatement ps=conn.prepareStatement(query);
           ps.setString(1,tf11.getText());
           ps.setDate(2,sqlDate);
           ps.setString(3,tf1.getText());
           ps.setString(4,tf2.getText());
           SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
           String date=sdf.format(dateChooser.getDate());
           ps.setString(5,date);//Nationality
           ps.setString(6,tf4.getText());
           ps.setString(7,tf5.getText());
           ps.setString(8,tf12.getText());//location
           ps.setString(9,tf13.getText());
           if(rb5.isSelected())
            {
               gender="Male";
            }
           if(rb6.isSelected())
            {
                gender="Female";
            }
          ps.setString(10,gender);
          ps.setString(11,tf6.getText());
          ps.setString(12,tf7.getText());
           if(rb1.isSelected())
            {
               Groups="Seas";
            }
           if(rb2.isSelected())
            {
                Groups="Slabs";
            }
           ps.setString(13,Groups);
           ps.setString(14,cb.getSelectedItem().toString());
           if(rb3.isSelected())
           {
              Stay="Hostller";
           }
          if(rb4.isSelected())
           {
               Stay="Day Scholor";
           }
          ps.setString(15,Stay);
          int index=list2.getSelectedIndex();
           if(index==0)
            {
              Fee=("400000");
            }
           if(index==1)
           {
              Fee=("390000");
           }
           if(index==2){
                Fee=("370000");
            }
           if(index==3){
                Fee=("360000");
            }
           if(index==4){
                Fee=("290000");
            }
           ps.setString(16,Fee);
           ps.executeUpdate();
           conn.close();
           System.out.println("Sucessfully Updated");
          }
          catch(SQLException ex){
             System.out.println("Error is present");
             ex.printStackTrace();
          } 
          try 
          {
          Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb","root","Dhoni@123");
          System.out.println("Successfully Connected");
          int index=list2.getSelectedIndex();
          if(index==0)
           {
                count=count-1;
           }
          
          if(index==1)
          {
        	  count=count-1;
          }
          if(index==2){
        	  count=count-1;
           }
          if(index==3){
        	  count=count-1;
           }
          String query="update Hostel_Facilities SET count='"+count+"' where id="+index+1+"";
          PreparedStatement ps=conn.prepareStatement(query);
          ps.executeUpdate();
          conn.close();
          System.out.println("Sucessfully Updated");
         }
         catch(SQLException ex){
            System.out.println("Error is present");
            ex.printStackTrace();
         } 
         };
     });
          addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent we) {
           System.exit(0);
           }
       });
       
        setSize(950,826);  
        setLayout(null);  
        setVisible(true); 
        setBackground(Color.CYAN);
   }
   public static void main(String[] args) 
    {  
        new fee();
    }
}