package com.myGame.gameElements;

import java.awt.Color;
import java.awt.Graphics;

public class SnakePart {
	
	private int x,y,width,height;

	public SnakePart(int x,int y,int width,int height){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(x*width, y*height, width, height);
		g.setColor(Color.YELLOW);
		g.fillRect(x*width+2, y*height+2, width-4, height-4);
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
