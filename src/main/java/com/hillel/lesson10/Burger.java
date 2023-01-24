package com.hillel.lesson10;

public class Burger {
    String bread;
    String meat;
    String cheese;
    String mayonnaise;
    String greens;

    public Burger (String bread, String meat, String cheese, String mayonnaise, String greens){
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.mayonnaise = mayonnaise;
        this.greens = greens;
        System.out.println("Classic Burger consists of " + bread + ", " + meat + ", " + cheese + ", " + mayonnaise + ", " + greens);
    }
     public Burger(String bread, String meat, String cheese, String greens){
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Diet Burger consists of " + bread + " " + meat + " " + cheese + " " + greens);
    }
    public Burger (String bread, String cheese, String greens){
        this.bread = bread;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Vegan Burger consists of " + bread + " " + cheese + " " + greens);
    }

}
