package com.hillel.lesson5;

public class Homework5 {
    public static void main(String[] args) {
        int warriorLi  = 13;
        int archerLi = 24;
        int apexLi = 46;

        int warriorMin  = 9;
        int archerMin = 35;
        int apexMin = 12;

        int warriorLiNumber = 860;
        double warriorMinNumber = warriorLiNumber * 1.5;

        int attackPowerLi = warriorLiNumber * (warriorLi + archerLi + apexLi);
        int attackPowerMin = (int)warriorMinNumber * (warriorMin + archerMin + apexMin);
        System.out.println("Загальний показник атаки воїнів династії Лі: " + attackPowerLi);
        System.out.println("Загальний показник атаки воїнів династії Мінь: " + attackPowerMin);

    }
}