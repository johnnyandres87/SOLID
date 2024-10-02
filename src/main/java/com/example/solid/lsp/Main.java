package com.example.solid.lsp;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.move();
        // Bird is flying

        Foca foca = new Foca();
        foca.move();
    }
}
