package com.company.Task4;

public class Flowers extends Plant {
    private int numberOfPetals;

    Flowers(String name, String habitat, int age, int numberOfPetals){
        super(name, habitat, age);
        this.numberOfPetals=numberOfPetals;
    }

    public int dropperOfPetals(){
        numberOfPetals--;
        if(numberOfPetals<0){
            numberOfPetals=0;
        }
        return numberOfPetals;
    }

    public int dropperOfPetals(int value){
        numberOfPetals=numberOfPetals-value;
        if(numberOfPetals<0){
            numberOfPetals=0;
        }
        return numberOfPetals;
    }

    @Override
    public void plantSounds() {
        System.out.println("Sound: *Rustling petals*");
    }
}
