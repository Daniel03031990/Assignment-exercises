package org.example;public class Zoo {
    public interface AnimalBehavior{
        void eat();
        void sleep();
        void makeSound();




    }
    public abstract static class Animal implements AnimalBehavior{
        protected String name;
        protected int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public void sleep() {
            System.out.println(name + " is sleeping.");
        }


        public abstract void displayInformation();

        @Override
        public void makeSound() {
            System.out.println(name + " makes a sound.");
        }
    }
    public  abstract static class Mammal extends Animal {

        public Mammal(String name, int age) {
            super(name, age);
        }

        @Override
        public void displayInformation() {
            System.out.println("I am a mammal.");
        }
    }public abstract static class Bird extends Animal {

        public Bird(String name, int age) {
            super(name, age);
        }

        @Override
        public void displayInformation() {
            System.out.println("I am a bird.");
        }
    }public static class Lion extends Mammal {

        public Lion(String name, int age) {
            super(name, age);
        }

        @Override
        public void eat() {
            System.out.println(name + " is eating meat.");
        }

        @Override
        public void makeSound() {
            System.out.println(name + " roars.");
        }

        @Override
        public void displayInformation() {
            System.out.println("I am a Lion. I am " + age + " years old.");
        }
    }
    public static class Elephant extends Mammal {

        public Elephant(String name, int age) {
            super(name, age);
        }

        @Override
        public void eat() {
            System.out.println(name + " is eating plants.");
        }

        @Override
        public void makeSound() {
            System.out.println(name + " trumpets.");
        }

        @Override
        public void displayInformation() {
            System.out.println("I am an Elephant. I am " + age + " years old.");
        }
    }
    public static class Parrot extends Bird {

        public Parrot(String name, int age) {
            super(name, age);
        }

        @Override
        public void eat() {
            System.out.println(name + " is eating seeds.");
        }

        @Override
        public void makeSound() {
            System.out.println(name + " chirps.");
        }

        @Override
        public void displayInformation() {
            System.out.println("I am a Parrot. I am " + age + " years old.");
        }
    }
    public static class Eagle extends Bird {

        public Eagle(String name, int age) {
            super(name, age);
        }

        @Override
        public void eat() {
            System.out.println(name + " is eating fish.");
        }

        @Override
        public void makeSound() {
            System.out.println(name + " screeches.");
        }

        @Override
        public void displayInformation() {
            System.out.println("I am an Eagle. I am " + age + " years old.");
        }
    }
    public static void main(String[] args) {
        Animal lion = new Lion("Leo", 5);
        Animal elephant = new Elephant("Dumbo", 10);
        Animal parrot = new Parrot("Polly", 2);
        Animal eagle = new Eagle("Eagle", 4);

        lion.eat();
        lion.makeSound();
        lion.sleep();
        lion.displayInformation();

        elephant.eat();
        elephant.makeSound();
        elephant.sleep();
        elephant.displayInformation();

        parrot.eat();
        parrot.makeSound();
        parrot.sleep();
        parrot.displayInformation();

        eagle.eat();
        eagle.makeSound();
        eagle.sleep();
        eagle.displayInformation();
    }
}



