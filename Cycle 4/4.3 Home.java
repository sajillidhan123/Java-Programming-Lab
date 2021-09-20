 import java.awt.*;
 import java.applet.*;
 import java.awt.event.*;

 public class Home extends Applet implements ActionListener
 {
Button b1,b2;
Label bcolor;
String str;
public void init()
        {
			
            Button b1 = new Button("Red");    
            Button b2= new Button("Blue");
             
            add(b1);                  
            add(b2);
			
            b1.addActionListener(this); 
            b2.addActionListener(this);
			
			
        }
        public void actionPerformed(ActionEvent ae)
        {
			
            str = ae.getActionCommand();
            repaint();      
        }
	 public void paint(Graphics g)
	 {
			
		 Font home=new Font("Century Gothic",Font.BOLD,28);
		 g.setFont(home);
		 g.setColor(Color.blue);
		 g.drawString("H O U S E",20,80);
		 int a[]={150,300,225};   
		 int b[]={150,150,25};
		 
		 
		 
		 g.setColor(Color.gray);
		 g.fillRect(150,150,150,200);
		 		 
		 if(str.equals("Red"))
		 {
		 g.setColor(Color.red);
		 g.fillRect(190,220,70,130);
		 }
		 
		  if(str.equals("Blue"))
		 {
		 g.setColor(Color.blue);
		 g.fillRect(190,220,70,130);
		 }
		 
		 g.setColor(Color.red);
		 g.fillPolygon(a,b,3);
		 
		 g.setColor(Color.yellow);
		 g.fillOval(200,75,50,50);
		 
		 Font f=new Font("Century Gothic",Font.BOLD,20);
		 g.setFont(f);
		 g.setColor(Color.red);
		 
		 g.setColor(Color.red);
		 g.fillRect(300,150,250,200);
		 
		  g.setColor(Color.black);
		 g.fillRect(390,210,80,80);
		 
		 g.setColor(Color.blue);
		 g.drawLine(430,210,430,290);
		 
		 g.setColor(Color.blue);
		 g.drawLine(470,250,390,250);
		 
		 g.setColor(Color.red);
		 g.drawLine(460,26,226,26);
		 
		 g.setColor(Color.red);
		 g.drawLine(460,25,550,150);
		 
		 
	 }
 }
