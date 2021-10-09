package com.pFiction.display;

import java.awt.Graphics;

import com.pFiction.game.Game;

public class Renderer {

	public void render(Game game, Graphics graphics) {
		game.getGameObjects().forEach(gameObjects -> graphics.drawImage(
		gameObjects.getSprite(), 
		gameObjects.getPosition().intx(),
		gameObjects.getPosition().inty(),
		null));
	}
	
}
