package com.pFiction.game;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class Display extends JFrame {
	
	private Canvas canvas;
	
	public Display(int width, int height) {
		
		setTitle("Cosmic Detective"); // Definir texto da janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Aponta que o software vai ser encerrado assim que a janela for fechada
		setResizable(false); // Aponta que o usuario n�o poder� alterar o tamanho da tela 
		
		canvas = new Canvas(); // Cria um Canvas(janela)
		canvas.setPreferredSize(new Dimension(width, height)); // Aponta as dimens�es do Canvas
		canvas.setFocusable(false); // Define o foco do SO
		add(canvas); // Adiciona as informa��es de canvas ao display
		pack(); // Calcular� em JFrame as informa��es passadas no Canvas
		
		canvas.createBufferStrategy(3); // O que � e para qu� serve o BufferStrategy?
		
		setLocationRelativeTo(null); // Aponta a localiza��o da Janela na tela
		setVisible(true); // Aponta se a janela � visivel ou n�o
	}
	
	public void render (Game game) {
		
		BufferStrategy buffer = canvas.getBufferStrategy();
		Graphics graphics = buffer.getDrawGraphics(); // Aponta que graficos s�o tudo que ser� desenhado no canvas
		
		
		graphics.setColor(new Color(40,40,40)); // Voc� utilizou graficos para criar uma nova variavel
		graphics.fillRect(0,0,canvas.getWidth(),canvas.getHeight());
		
		
		graphics.dispose(); // Qual a fun��o do dispose()?
		buffer.show(); // Tem  fun��o de tornar visisvel tudo que foi desenhado
		
	}

}
