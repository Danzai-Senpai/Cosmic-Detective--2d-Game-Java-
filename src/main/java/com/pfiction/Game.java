package com.pfiction;

import java.util.ArrayList;
import java.util.List;

public class Game { // Codigo base do jogo
    private Display display;
    private List<GameObject> gameObjects;
    private Input input;

    public Game(int width, int height) {
        input = new Input();
        display = new Display(width, height, input); // A informação de Game será implementada usando as configurações do display
        gameObjects = new ArrayList<>(); // Criação de um Arraylist para os objetos do jogo
        gameObjects.add(new Player(new PlayerController(input))); // Chama Player relacionando a ele as informações necessarias a este assim como o adiciona aos objetos do jogo
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