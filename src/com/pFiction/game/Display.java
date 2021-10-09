package com.pFiction.game;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class Display extends JFrame {
	
	private Canvas canvas;
	
	public Display(int width, int height) {
		
		setTitle("Cosmic Detective"); // Definir texto da janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Aponta que o software vai ser encerrado assim que a janela for fechada
		setResizable(false); // Aponta que o usuario não poderá alterar o tamanho da tela 
		
		canvas = new Canvas(); // Cria um Canvas(janela)
		canvas.setPreferredSize(new Dimension(width, height)); // Aponta as dimensões do Canvas
		canvas.setFocusable(false); // Define o foco do SO
		add(canvas); // Adiciona as informações de canvas ao display
		pack(); // Calculará em JFrame as informações passadas no Canvas
		
		canvas.createBufferStrategy(3); // O que é e para quê serve o BufferStrategy?
		
		setLocationRelativeTo(null); // Aponta a localização da Janela na tela
		setVisible(true); // Aponta se a janela é visivel ou não
	}
	
	public void render (Game game) {
		
		BufferStrategy buffer = canvas.getBufferStrategy();
		Graphics graphics = buffer.getDrawGraphics(); // Aponta que graficos são tudo que será desenhado no canvas
		
		
		graphics.setColor(new Color(40,40,40)); // Você utilizou graficos para criar uma nova variavel
		graphics.fillRect(0,0,canvas.getWidth(),canvas.getHeight());
		
		
		graphics.dispose(); // Qual a função do dispose()?
		buffer.show(); // Tem  função de tornar visisvel tudo que foi desenhado
		
	}

}
