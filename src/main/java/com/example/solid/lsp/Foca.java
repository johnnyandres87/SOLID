package com.example.solid.lsp;

import java.util.logging.Logger;

public class Foca extends Animal {

    Logger logFoca = Logger.getLogger(Foca.class.getName());
    @Override
    public void move() {
        logFoca.info("Foca is moving");
    }
}
