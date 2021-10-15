package com.pfiction;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Game { // Codigo base do jogo
    private Display display;
    private List<GameObject> gameObjects;

    public Game(int width, int height) {
        display = new Display(width, height); // A informação de Game será implementada usando as configurações do display
        gameObjects = new ArrayList<>();
        gameObjects.add(new Square());
    }

    public void update() {
        gameObjects.forEach(gameObject -> gameObject.update()); // Aponta que ocorrerá a atualização a cada atualização de GameObjects
    }

    public void render() {
        display.render(this); // Haverá a renderização do game usando as configurações do display
    }

    public List<GameObject> getGameObjects() {
        return gameObjects; // Metodo de chamar a lista de objetos do jogo
    }
}