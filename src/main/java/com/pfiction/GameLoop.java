package com.pfiction;

public class GameLoop implements Runnable { // Loop que o jogo continuará a percorrer para permanecer rodando

    private Game game;

    private boolean running; // Condicional para o loop
    private final double updateRate = 1.0d/60.0d; // Taxa de atualização

    public GameLoop(Game game) { // Contrutor de Game para apontar o que esta classe chamará e realizará
        this.game = game;
    }

    @Override
    public void run() {
        running = true; // Passou um valor para definir o loop
        double accumulator = 0; // Acumulador
        long currentTime, lastUpdate = System.currentTimeMillis(); // Definindo o valor de variaveis

        while (running) { // Cria laço com a condicional
            currentTime = System.currentTimeMillis(); // Definindo valor de variavel
            double lastRenderTimeInSeconds =(currentTime - lastUpdate) / 1000d; // Aponta a renderização das informações na tela
            accumulator += lastRenderTimeInSeconds; // Trás soma para o acumulador
            lastUpdate = currentTime; // Define valor atual comparando com a ultima atualização

            if (accumulator >= updateRate) { // Condição para fazer o update baseado no na taxa de update
                while (accumulator > updateRate) { // Condição para atualizar as informações do jogo
                    update();
                    accumulator -= updateRate;
                }
                render();
            }
        }
    }

    private void update() {
        game.update(); // Passa a atualização da classe Game
    }

    private void render() {
        game.render(); // Paasa o render da classe Game
    }

}
