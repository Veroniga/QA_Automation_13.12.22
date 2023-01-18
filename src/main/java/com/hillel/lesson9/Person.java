package com.hillel.lesson9;

public class Person {
    public static void main(String[] args) {
        personInfo("Will", "Smith", "New York", "2936729462846");
        personInfo("Jackie", "Chan", "Shanghai", "12312412412");
        personInfo("Sherlock", "Holmes", "London", "37742123513");
    }

    static String personInfo(String name, String surname, String city, String mobile){
        String personalInfo = ("Зателефонувати громадянину " + name + " " + surname + " із міста " + city + " можна за номером " + mobile);
        System.out.println(personalInfo);
        return personalInfo;
    }
}
