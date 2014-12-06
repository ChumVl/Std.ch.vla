package com.myGame;

import java.awt.GridLayout;

import javax.swing.JFrame;



import com.myGame.view.GamePanel;


public class Window extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Window(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("myFirstGame");
		setResizable(false);
		
		Init();
	}
	
	public void Init(){
		setLayout(new GridLayout(1,1,0,0));
		GamePanel pane = new GamePanel();
		add(pane);
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}

public static void main(String[] args) {
		
		new Window();
			
	}

}
