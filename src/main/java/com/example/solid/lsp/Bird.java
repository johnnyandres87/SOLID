package com.example.solid.lsp;

public class Bird extends Animal implements Fly{

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
