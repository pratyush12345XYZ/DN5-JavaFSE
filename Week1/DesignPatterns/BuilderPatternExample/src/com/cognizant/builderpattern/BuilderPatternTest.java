package com.cognizant.builderpattern;

public class BuilderPatternTest {

    public static void main(String[] args) {

        Computer computer = new Computer.Builder()
                .setCpu("Intel i7 1300H")
                .setRam("16GB")
                .setStorage("512GB SSD")
                .build();

        computer.displayConfiguration();
    }
}