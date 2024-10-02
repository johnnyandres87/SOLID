package com.example.solid.lsp;

import java.util.logging.Logger;

public abstract class Animal {

    Logger logAnimal = Logger.getLogger(Animal.class.getName());
    public void move() {
        logAnimal.info("Animal is moving");
    }
}
