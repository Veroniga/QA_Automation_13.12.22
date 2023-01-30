package com.hillel.homework14;

public class fitnessTracker {
}


//    Незмінні (задаються тільки при створенні облікового запису, і можуть бути отримані лише за допомогою гетерів):
//
//        Створювати кожного користувача необхідно через конструктор, беручи всі поля на вхід конструктора.
//        Додати метод , при виклику якого друкувати всі дані про користувача

    String name;
    int birthDay;
    int birthMonth;
    int birthYear;
    String email;
    String phoneNumber;
    String surname;
    int weight;
    int pressure;
    int steps;

    public User (String name, int birthDay, String email, String phoneNumber, String surname, int weight, int pressure, int steps){
        this.name = name;
        this.birthDay = birthDay;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
    }
   static void printAccountInfo(){
        System.out.println();
    }

    int age;
    age = 2023 - birthYear;

}