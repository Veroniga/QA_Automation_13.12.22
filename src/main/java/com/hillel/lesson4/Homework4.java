package com.hillel.lesson4;

public class Homework4 {
    public static void main(String[] args) {
    int parallelepipedSide1 = 7;
    int parallelepipedSide2 = 9;
    int parallelepipedSide3 = 11;

    int volume = parallelepipedSide1 * parallelepipedSide2 * parallelepipedSide3;
    System.out.println("Об'єм паралелепіпеда = " + volume);

    int length = 4 * (parallelepipedSide1 + parallelepipedSide2 + parallelepipedSide3);
    System.out.println("Довжина всіх сторін паралелепіпеда = " + length);

    }
}
