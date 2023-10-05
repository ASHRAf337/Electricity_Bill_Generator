import java.io.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
 
// Main class

class GFGtrail extends JFrame implements ActionListener {
 
	JFrame jf1;

	JButton b1;
	JButton b2;
	JButton b3;

	JRadioButton jr1;
	JRadioButton jr2;
	JRadioButton jr3;
	ButtonGroup bg;

	JTextField date_tf1;
	JTextField date_tf2;
	
	JComboBox cb;

	JTextField t1;
	JTextField t2;
	JTextField t3;
	JTextField t4;
	JTextField t5;
	JTextField t6;
	JTextField t7;
	JTextField t8;
	JTextField t9;
	JTextField t10;
	JTextField t11;
	JTextField t12;
	JTextField t13;
	JTextField t14;

	JLabel lm;
	GFGtrail()
	{
	JLabel lH=new JLabel("ELECTRIC BILL");
	lH.setBounds(100,0,500,50);
	lH.setFont(new Font("Monospace",Font.BOLD,30));
	Color cH=new Color(0,0,128);
	lH.setForeground(cH);
	add(lH);
	
	//label of action
	lm=new JLabel();
	lm.setBounds(150,620,200,80);
	add(lm);

	//Radio buttons
	jr1=new JRadioButton("MESCOM-Mangaluru electicity supply CO.Ltd");
	jr2=new JRadioButton("BESCOM-Bengaluru electicity supply CO.Ltd");
	jr3=new JRadioButton("HESCOM-Hubli electicity supply CO.Ltd");
	bg=new ButtonGroup();
	bg.add(jr1); bg.add(jr2); bg.add(jr3);
	jr1.setBounds(160,50,300,20);
	jr2.setBounds(160,70,300,20);
	jr3.setBounds(160,90,300,20);
	add(jr1);
	add(jr2);
	add(jr3);

	//label for date
	JLabel date=new JLabel("DATE");
	date.setBounds(20,120,150,30);
	date.setForeground(Color.blue);
	add(date);

	//TextField for date
	date_tf1=new JTextField();
	date_tf2=new JTextField();
	date_tf1.setBounds(180,120,30,21);
	date_tf2.setBounds(213,120,30,21);
	add(date_tf1);
	add(date_tf2);
	
	//choice for date
	String year[]={"2017","2018","2019","2020","2021","2022","2023"};
	cb=new JComboBox(year);
	cb.setBounds(245,120,55,20);
	add(cb);
		


	//labels creation
	JLabel l0=new JLabel("ELECTRICITY BOARD");
	l0.setBounds(20,60,150,30);
	l0.setForeground(Color.blue);
	add(l0); 

	JLabel l1= new JLabel("SUBDIVISON");
	l1.setBounds(20,150,150,30);
	l1.setForeground(Color.blue);
	add(l1); 
	
	JLabel l2= new JLabel("LOCATION CODE");
	l2.setBounds(20,180,150,30);
	l2.setForeground(Color.blue);
	add(l2); 
	
	JLabel l3= new JLabel("CONSUMER ID");
	l3.setBounds(20,210,150,30);
	l3.setForeground(Color.blue);
	add(l3); 
	
	JLabel l4= new JLabel("RR NO");
	l4.setBounds(20,240,150,30);
	l4.setForeground(Color.blue);
	add(l4); 

	JLabel l5= new JLabel("NAME");
	l5.setBounds(20,270,150,30);
	l5.setForeground(Color.blue);
	add(l5); 

	JLabel l6= new JLabel("ADDRESS");
	l6.setBounds(20,300,150,30);
	l6.setForeground(Color.blue);
	add(l6); 

	JLabel l7= new JLabel("BILLING DATE");
	l7.setBounds(20,330,150,30);
	l7.setForeground(Color.blue);
	add(l7); 

	JLabel l8= new JLabel("BILL NO");
	l8.setBounds(20,360,150,30);
	l8.setForeground(Color.blue);
	add(l8); 

	JLabel l9= new JLabel("ENERGY CHARGES");
	l9.setBounds(20,390,150,30);
	l9.setForeground(Color.blue);
	add(l9); 

	JLabel l10= new JLabel("TAX ON AMOUNT");
	l10.setBounds(20,420,150,30);
	l10.setForeground(Color.blue);
	add(l10); 

	JLabel l11= new JLabel("PENALTY");
	l11.setBounds(20,450,150,30);
	l11.setForeground(Color.blue);
	add(l11); 

	JLabel l12= new JLabel("BILL AMOUNT");
	l12.setBounds(20,480,150,30);
	l12.setForeground(Color.blue);
	add(l12); 

	JLabel l13= new JLabel("INETEREST");
	l13.setBounds(20,510,150,30);
	l13.setForeground(Color.blue);
	add(l13); 
	
	JLabel l14= new JLabel("NET AMOUNT DUE");
	l14.setBounds(20,540,150,30);
	l14.setForeground(Color.blue);
	add(l14); 
	
//Textfields created

	t1= new JTextField();
	t1.setBounds(180,150,120,20);
	add(t1); 
	
	t2= new JTextField();
	t2.setBounds(180,180,120,20);
	add(t2); 

	t3= new JTextField();
	t3.setBounds(180,210,120,20);
	add(t3); 

	t4= new JTextField();
	t4.setBounds(180,240,120,20);
	add(t4); 
	
	t5= new JTextField();
	t5.setBounds(180,270,120,20);
	add(t5); 

	t6= new JTextField();
	t6.setBounds(180,300,120,20);
	add(t6); 
 	
	t7= new JTextField();
	t7.setBounds(180,330,120,20);
	add(t7); 

	t8= new JTextField();
	t8.setBounds(180,360,120,20);
	add(t8); 
	
	t9= new JTextField();
	t9.setBounds(180,390,120,20);
	add(t9); 

	t10= new JTextField();
	t10.setBounds(180,420,120,20);
	add(t10); 	
	
	t11= new JTextField();
	t11.setBounds(180,450,120,20);
	add(t11); 

	t12= new JTextField();
	t12.setBounds(180,480,120,20);
	add(t12); 
	
	t13= new JTextField();
	t13.setBounds(180,510,120,20);
	add(t13); 

	t14= new JTextField();
	t14.setBounds(180,540,120,20);
	add(t14); 		
	
 	
//created buttons
	ImageIcon ib1=new ImageIcon("submit.png");
	Image ib1_1=ib1.getImage();
	Image ib1_2=ib1_1.getScaledInstance(120,40,Image.SCALE_SMOOTH);
	ib1=new ImageIcon(ib1_2);	
		
	b1= new JButton("submit",ib1); 
	//b1.setBackground(Color.yellow);
	b1.setForeground(Color.blue);
	b1.setBounds(20,600,120,30);
	add(b1); 
	b1.addActionListener(this);
	
	ImageIcon ib2=new ImageIcon("cancel.png");
	Image ib2_1=ib2.getImage();
	Image ib2_2=ib2_1.getScaledInstance(120,40,Image.SCALE_SMOOTH);
	ib2=new ImageIcon(ib2_2);
        
 	 b2= new JButton("cancel",ib2);
	b2.setBounds(150,600,120,30);
	//b2.setBackground(Color.yellow);
	b2.setForeground(Color.blue);
	add(b2);
	b2.addActionListener(this);


	
	ImageIcon ib3=new ImageIcon("print.png");
	Image ib3_1=ib3.getImage();
	Image ib3_2=ib3_1.getScaledInstance(120,40,Image.SCALE_SMOOTH);
	ib3=new ImageIcon(ib3_2);

	 b3= new JButton("print",ib3);
	b3.setBounds(300,600,120,30);
	//b3.setBackground(Color.yellow);
	b3.setForeground(Color.blue);
	add(b3);
	b3.addActionListener(this);




	
    }
	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		if(str.equals("submit"))
		{
			lm.setText("submitted succesfully");
			lm.setForeground(Color.green);

		}
		else
		if(str.equals("cancel"))
		{
			lm.setText("cancelled");
			lm.setForeground(Color.red);
		}
		else
		{
			lm.setText("Recipt is printing");
			lm.setForeground(Color.blue);
			jf1=new JFrame("Printed");
			jf1.setLayout(null);
			jf1.setVisible(true);
			jf1.setSize(500,700);
			jf1.setLocationRelativeTo(null);
	
			JLabel radioprint=new JLabel();
			radioprint.setBounds(20,10,500,30);
			jf1.add(radioprint);

			JLabel lprint0=new JLabel();
			lprint0.setBounds(20,30,250,30);
			jf1.add(lprint0);


						
			JLabel lprint1=new JLabel();
			lprint1.setBounds(20,50,150,30);
			jf1.add(lprint1);

			JLabel lprint2=new JLabel();
			lprint2.setBounds(20,70,150,30);
			jf1.add(lprint2);
			
			JLabel lprint3=new JLabel();
			lprint3.setBounds(20,90,150,30);
			jf1.add(lprint3);

			JLabel lprint4=new JLabel();
			lprint4.setBounds(20,110,150,30);
			jf1.add(lprint4);

			JLabel lprint5=new JLabel();
			lprint5.setBounds(20,130,150,30);
			jf1.add(lprint5);

			JLabel lprint6=new JLabel();
			lprint6.setBounds(20,150,150,30);
			jf1.add(lprint6);

			JLabel lprint7=new JLabel();
			lprint7.setBounds(20,170,150,30);
			jf1.add(lprint7);

			JLabel lprint8=new JLabel();
			lprint8.setBounds(20,190,150,30);
			jf1.add(lprint8);

			JLabel lprint9=new JLabel();
			lprint9.setBounds(20,210,150,30);
			jf1.add(lprint9);

			JLabel lprint10=new JLabel();
			lprint10.setBounds(20,230,150,30);
			jf1.add(lprint10);

			JLabel lprint11=new JLabel();
			lprint11.setBounds(20,250,150,30);
			jf1.add(lprint11);

			JLabel lprint12=new JLabel();
			lprint12.setBounds(20,270,150,30);
			jf1.add(lprint12);

			JLabel lprint13=new JLabel();
			lprint13.setBounds(20,290,150,30);
			jf1.add(lprint13);

			JLabel lprint14=new JLabel();
			lprint14.setBounds(20,310,150,30);
			jf1.add(lprint14);

			if(jr1.isSelected())
			{
				radioprint.setText("ELECTRICITY BOARD :"+jr1.getText());
			}
			else 
			if(jr2.isSelected())
			{
				radioprint.setText("ELECTRICITY BOARD :"+jr2.getText());
			}
			else 
			if(jr3.isSelected())
			{
				radioprint.setText("ELECTRICITY BOARD :"+jr3.getText());
			} 
		
			lprint0.setText("DATE            :  "+date_tf1.getText()+" - "+date_tf2.getText()+" - "+cb.getItemAt(cb.getSelectedIndex()));
						
			lprint1.setText("SUBDIVISION     : "+t1.getText());
			lprint2.setText("LOCATION CODE   : "+t2.getText());
			lprint3.setText("CONSUMER ID     : "+t3.getText());
			lprint4.setText("RR NO           : "+t4.getText());
			lprint5.setText("NAME            : "+t5.getText());
			lprint6.setText("ADDRESS         : "+t6.getText());
			lprint7.setText("BILLING DATE    : "+t7.getText());
			lprint8.setText("BILL NO         : "+t8.getText());
			lprint9.setText("ENERGY CHARGES  : "+t9.getText());
			lprint10.setText("TAX ON AMOUNT  : "+t10.getText());
			lprint11.setText("PENATLY        : "+t11.getText());
			lprint12.setText("BILL AMOUNT    : "+t12.getText());
			lprint13.setText("INETEREST      : "+t13.getText());
			lprint14.setText("NET AMOUNT DUe : "+t14.getText());			
			
		
		
		}
		
	}
}
class Trail
	{
	public static void main(String args[])
	{

		GFGtrail f=new GFGtrail();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	f.setSize(500,750); // 400 width and 500 height

		f.setLayout(null); // using no layout managers

       		f.setVisible(true); // making the frame visible

	}
}