package com.hillel.homework15;

public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public Cat() {
        }

        public void sayMeow() {
            System.out.println("Meow!");
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getWeight() {
            return weight;
        }

        public void setName(String name) {
            if(name.isEmpty()){
                System.out.println("Name is required");
            } else
            this.name = name;
            System.out.println("Cat's name is: " + name);

        }

        public void setAge(int age) {
            if(age <= 0){
                System.out.println("Age can not be zero or less");
            } else
                this.age = age;
                System.out.println("Cat's age is: " + age);
        }

        public void setWeight(int weight) {
            if(weight <= 0){
                System.out.println("Weight can not be zero or less");
            } else
                this.weight = weight;
                System.out.println("Cat's weight is: " + weight);
        }
}
