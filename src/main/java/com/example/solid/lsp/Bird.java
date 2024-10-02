package com.example.solid.lsp;
import java.util.logging.Logger;
public class Bird extends Animal implements Fly{

    private static final Logger logBird = Logger.getLogger(Bird.class.getName());
    @Override
    public void fly() {
        logBird.info("Bird is flying");
    }
}
