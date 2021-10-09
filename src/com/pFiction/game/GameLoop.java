package com.pFiction.game;

public class GameLoop implements Runnable {
	
	private Game game;
	
	private boolean isRunning;
	//Taxa de Renderiza��o
	public final double updateRate = 1.0d/60.0d; // O d ap�s um numero voc� especifica ao java que o numero � double e com f que � float.
	
	public GameLoop(Game game) {
		this.game = game; // Executando Game
	}

	@Override
	public void run() {
		
		// Valida que o isRunning � declarado como true
		isRunning = true;
		// Declara um acumulador
		double acumullator = 0;
		//Declara variaveis
		long currentTime, lastUpdate = System.currentTimeMillis();
		
		//La�o para o jogo prosseguir rodando caso siga a condi��o
		while(isRunning) {
			// Aponta valor de variavel
			currentTime = System.currentTimeMillis();
			// Determina a quantidade de renderiza��es feita no ultimos segundos
			double lastRenderTimeInSeconds = (currentTime - lastUpdate) / 1000d;
			// Atualiza o acumulador com o valor de lastRenderTimeInSeconds
			acumullator += lastRenderTimeInSeconds;
			//Apont valor para a ultima atualiza��o
			lastUpdate = currentTime;
			
			// La�o para fazer a atualiza��o e zerar o acumulador 
			while (acumullator > updateRate) {
				update();
				acumullator = updateRate;
			}
			
			//Quando sair do la�o de atualiza��o ocorre a renderiza��o
			render();
			
		}
		
	}
	
	private void update() {
		
		// Atualiza��o do jogo
		game.update();
		
	}

	private void render() {
		
		//Renderiza��o do Jogo
		game.render();
		
	}

}
