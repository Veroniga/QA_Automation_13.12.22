package com.hillel.lesson8;

import java.util.Scanner;

//Транспонуйте матрицю M x N. Розміри M та N задаються з консолі.
//Після введення повинні автоматично створюватися два масиви розміром M x N перший та N x M другий.
public class Homework10 {
    public static void main(String[] args) {

        int m = 0;
        int n = 0;
        //int [][] array1 = new int [][];
       // int [][] array2 = new int [][];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows");
        if(scanner.hasNextInt()) {
                m = scanner.nextInt();
                scanner.nextLine();
            }

        System.out.println("Enter number of columns");
        if(scanner.hasNextInt()) {
            n = scanner.nextInt();
            scanner.nextLine();
        }

        int [][] array1 = new int [m][n];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 101);
            }
        }

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        int [][] array2 = new int [n][m];


//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array[i].length; j++) {
//                int temp = array[i][j];
//                array[i][j] = array[j][i];
//                array[j][i] = temp;
//            }
//        }
//
//        System.out.println("AFTER");
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }

   }
}
