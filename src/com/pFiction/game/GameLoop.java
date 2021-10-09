package com.pFiction.game;

public class GameLoop implements Runnable {
	
	private Game game;
	
	private boolean isRunning;
	//Taxa de Renderização
	public final double updateRate = 1.0d/60.0d; // O d após um numero você especifica ao java que o numero é double e com f que é float.
	
	public GameLoop(Game game) {
		this.game = game; // Executando Game
	}

	@Override
	public void run() {
		
		// Valida que o isRunning é declarado como true
		isRunning = true;
		// Declara um acumulador
		double acumullator = 0;
		//Declara variaveis
		long currentTime, lastUpdate = System.currentTimeMillis();
		
		//Laço para o jogo prosseguir rodando caso siga a condição
		while(isRunning) {
			// Aponta valor de variavel
			currentTime = System.currentTimeMillis();
			// Determina a quantidade de renderizações feita no ultimos segundos
			double lastRenderTimeInSeconds = (currentTime - lastUpdate) / 1000d;
			// Atualiza o acumulador com o valor de lastRenderTimeInSeconds
			acumullator += lastRenderTimeInSeconds;
			//Apont valor para a ultima atualização
			lastUpdate = currentTime;
			
			// Laço para fazer a atualização e zerar o acumulador 
			while (acumullator > updateRate) {
				update();
				acumullator = updateRate;
			}
			
			//Quando sair do laço de atualização ocorre a renderização
			render();
			
		}
		
	}
	
	private void update() {
		
		// Atualização do jogo
		game.update();
		
	}

	private void render() {
		
		//Renderização do Jogo
		game.render();
		
	}

}
