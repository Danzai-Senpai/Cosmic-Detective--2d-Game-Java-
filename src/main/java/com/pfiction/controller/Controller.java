package com.pfiction.controller;

public interface Controller {
    // Um boolean para cada tecla
    boolean isRequestingUp();
    boolean isRequestingW();
    boolean isRequestingDown();
    boolean isRequestingS();
    boolean isRequestingLeft();
    boolean isRequestingA();
    boolean isRequestingRight();
    boolean isRequestingD();
}
