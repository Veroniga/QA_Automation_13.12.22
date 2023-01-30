package com.hillel.homework14;

public class Main {
    public static void main(String[] args) {

        FitnessTracker user1 = new FitnessTracker("Jack", 14,3,1981, "jack@ukr.net","380637436523","Nikolson", 86, 135, 9500);
        FitnessTracker user2 = new FitnessTracker("Tom", 25,7,1983, "tom@ukr.net","380502236521","Cruz", 91, 116, 17900);
        FitnessTracker user3 = new FitnessTracker("Adam", 19,9,1985, "adam@ukr.net","380639493993","Sandler", 97, 123, 11100);

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();

        System.out.println("Data for some users has been changed recently: ");
        System.out.println();

        user1.setEmail("jack@gmail.com");
        user2.setName("Valera");
        user2.setPhoneNumber("380488888778");

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
    }
}
