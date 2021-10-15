package com.pfiction;

public class Launcher { // Iniciará o Jogo

    public static void main(String[] args) {
        new Thread(new GameLoop(new Game(800, 600))).start();
        // Você inicia a thread que possui como padrão rodar o Game Loop portando Game com as configurações de display como atributos.
    }

}