package com.pFiction.core;

import com.pFiction.controller.Controller;

public class Movement {
	
	private Vector2D vector;
	private double speed;
	
	public Movement(double speed) {
		this.speed = speed;
		this.vector = new Vector2D(0,0);
	}
	
	public void update(Controller controller) {
		
		int deltaX = 0;
		int deltaY = 0;
		
		if(controller.isRequestingUp() || controller.isRequestingW()) {
			deltaY--;
		}
		
		if(controller.isRequestingDown() || controller.isRequestingS()) {
			deltaY++;
		}
		
		if(controller.isRequestingRight() || controller.isRequestingD()) {
			deltaX++;
		}
		
		if(controller.isRequestingLeft() || controller.isRequestingA()) {
			deltaX--;
		}
		
		vector = new Vector2D(deltaX, deltaY);
		vector.normalize();
		vector.multiply(speed);
		
	}

	public Vector2D getVector() {
		return vector;
	}

}
