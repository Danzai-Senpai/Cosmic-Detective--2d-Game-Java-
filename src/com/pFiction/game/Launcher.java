package com.pFiction.game;

public class Launcher {
	
	public static void main(String[] args) {
		
		// Chama Thread para iniciar loop configurando o display padrão da janela
		new Thread(new GameLoop(new Game(800, 600))).start();
		
	}

}
