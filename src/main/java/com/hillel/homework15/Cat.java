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
            this.name = name;
        }

        public void setAge(int age) {
            if(age > 0){
                this.age = age;
            } else
                System.out.println("dfgdfg");
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }


    //   if(weight <= 0)
}
