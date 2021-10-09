package com.pFiction.game;

public class Game {
	
	private Display display;
	
	public Game(int width, int height) {
		display = new Display(width, height);
	}
	
	public void update() {
		
	}
	
	public void render() {
		
		display.render(this); // Aponta que que a renderiazação de Game será exibida a partir do display
		
	}

}
