package com.pfiction.entity;

import com.pfiction.controller.Controller;
import com.pfiction.core.Position;
import com.pfiction.entity.GameObject;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends GameObject { // Classe extendida de Game Object sendo este um objeto do jogo com partes adicionais que o diferencia dos outros

    private Controller controller;

    // Adiciona as funcionalidades do controle
    public Player(Controller controller) {
        super();
        this.controller = controller;
    }

    @Override
    public void update() { // A informação que será atualizada constantemente na tela
        int deltaX = 0;
        int deltaY = 0;

        // Aponta quais eventos irão acontecer caso algumas das teclas apontadas seja pressionada
        if (controller.isRequestingUp()) {
            deltaY--;
        } else if (controller.isRequestingW()) {
            deltaY--;
        }

        if (controller.isRequestingDown()) {
            deltaY++;
        } else if (controller.isRequestingS()) {
            deltaY++;
        }

        if (controller.isRequestingLeft()) {
            deltaX--;
        } else if (controller.isRequestingA()) {
            deltaX--;
        }

        if (controller.isRequestingRight()) {
            deltaX++;
        } else if (controller.isRequestingD()) {
            deltaX++;
        }

        // Atualização da posição em relação ao valor dos inputs
        position = new Position(position.getX() + deltaX, position.getY() + deltaY);
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
