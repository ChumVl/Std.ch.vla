package com.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.calcEngine.CalcEngine;

public class Calculator {
	JFrame frame;
	JPanel panel;
	JPanel gpane;
	BorderLayout b;
	GridBagLayout g;
	
	GridBagConstraints c;
	
	JTextField textfield;
	
	JButton clear;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton b0;
	JButton minus;
	JButton plus;
	JButton umnog;
	JButton delit;
	JButton result;
	
	public Calculator(){
		
		
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculator");
		frame.setResizable(false);
		
		
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(374,390));
		panel.setFocusable(true);
		panel.setLayout(new BorderLayout());  
		panel.setVisible(true);
		
		gpane = new JPanel();
		gpane.setVisible(true);
		gpane.setLayout(new GridBagLayout());
		
		
		
		
		
		c = new GridBagConstraints();
		textfield =new JTextField(20);
		textfield.setFont(new Font("Serif", Font.BOLD, 30));
		
		
		
		
		CalcEngine calcEng = new CalcEngine(this);
		
		
		textfield.addActionListener(calcEng);
		
		
		
		panel.add(textfield,BorderLayout.PAGE_START);
		
		panel.add(gpane,BorderLayout.CENTER);
		
		
		boolean shouldWeightX = false;
		if (shouldWeightX) {
            c.weightx = 0.5;
		}
		
		
		
		
		
		JButton b1 = new JButton("1");
		b1.setFont(new Font("Serif", Font.BOLD, 30));
		b1.addActionListener(calcEng);
		c.gridx = 0;
		c.gridy =1;
		c.ipadx=40;
		c.ipady=40;
		gpane.add(b1,c);
		
		JButton b2= new JButton("2");
		b2.setFont(new Font("Serif", Font.BOLD, 30));
		b2.addActionListener(calcEng);
		c.gridx = 1;
		c.gridy =1;
		c.insets = new Insets(0,0,0,0);
		gpane.add(b2,c);
		
		JButton b3= new JButton("3");
		b3.setFont(new Font("Serif", Font.BOLD, 30));
		b3.addActionListener(calcEng);
		c.gridx = 2;
		c.gridy =1;
		c.insets = new Insets(0,0,0,10);
		
		gpane.add(b3,c);
		
		JButton b4= new JButton("4");
		b4.setFont(new Font("Serif", Font.BOLD, 30));
		b4.addActionListener(calcEng);
		c.gridx = 0;
		c.gridy =2;
		c.insets = new Insets(0,0,0,0);
		gpane.add(b4,c);
		
		JButton b5= new JButton("5");
		b5.setFont(new Font("Serif", Font.BOLD, 30));
		b5.addActionListener(calcEng);
		c.gridx = 1;
		c.gridy =2;
		c.insets = new Insets(0,0,0,0);
		gpane.add(b5,c);
		
		JButton b6= new JButton("6");
		b6.setFont(new Font("Serif", Font.BOLD, 30));
		b6.addActionListener(calcEng);
		c.gridx = 	2;
		c.gridy =2;
		c.insets = new Insets(0,0,0,10);
		gpane.add(b6,c);
		
		JButton b7= new JButton("7");
		b7.setFont(new Font("Serif", Font.BOLD, 30));
		b7.addActionListener(calcEng);
		c.gridx = 0;
		c.gridy =3;
		c.insets = new Insets(0,0,0,0);
		gpane.add(b7,c);
		
		JButton b8= new JButton("8");
		b8.setFont(new Font("Serif", Font.BOLD, 30));
		b8.addActionListener(calcEng);
		c.gridx = 1;
		c.gridy =3;
		c.insets = new Insets(0,0,0,0);
		gpane.add(b8,c);
		
		JButton b9= new JButton("9");
		b9.setFont(new Font("Serif", Font.BOLD, 30));
		b9.addActionListener(calcEng);
		c.gridx =2;
		c.gridy =3;
		c.insets = new Insets(0,0,0,10);
		gpane.add(b9,c);
		
		JButton b0= new JButton("0");
		b0.setFont(new Font("Serif", Font.BOLD, 30));
		b0.addActionListener(calcEng);
		c.gridx = 0;
		c.gridy =4;
		c.insets = new Insets(0,0,0,0);
		gpane.add(b0,c);
		
		JButton result= new JButton("=");
		result.setFont(new Font("Serif", Font.BOLD, 30));
		result.addActionListener(calcEng);
		c.gridx = 1;
		c.gridy =4;
		
		
		c.insets = new Insets(0,0,0,0);
		gpane.add(result,c);
		
		JButton clear = new JButton("c");
		clear.setFont(new Font("Serif", Font.BOLD, 30));
		clear.addActionListener(calcEng);
		c.gridx = 2;
		c.gridy =4;
		c.insets = new Insets(0,0,0,10);
		gpane.add(clear,c);
		
		JButton minus= new JButton("-");
		minus.setFont(new Font("Serif", Font.BOLD, 30));
		minus.addActionListener(calcEng);
		c.gridx = 3;
		c.gridy =1;
		c.gridwidth=2;
		c.ipadx=48;
		c.ipady=40;
		c.insets = new Insets(0,0,0,0);
		gpane.add(minus,c);
		
		JButton plus= new JButton("+");
		plus.setFont(new Font("Serif", Font.BOLD, 30));
		plus.addActionListener(calcEng);
		c.gridx = 3;
		c.gridy =2;
		c.gridwidth=2;
		c.ipadx=40;
		c.ipady=40;
		c.insets = new Insets(0,0,0,0);
		gpane.add(plus,c);
		
		JButton umnog= new JButton("*");
		umnog.setFont(new Font("Serif", Font.BOLD, 30));
		umnog.addActionListener(calcEng);
		c.gridx = 3;
		c.gridy =3;
		c.gridwidth=2;
		c.ipadx=40;
		c.ipady=40;
		c.insets = new Insets(0,0,0,0);
		gpane.add(umnog,c);
		
		JButton delit= new JButton("/");
		delit.setFont(new Font("Serif", Font.BOLD, 30));
		delit.addActionListener(calcEng);
		c.gridx = 3;
		c.gridy =4;
		c.gridwidth=2;
		c.ipadx=48;
		c.ipady=40;
		c.insets = new Insets(0,0,0,0);
		gpane.add(delit,c);


		frame.add(panel);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	
		
	}
	public void SetTextField(String string){
	
	textfield.setText(string);
		
	}
	
	public String GetTextField(){
		return textfield.getText();
	}
	
	public static void main(String[] args){
		
		new Calculator();
	}
}
