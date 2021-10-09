package com.pFiction.entity;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

import com.pFiction.controller.Controller;
import com.pFiction.core.Position;

public class Player extends MovingEntity {
	
	
	public Player(Controller controller) {
		super(controller);
	}

	@Override
	public void update() {
		super.update();
		
	}

	@Override
	public Image getSprite() {
		BufferedImage image = new BufferedImage(size.getWidth(), size.getHeight(), BufferedImage.TYPE_INT_RGB);
		Graphics2D graphics2d = image.createGraphics();
		
		graphics2d.setColor(Color.blue);
		graphics2d.fillRect(0, 0, size.getWidth(), size.getHeight());
		return image;
	}

}
