package com.company;
// ТРАВОЯДНЫЕ
    public class Herbivores extends Animals implements Fieldable {


    public Herbivores(String name, double animalWeight, double animalAppetit, int maxGuantity, double maxSpeed) {
        super(name, animalWeight, animalAppetit, maxGuantity, maxSpeed);
    }

    @Override
    public void eat() {

        return ;
    }

    @Override
    public String getSymbol() {
        return null;
    }
}
