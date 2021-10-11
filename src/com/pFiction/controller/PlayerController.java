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
		return input.isPressed(KeyEvent.VK_LEFT);
	}

	@Override
	public boolean isRequestingRight() {
		return input.isPressed(KeyEvent.VK_RIGHT);
	}

	@Override
	public boolean isRequestingUp() {
		return input.isPressed(KeyEvent.VK_UP);
	}

	@Override
	public boolean isRequestingDown() {
		return input.isPressed(KeyEvent.VK_DOWN);
	}

	@Override
	public boolean isRequestingW() {
		return input.isPressed(KeyEvent.VK_W);
	}

	@Override
	public boolean isRequestingA() {
		return input.isPressed(KeyEvent.VK_A);
	}

	@Override
	public boolean isRequestingS() {
		return input.isPressed(KeyEvent.VK_S);	
		}

	@Override
	public boolean isRequestingD() {
		return input.isPressed(KeyEvent.VK_D);
		}

}
