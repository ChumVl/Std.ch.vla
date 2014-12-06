package com.calcEngine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;




import com.view.Calculator;







public class CalcEngine  implements ActionListener{

Calculator c;
private int value1=0;
private int value2=0;	
private String operation = "+";
	public CalcEngine(Calculator c) {
		this.c = c;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton clickButton = (JButton) e.getSource();
		
		
		
		
		
		
		if (clickButton.getText().equals("+")){
			
			value1 = Integer.valueOf(c.GetTextField());
			c.SetTextField("");
			System.out.println(value1+"");
			operation = "+";
		}
		if (clickButton.getText().equals("-")){
			
			value1 = Integer.valueOf(c.GetTextField());
			c.SetTextField("");
			System.out.println(value1+"");
			operation = "-";
		}
		if (clickButton.getText().equals("*")){
	
			value1 = Integer.valueOf(c.GetTextField());
			c.SetTextField("");
			System.out.println(value1+"");
			operation = "*";
		}
		if (clickButton.getText().equals("/")){
	
			value1 = Integer.valueOf(c.GetTextField());
			c.SetTextField("");
			System.out.println(value1+"");
			operation = "/";
		}
		
		if (clickButton.getText().equals("=") ){
			if("+" == operation){
				value2 = Integer.valueOf(c.GetTextField());
				c.SetTextField((value1+value2)+"");
				}
			if("-" == operation){
				value2 = Integer.valueOf(c.GetTextField());
				c.SetTextField((value1-value2)+"");
				}
			if("*" == operation){
				value2 = Integer.valueOf(c.GetTextField());
				c.SetTextField((value1*value2)+"");
				}
			if("/" == operation){
				value2 = Integer.valueOf(c.GetTextField());
				c.SetTextField((value1/value2)+"");
				}
			operation="+";
		}
		
		if (clickButton.getText().equals("0") || 
			clickButton.getText().equals("1") ||	
			clickButton.getText().equals("2") ||
			clickButton.getText().equals("3") ||
			clickButton.getText().equals("4") ||
			clickButton.getText().equals("5") ||
			clickButton.getText().equals("6") ||
			clickButton.getText().equals("7") ||
			clickButton.getText().equals("8") ||
			clickButton.getText().equals("9") 
				)c.SetTextField(c.GetTextField()+clickButton.getText());
		if(clickButton.getText().equals("c")){c.SetTextField("");}
	}

}
