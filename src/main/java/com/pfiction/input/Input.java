package com.pfiction.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Input implements KeyListener { // Padrão para o controle do jogo determinando aqui os inputs
    private boolean[] pressed; // Um array boolean que aparece toda vez que pressionado

    public Input() {
        pressed = new boolean[255]; // Determina o tamanho do array
    }

    public boolean isPressed(int keyCode) {
        return pressed[keyCode]; // Caso pressionado vai retonar um valor
    }

    @Override
    public void keyTyped(KeyEvent e) { }

    @Override
    public void keyPressed(KeyEvent e) {
        pressed[e.getKeyCode()] = true; // Quando pressionado a tecla ... o valor vai ser true
    }

    @Override
    public void keyReleased(KeyEvent e) {
        pressed[e.getKeyCode()] = false; // Quando não for pressionado nenhuma tecla o valor vai ser false
    }
}
