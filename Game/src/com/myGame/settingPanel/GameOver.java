package com.myGame.settingPanel;


import java.awt.Dimension;



import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import com.myGame.Window;


public class GameOver {
	
	JFrame GameOver = new JFrame();
	JPanel panel = new JPanel();
	GridBagLayout g =new GridBagLayout();
	public Window win;
	
	
	
	public GameOver(){
		
		
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		JLabel gameOver = new JLabel("Game Over!!!");
	
		gameOver.setFont(new Font("Serif", Font.PLAIN, 30));
		boolean shouldFill = false;
		if (shouldFill) { 
            c.fill = GridBagConstraints.HORIZONTAL;
		}	
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 2;
		
		panel.add(gameOver, c);
		
		JButton yes = new JButton("Yes");
		yes.addActionListener(new goListener());
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 5;
		c.insets = new Insets(20,0,10,0);
		panel.add(yes, c);
		
		
		JButton no = new JButton("No");
		no.addActionListener(new goListener());
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 5;
		c.insets = new Insets(20,0,10,0);
		
		panel.add(no, c);
		
		JLabel tryAgain = new JLabel("                     Do you want to try again?");
		tryAgain.setHorizontalTextPosition(SwingConstants.CENTER);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 3;
		c.gridwidth=3;
		c.insets = new Insets(20,0,0,0);
		
		panel.add(tryAgain, c);
		
		
		
		GameOver.add(panel);
		GameOver.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		GameOver.setPreferredSize(new Dimension(300,180));
		GameOver.pack();
		GameOver.setLocationRelativeTo(null);
		GameOver.setVisible(true);
		
		
	}
	
	
	public class goListener implements ActionListener{

		public goListener(){
		
		}
		public void actionPerformed(ActionEvent a) {
			String action = a.getActionCommand();
			if (action.equals("Yes")){
				
				new Window();
				
			}
			if (action.equals("No")){
				
				System.exit(0);
			}
			
		}
		
	}
}





