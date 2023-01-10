package com.hillel.lesson5;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {

        int team1Player1 = 0;
        int team1Player2 = 0;
        int team1Player3 = 0;
        int team1Player4 = 0;
        int team1Player5 = 0;
        int team2Player1 = 0;
        int team2Player2 = 0;
        int team2Player3 = 0;
        int team2Player4 = 0;
        int team2Player5 = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть ім'я першої команди");
        String teamName1 = scanner.nextLine();

        System.out.println("Введіть кількість фрагів для гравців першої команди");

        if (scanner.hasNextInt()){
            team1Player1 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Невірне значення кількості фрагів");
            System.exit(0);
        }

        if (scanner.hasNextInt()){
            team1Player2 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Невірне значення кількості фрагів");
            System.exit(0);
        }

        if (scanner.hasNextInt()){
            team1Player3 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Невірне значення кількості фрагів");
            System.exit(0);
        }

        if (scanner.hasNextInt()){
            team1Player4 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Невірне значення кількості фрагів");
            System.exit(0);
        }

        if (scanner.hasNextInt()){
            team1Player5 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Невірне значення кількості фрагів");
            System.exit(0);
        }

        System.out.println("Введіть ім'я другої команди");
        String teamName2 = scanner.nextLine();

        System.out.println("Введіть кількість фрагів для гравців другої команди");

        if (scanner.hasNextInt()){
            team2Player1 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Невірне значення кількості фрагів");
            System.exit(0);
        }

        if (scanner.hasNextInt()){
            team2Player2 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Невірне значення кількості фрагів");
            System.exit(0);
        }

        if (scanner.hasNextInt()){
            team2Player3 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Невірне значення кількості фрагів");
            System.exit(0);
        }

        if (scanner.hasNextInt()){
            team2Player4 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Невірне значення кількості фрагів");
            System.exit(0);
        }

        if (scanner.hasNextInt()){
            team2Player5 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Невірне значення кількості фрагів");
            System.exit(0);
        }

        double team1Score = (double) (team1Player1 + team1Player2 + team1Player3 + team1Player4 + team1Player5) / 5;
        double team2Score = (double) (team2Player1 + team2Player2 + team2Player3 + team2Player4 + team2Player5) / 5;


    if (team1Score > team2Score){
        System.out.println("Перемогла команда " + teamName1 + " набравши " + team1Score + " очків");
    } else if (team1Score < team2Score) {
        System.out.println("Перемогла команда " + teamName2 + " набравши " + team2Score + " очків");
    } else {
        System.out.println("Рахунок рівний, перемогла дружба!");
    }


    }
}
