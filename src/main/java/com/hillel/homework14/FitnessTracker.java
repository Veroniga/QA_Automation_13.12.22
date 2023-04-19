package com.hillel.homework14;

public class FitnessTracker {
    private final String name;
    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;
    private final String email;
    private final String phoneNumber;
    private String surname;
    private int weight;
    private int pressure;
    private int steps;
    private int age;

    public FitnessTracker(String name, int birthDay, int birthMonth, int birthYear, String email, String phoneNumber, String surname, int weight, int pressure, int steps){
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.age = 2023 - birthYear;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
    }

    public void printAccountInfo(){
        System.out.println(" User Name: " + name + '\n' +
                " Birth date: " + birthDay + "." + birthMonth + "." + birthYear + '\n' +
                " Age: " + age + '\n' +
                " Email: " + email + '\n' +
                " Cell: " + phoneNumber + '\n' +
                " Surname: " + surname + '\n' +
                " Current weight: " + weight + '\n' +
                " Current pressure: " + pressure + '\n' +
                " Walk distance: " + steps);
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getAge() {
        return age;
    }
}