package com.myGame.gameElements;

import java.awt.Color;
import java.awt.Graphics;

public class Apple {
	
	private int x,y,width,height;
	
	
	
	public Apple(int x,int y, int width, int height){
		this.x=x;
		this.y=y;
		this.height=height;
		this.width=width;
	}
	
	public void paint(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(x*width, y*height, width, height);
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
