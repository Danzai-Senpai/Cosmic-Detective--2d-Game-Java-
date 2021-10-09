package com.pFiction.game;

import java.util.ArrayList;
import java.util.List;

import com.pFiction.controller.PlayerController;
import com.pFiction.display.Display;
import com.pFiction.entity.GameObject;
import com.pFiction.entity.Player;
import com.pFiction.input.Input;

public class Game {
	
	private Display display;
	private List<GameObject> gameObjects;
	private Input input;
	
	public Game(int width, int height) {
		input = new Input();
		display = new Display(width, height, input);
		gameObjects = new ArrayList<>();
		gameObjects.add(new Player(new PlayerController(input)));
		
	}
	
	
	public List<GameObject> getGameObjects() {
		return gameObjects;
	}
	
	
	public void update() {
		gameObjects.forEach(gameObjects -> gameObjects.update());
	}
	
	public void render() {
		
		display.render(this); // Aponta que que a renderiazação de Game será exibida a partir do display
		
	}
	
}
