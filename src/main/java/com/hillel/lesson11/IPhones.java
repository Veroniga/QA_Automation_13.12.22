package com.hillel.lesson11;

public class IPhones implements Smartphones, IOS {
        String model;
        public IPhones(String model) {
            this.model = model;
        }

        @Override
        public void call() {
            System.out.println(model + " can make a call");
        }
        @Override
        public void sms() {
            System.out.println(model + " can send a message");
        }
        @Override
        public void internet() {
            System.out.println(model + " has wi-fi");
        }
        @Override
        public void opSystem() {

            System.out.println(model + " has iOS operation system");
        }
}
