package com.wildcatrobotics.dashboard.objects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class UIColorChanger extends BasicUIObject{

	public UIColorChanger(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D canvas = (Graphics2D)g;
		canvas.setColor(Color.RED);
		super.paintComponent(g);
		
		if(value==1) canvas.setColor(Color.GREEN);
			
		canvas.fillRect(1,1,w-1,h-1);
		canvas.setColor(Color.BLACK);
		canvas.drawRect(0, 0, w,h);

	}
}
