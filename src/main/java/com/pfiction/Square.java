package com.pfiction;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Square extends GameObject { // Classe extendida de Game Object sendo este um objeto do jogo com partes adicionais que o diferencia dos outros
    @Override
    public void update() { // A informação que será atualizada constantemente na tela
        position = new Position(position.getX() + 1, position.getY());
    }

    @Override
    public Image getSprite() { // Imagem que será puxada sendo esta a representação do objeto Square na tela
        BufferedImage image = new BufferedImage(size.getWidth(), size.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();

        graphics.setColor(Color.CYAN);
        graphics.fillRect(0,0,size.getWidth(),size.getHeight());

        graphics.dispose();
        return image;
    }
}
