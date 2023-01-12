package com.hillel.lesson7;

//Є дві команди регбі з 25 гравців різного віку у кожній.
// Вік беремо випадковим чином в діапазоні від 18 до 40.
// Виведіть у двох рядках вік гравців кожної команди.
//Порахуйте середній вік гравців кожної команди та виведіть на екран.

public class Homework9 {
    public static void main(String[] args) {


        int[] team1 = new int[25];
        int[] team2 = new int[25];

        int minAge = 18;
        int maxAge = 40;


        for (int i = 0; i < team1.length; i++){
            int randomAge = (int) (Math.random() * (maxAge - minAge + 1)) + minAge;
            team1[i] = randomAge;
        }
        for (int i = 0; i < team1.length; i++){
            if(team1.length -1 == i){
                System.out.print(team1[i]);
            } else {
                System.out.print(team1[i] + ", ");
            }
        }
        System.out.println();

        for (int i = 0; i < team2.length; i++){
            int randomAge = (int) (Math.random() * (maxAge - minAge + 1)) + minAge;
            team2[i] = randomAge;
        }
        for (int i = 0; i < team2.length; i++){
            if(team2.length -1 == i){
                System.out.print(team2[i]);
            } else {
                System.out.print(team2[i] + ", ");
            }
        }

//        int average = 0;
//        for (int age : team1) {
//            average += age;
//        }
//        double averageAgeTeam1 = average / team1.length;
//        System.out.println(averageAgeTeam1);
//
//
//        for (int age : team2) {
//            average += age;
//        }
//        double averageAgeTeam2 = average / team2.length;
//        System.out.println(averageAgeTeam2);

    }
}
