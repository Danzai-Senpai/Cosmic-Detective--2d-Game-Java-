package com.pFiction.entity;

import com.pFiction.controller.Controller;
import com.pFiction.core.Movement;

public abstract class MovingEntity extends GameObject {
	
	private Controller controller;
	private Movement movement;
	
	public MovingEntity(Controller controller) {
		
		super();
		this.controller = controller;
		this.movement = new Movement(2);
		
	}
	
	public void update() {
		
		movement.update(controller);
		position.apply(movement);
		
	}

}
