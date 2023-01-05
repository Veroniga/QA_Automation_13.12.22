package com.hillel.lesson6;

//У Японії числа 4 та 9 вважаються нещасливими.
//Вам потрібно пронумерувати 100 космічних шатлів для перевезення людей на Марс так,
//щоб у номерах шатлів не траплялося нещасливих чисел.
//Напишіть функцію, яка виводить усі номери таких шатлів.

public class Homework8 {
    public static void main(String[] args) {

        int shuttleCounter = 1;

        while (shuttleCounter <= 100) {
            for (int i = 1; i <= 999; i++) {
                if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9 || i / 10 % 10 == 4 || i / 10 % 10 == 9) {
                    continue;
                } else if(shuttleCounter == 101){
                    break;
                }
                System.out.println(shuttleCounter + ": " + i);
                shuttleCounter++;
            }
        }
    }
}

