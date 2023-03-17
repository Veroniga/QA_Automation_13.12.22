package com.hillel.lesson8;

import java.util.Scanner;

//Транспонуйте матрицю M x N. Розміри M та N задаються з консолі.
//Після введення повинні автоматично створюватися два масиви розміром M x N перший та N x M другий.
public class Homework10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int m = valueForArr(scanner, "rows");
        int n = valueForArr(scanner, "columns");

        int [][] array1 = new int [m][n];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 101);
            }
        }
        System.out.println("Before:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        int [][] array2 = new int [n][m];

        for (int i = 0; i < array1.length; i++) {
            for (int j = i; j < array1[i].length; j++) {
                int temp = array1[i][j];
                array2[i][j] = array1[j][i];
                array2[j][i] = temp;
            }
        }
        System.out.println("After:");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
   }

    public static int valueForArr(Scanner scanner, String str){
        System.out.println("Enter number of " + str);
        while (true) {
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine();
                if (value < 0) {
                    System.out.println("Only positive number can be entered, try again");
                } else {
                    return value;
                }
            } else {
                System.out.println("Wrong data, only number is possible");
                scanner.nextLine();
            }
        }
    }
}
