package com.pFiction.entity;

import java.awt.*;

import com.pFiction.core.Position;
import com.pFiction.core.Size;

public abstract class GameObject {

	protected Position position;
	protected Size size;
	
	public GameObject() {
		position = new Position(50, 50);
		size = new Size(50, 50);
	}
	
	public abstract void update();
	public abstract Image getSprite();

	public Position getPosition() {
		return position;
	}

	public Size getSize() {
		return size;
	}
	
	

}
