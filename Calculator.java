package Practice_ExtraWork;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.JTextComponent;

public class Calculator implements ActionListener
{
	JFrame f;
	private JTextComponent tf1;
	Calculator()
	{
		f = new JFrame();
		
		JFrame f= new JFrame();  
        
        JTextField tf1 = new JTextField();  
        tf1.setBounds(50,50,150,20);  
        
        JTextField tf2 = new JTextField();  
        tf2.setBounds(50,100,150,20); 
        
        JTextField tf3 = new JTextField();  
        tf3.setBounds(50,150,150,20);  
        tf3.setEditable(false);
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b10 = new JButton("-");
		JButton b11 = new JButton("0");
		JButton b12 = new JButton("+");
		JButton b13 = new JButton("*");
		JButton b14 = new JButton("/");
		JButton b15 = new JButton("=");
		
		b1.addActionListener((ActionListener) this);  
        b2.addActionListener((ActionListener) this); 
		
		f.add(tf1);
	    f.add(tf2);
	    f.add(tf3);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		f.add(b11);
		f.add(b12);
		f.add(b13);
		f.add(b14);
		f.add(b15);
		
		f.setLayout(new GridLayout(6,3));
		
		f.setSize(300,300);
		f.setVisible(true);
		
	}
	
	 public void actionPerformed(ActionEvent e) 
	    {  
	        String s1=tf1.getText();  
			JTextComponent tf2;
			String s2=tf2.getText();  
	        int a=Integer.parseInt(s1);  
	        int b=Integer.parseInt(s2);  
	        int c=0;  
	        Object b1;
			Object b2;
			if(e.getSource()==b1)
	        {  
	            c=a+b;  
	        }
	        else if(e.getSource()==b2)
	        {  
	            c=a-b;  
	        }  
	        String result=String.valueOf(c);  
			tf3.setText(result); 
	        
	    }  

	public static void main(String[] args) 
	{
		new Calculator();
		
	}

}
