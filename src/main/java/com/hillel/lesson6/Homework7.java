package com.hillel.lesson6;

import java.util.Scanner;

//Зробити гру, в якій потрібно відгадати ціле число, яке "загадав" комп'ютер у діапазоні від 0 до 10
//Користувач повинен мати можливість вгадувати в кілька спроб (мінімум 3).

public class Homework7 {
    public static void main(String[] args) {

        int randomNumber = (int)(Math.random() * 11);

        System.out.println("Спробуйте відгадати ціле число, яке \"загадав\" комп'ютер у діапазоні від 0 до 10");

        Scanner scanner = new Scanner(System.in);

        //int turn = 0;
        for (int i = 1; i <=3; i++){
            if(scanner.hasNextInt()) {
                int turn = scanner.nextInt();
                scanner.nextLine();
                if (turn > randomNumber) {
                    System.out.println("Спробуйте обрати менше число");
                } else if (turn < randomNumber) {
                    System.out.println("Спробуйте обрати більше число");
                } else {
                    System.out.println("Вітаємо! Це вірна відповідь!");
                }
            }
        }
    }
}
