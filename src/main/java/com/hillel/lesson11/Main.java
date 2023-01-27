package com.hillel.lesson11;


public class Main {
    public static void main(String[] args) {
            Androids android = new Androids("Samsung Galaxy M33");
            IPhones iphone = new IPhones("Apple iPhone 13");

            android.opSystem();
            android.call();
            android.sms();
            android.internet();
            System.out.println();
            iphone.opSystem();
            iphone.call();
            iphone.sms();
            iphone.internet();
        }

}