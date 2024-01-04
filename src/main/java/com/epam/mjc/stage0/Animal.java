package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public boolean getHasFur() {
        return hasFur;
    }

    public String getDescription() {
        return "This animal is mostly " + color + ". It has " + numberOfPaws + (numberOfPaws == 1 ? " paw" : " paws") + " and " + (hasFur ? "a" : "no") + " fur.";
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();

        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());
    }
}
