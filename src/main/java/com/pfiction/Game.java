package com.pfiction;

import java.awt.*;

public class Game { // Codigo base do jogo

    private Display display;
    private Rectangle rectangle;

    public Game(int width, int height) {
        display = new Display(width, height); // A informação de Game será implementada usando as configurações do display
        rectangle = new Rectangle(0,0,50,50); // Cria um rectangle definindo seu tamanho e localização base
    }

    public void update() {
        rectangle.setLocation((int) rectangle.getX() + 1, (int) rectangle.getY()); // A atualização que será implementada a localização do retangulo
    }

    public void render() {
        display.render(this); // Haverá a renderização do game usando as configurações do display
    }

    public Rectangle getRectangle() {
        return rectangle; // Get que irá puxar o rectangle.
    }

}
