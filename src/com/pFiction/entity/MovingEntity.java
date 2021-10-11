package com.pFiction.entity;

import com.pFiction.controller.Controller;
import com.pFiction.core.Movement;
import com.pFiction.gfx.AnimationManager;
import com.pFiction.gfx.SpriteLibrary;

import java.awt.*;

public abstract class MovingEntity extends GameObject {
	
	private Controller controller;
	private Movement movement;
	private AnimationManager animationManager;
	
	public MovingEntity(Controller controller, SpriteLibrary spriteLibrary) {
		
		super();
		this.controller = controller;
		this.movement = new Movement(2);
		animationManager = new AnimationManager(spriteLibrary.getUnit("henry"));
		
	}
	
	public void update() {
		
		movement.update(controller);
		position.apply(movement);
		animationManager.update();
		
	}

	@Override
	public Image getSprite() {
		return animationManager.getSprite();
	}

}
