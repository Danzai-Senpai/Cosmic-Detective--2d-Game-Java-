package com.pfiction.core;

public class Size {
    private int width;
    private int height;

    // Definir posição e criar Getters e Setters para ajudar a chamar informações com maior facilidade

    public Size(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
