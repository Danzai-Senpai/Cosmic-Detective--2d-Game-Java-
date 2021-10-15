package com.pfiction;

import java.awt.event.KeyEvent;
import java.security.Key;

public class PlayerController implements Controller {
    private Input input;

    // Aponta o valor do input
    public PlayerController(Input input) {
        this.input = input;
    }

    // Determina o retorno da tecla para qual tecla eu apertei
    @Override
    public boolean isRequestingUp() {
        return input.isPressed(KeyEvent.VK_UP);
    }

    @Override
    public boolean isRequestingW() {
        return input.isPressed(KeyEvent.VK_W);
    }

    @Override
    public boolean isRequestingDown() {
        return input.isPressed(KeyEvent.VK_DOWN);
    }

    @Override
    public boolean isRequestingS() {
        return input.isPressed(KeyEvent.VK_S);
    }

    @Override
    public boolean isRequestingLeft() {
        return input.isPressed(KeyEvent.VK_LEFT);
    }

    @Override
    public boolean isRequestingA() {
        return input.isPressed(KeyEvent.VK_A);
    }

    @Override
    public boolean isRequestingRight() {
        return input.isPressed(KeyEvent.VK_RIGHT);
    }

    @Override
    public boolean isRequestingD() {
        return input.isPressed(KeyEvent.VK_D);
    }
}
