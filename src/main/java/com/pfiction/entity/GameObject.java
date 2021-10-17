package com.pfiction.entity;

import com.pfiction.core.Position;
import com.pfiction.core.Size;

import java.awt.*;

public abstract class GameObject {
    // Tamanho e Posição determinados utilizando o padrão desenvolvido em uma classeseparada para ser reutilizada
    protected Position position;
    protected Size size;

    public GameObject() {
        position = new Position(50, 50);
        size = new Size(50, 50);
    } // Definindo tamanho e posição padrão para este objeto

    public abstract void update(); // Estes desenvolvidos em Abstracts quando a classe for extendida estas serão implementadas no codigo
    public abstract Image getSprite();

    // Getters feitos para puxar informação

    public Position getPosition() {
        return position;
    }

    public Size getSize() {
        return size;
    }
}
