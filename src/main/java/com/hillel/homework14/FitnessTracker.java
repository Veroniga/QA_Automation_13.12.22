package com.hillel.homework14;

public class FitnessTracker {
    private String name;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String email;
    private String phoneNumber;
    String surname;
    int weight;
    int pressure;
    int steps;
    private int age;

    public FitnessTracker(String name, int birthDay, int birthMonth, int birthYear, String email, String phoneNumber, String surname, int weight, int pressure, int steps){
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
    }

    public int getAge(int age){
        age = 2023 - birthYear;
        this.age = age;
        return age;
    }

    public void printAccountInfo(){
        System.out.println(" User Name: " + name + '\n' +
                " Birth date: " + birthDay + "." + birthMonth + "." + birthYear + '\n' +
                " Age: " + getAge(birthYear) + '\n' +
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

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}