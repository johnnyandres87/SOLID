package com.example.solid.test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese un texto: ");
        String s = scan.nextLine();

        String regex = "[A-Za-z]+";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(s);

        // List to hold all the tokens
        ArrayList<String> tokens = new ArrayList<>();

        // Find all matches
        while (matcher.find()) {
            tokens.add(matcher.group());
        }

        // Print the number of tokens
        System.out.println(tokens.size());

        // Print each token on a new line
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
