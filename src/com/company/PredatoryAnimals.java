package com.company;

// ХИЩНИКИ

public class PredatoryAnimals extends Animals implements Fieldable {

    public PredatoryAnimals(String name, double animalWeight, double animalAppetit, int maxGuantity, double maxSpeed) {
        super(name, animalWeight, animalAppetit, maxGuantity, maxSpeed);
    }

    @Override
    public void eat() {

        return;
    }

    @Override
    public String getSymbol() {
        return null;
    }
}
