package com.myGame.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

import com.myGame.gameElements.Apple;
import com.myGame.gameElements.SnakePart;
import com.myGame.settingPanel.GameOver;


public class GamePanel extends JPanel implements Runnable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int WIDTH=500,HEIGHT=500;
	public Thread thread;
	private boolean running = false;
		
	
	public boolean right =true;
	public boolean left =false;
	public boolean up =false;
	public boolean down =false;
	
	private SnakePart s;
	private ArrayList <SnakePart> snake;
	
	private Apple apple;
	private ArrayList<Apple> apples;
	
	private Random r;
	private int x=WIDTH/40;
	private int y=HEIGHT/40;
	private int partsNum=4;
	private int tick =0;
	public int gameSpeed=600000;
	public Key key;
	
	public GamePanel(){
		
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		setFocusable(true);
		key = new Key();
		addKeyListener(key);
		snake = new ArrayList<SnakePart>();
		apples = new ArrayList<Apple>();
		
		r= new Random();
		
		Start();
		
	}

	
	public void switchTimer(){
		if (snake.size()==0){
			s = new SnakePart(x,y,20,20);
			snake.add(s);
		}
		if (apples.size()==0){
			int x = r.nextInt(WIDTH/20-1);
			int y = r.nextInt(HEIGHT/20-1);
			apple = new Apple(x,y,20,20);
			apples.add(apple);
		}
		for(int i=0; i<apples.size();i++){
			if(x==apples.get(i).getX() && y==apples.get(i).getY()){
				partsNum++;
				apples.remove(i);
				i--;
			}
		if(x > WIDTH/20-1 || x<0 || y > HEIGHT/20-1 || y < 0){	
			new GameOver();
			Stop();
		
			
		}
			
	}
			
		tick++;
		if(tick>gameSpeed){
			if(left) x--;
			if(right) x++;
			if(up)y--;
			if(down)y++;
			
			tick = 0;
			
			s = new SnakePart(x,y,20,20);
			snake.add(s);
			if(snake.size()>partsNum) snake.remove(0);
		}
		
		for (int i=0; i<snake.size();i++){
			if (x == snake.get(i).getX() && y == snake.get(i).getY()){
				if(i != snake.size() - 1) {
					new GameOver();
					Stop();
					
				}
			}
		}
		
				
			
	}
		
	
	
	
	public void paint(Graphics g){
		
		
		g.clearRect(0, 0, WIDTH, HEIGHT);
		g.setColor(Color.BLACK);
	
		for(int i=0;i<snake.size();i++){
			snake.get(i).paint(g);
		}
		for(int i=0; i<apples.size();i++){
			apples.get(i).paint(g);
		}
	}
	
	public void Start(){
		running = true;
		thread = new Thread(this, "Game");
		thread.start();
	}
	public void Stop(){
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
			
		}
	}
	public void run() {
		while(running){
			switchTimer();
			repaint();
		}
		
	}
	
	

	
	
	

	 private class Key implements KeyListener{

		
		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();
			
			if (key == KeyEvent.VK_RIGHT && !left){
				up = false;
				down = false;
				right = true;
				
			}
			
			if (key == KeyEvent.VK_LEFT && !right){
				up = false;
				down = false;
				
				left = true;
				}
			if (key == KeyEvent.VK_UP && !down){
				
				
				right = false;
				left = false;
				up = true;
				}
			if (key == KeyEvent.VK_DOWN && !up){
				
				
				right = false;
				left = false;
				down = true;
				}
		
			if (running ==true){
				if(key == KeyEvent.VK_ESCAPE || key == KeyEvent.VK_SPACE) {Stop();}	
				}
			else 
				if(key == KeyEvent.VK_ESCAPE || key == KeyEvent.VK_SPACE) Start();
				
		
					
					
			}



		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	 
	
		
}

