package com.hillel.lesson10;

public class Main {
    public static void main(String[] args) {

        Burger burger = new Burger("bread", "meat", "cheese", "mayonnaise", "greens");
        Burger dietBurger = new Burger("bread", "meat", "cheese", "greens");
        Burger veganBurger = new Burger("bread", "cheese", "greens");
    }
}

