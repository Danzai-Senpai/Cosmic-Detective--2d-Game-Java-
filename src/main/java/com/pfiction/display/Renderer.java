package com.pfiction.display;

import com.pfiction.game.Game;

import java.awt.*;

public class Renderer {

    // Tem a função de ser um render dos Game Objects que vai ser escrito separadamente e aparecerá na renderização
    public void render(Game game, Graphics graphics) {
        game.getGameObjects().forEach(gameObject -> graphics.drawImage(
                gameObject.getSprite(),
                gameObject.getPosition().getX(),
                gameObject.getPosition().getY(),
                null
        )); // Pega GameObjects que irá ser desenhado a cada grafico desenhado (Render de cada Update) que será desenhado na tela
    }
}
