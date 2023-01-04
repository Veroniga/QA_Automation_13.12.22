package com.hillel.lesson5;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {

        System.out.println("Введіть ім'я першої команди");
        Scanner scanner = new Scanner(System.in);
        String teamName1 = scanner.nextLine();

        System.out.println("Введіть кількість фрагів для гравців першої команди");

        //for (int i = 1; i <= 5; i++) {

        if (scanner.hasNextInt()){
            int team1player1 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Невірне значення кількості фрагів");
            System.exit(status: 0);
        }

        if (scanner.hasNextInt()){
            int team1player2 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Невірне значення кількості фрагів");
            //System.exit(status: 0);
        }

        if (scanner.hasNextInt()){
            int team1player3 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Невірне значення кількості фрагів");
            //System.exit(status: 0);
        }

        if (scanner.hasNextInt()){
            int team1player4 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Невірне значення кількості фрагів");
            //System.exit(status: 0);
        }

        if (scanner.hasNextInt()){
            int team1player5 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Невірне значення кількості фрагів");
            //System.exit(status: 0);
        }

        //System.out.println(team1player5);


        /* System.out.println("Введіть ім'я другої команди");
        Scanner scanner6 = new Scanner(System.in);
        String teamName2 = scanner6.nextLine();
        System.out.println(teamName2);

        System.out.println("Введіть кількість фрагів для гравців другої команди");

        Scanner scanner2 = new Scanner(System.in);
        int team1player1 = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        int team1player3 = scanner3.nextInt();

        Scanner scanner4 = new Scanner(System.in);
        int team1player4 = scanner4.nextInt();
        Scanner scanner5 = new Scanner(System.in);
        int team1player5 = scanner5.nextInt();

        System.out.println(team1player5);*/

//
//

       // int team1Score = (team1Player1 + team1Player2 + team1Player3 + team1Player4 + team1Player5) / 5;
//        int team2Score = (team2Player1 + team2Player2 + team2Player3 + team2Player4 + team2Player5) / 5;
//
//    if (team1Score > team2Score){
//        System.out.println("Перемогла команда" + teamName1 + "набрала" + team1Score + "очків");
//    } else if (team1Score < team2Score) {
//        System.out.println("Перемогла команда" + teamName2 + "набрала" + team2Score + "очків");
//    } else {
//        System.out.println("Перемогла команда дружба!");
//    }


    }
}
