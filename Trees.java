package com.company.Task4;

public class Trees extends Plant {

    private int numberOfAnnualRings;

    Trees(String name, String habitat, int age, int numberOfAnnualRings){
        super(name, habitat, age);
        this.numberOfAnnualRings=numberOfAnnualRings;
    }

    public int skipYear(){
        numberOfAnnualRings++;
        age++;
        return numberOfAnnualRings;
    }

    public int skipYear(int value){
        numberOfAnnualRings=numberOfAnnualRings+value;
        age=age+value;
        return numberOfAnnualRings;
    }

    @Override
    public void plantSounds() {
        System.out.println("Sound: *Fastening a tree trunk*");
    }
}
