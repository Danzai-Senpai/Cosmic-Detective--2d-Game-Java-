package com.pfiction;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class Display extends JFrame { // As configurações do Display que serão implementadas.
    private Canvas canvas;

    public Display (int width, int height) {
        setTitle("Test"); // Nome na parte superior da tela
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Determina que o processo vai ser encerrado após o fechamento da janela
        setResizable(false); // Aponta se o player pode ou não alterar o tamanho da janela

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height)); // Aponta o tamanho desejado para a tela
        canvas.setFocusable(false); // Define se assim que iniciado o foco irá para o jogo ou permanecerá na janela anterior.
        add(canvas); // Adiciona as informações ao Canvas(Tela)
        pack(); // Empacota as informações do JFrame a Canvas

        canvas.createBufferStrategy(3); // São a quantidade de ups que são renderizados de uma vez para tornar a renderiazação mais fluída

        setLocationRelativeTo(null); // Define o posicionamento de origem da tela
        setVisible(true); // Aponta se é visivel ou não
    }

    public void render(Game game) {
        BufferStrategy bufferStrategy = canvas.getBufferStrategy(); // Chama o BufferStrategy com as configurações de canvas
        Graphics graphics = bufferStrategy.getDrawGraphics(); // Chama a classe graficos para desenhar o que é indicado no BufferStrategy co Canvas

        graphics.setColor(new Color(40,40,40)); // Camada de cor base criada
        graphics.fillRect(0,0, canvas.getWidth(), canvas.getHeight()); // Aponta o tamanho e forma que será complementada pela cor definida anteriormente

        game.getGameObjects().forEach(gameObject -> graphics.drawImage(
                gameObject.getSprite(),
                gameObject.getPosition().getX(),
                gameObject.getPosition().getY(),
                null
        )); // Pega GameObjects que irá ser desenhado a cada grafico desenhado (Render de cada Update) que será desenhado na tela

        graphics.dispose(); // Faz com que a janela JFrame seja destruida e limpa pelo sistema operacional
        bufferStrategy.show(); // Tem a função de exibir os Buffers na tela
    }
}