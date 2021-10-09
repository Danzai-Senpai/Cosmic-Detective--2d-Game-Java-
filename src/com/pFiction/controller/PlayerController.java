package com.pFiction.controller;

import java.awt.event.KeyEvent;

import com.pFiction.input.Input;

public class PlayerController implements Controller {
	
	private Input input;

	public PlayerController(Input input) {
		this.input = input;
	}

	@Override
	public boolean isRequestingLeft() {
		// TODO Auto-generated method stub
		return input.isPressed(KeyEvent.VK_LEFT);
	}

	@Override
	public boolean isRequestingRight() {
		// TODO Auto-generated method stub
		return input.isPressed(KeyEvent.VK_RIGHT);
	}

	@Override
	public boolean isRequestingUp() {
		// TODO Auto-generated method stub
		return input.isPressed(KeyEvent.VK_UP);
	}

	@Override
	public boolean isRequestingDown() {
		// TODO Auto-generated method stub
		return input.isPressed(KeyEvent.VK_DOWN);
	}

	@Override
	public boolean isRequestingW() {
		// TODO Auto-generated method stub
		return input.isPressed(KeyEvent.VK_W);
	}

	@Override
	public boolean isRequestingA() {
		// TODO Auto-generated method stub
		return input.isPressed(KeyEvent.VK_A);
	}

	@Override
	public boolean isRequestingS() {
		// TODO Auto-generated method stub
		return input.isPressed(KeyEvent.VK_S);	
		}

	@Override
	public boolean isRequestingD() {
		// TODO Auto-generated method stub
		return input.isPressed(KeyEvent.VK_D);
		}

}
