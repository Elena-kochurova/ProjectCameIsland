package com.company;

    public abstract class Animals  {
    private String name;
    private double animalWeight; // вес
    private int maxGuantity ; // макс количество в одной клетке
    private double maxSpeed; // макс. скорость
    private double animalAppetit;  // сколько макс.съедает животное




    public Animals(String name, double animalWeight, double animalAppetit, int maxGuantity, double maxSpeed ) {
        this.name = name;
        this.animalWeight = animalWeight;
        this.animalAppetit = animalAppetit;
        this.maxGuantity = maxGuantity;
        this.maxSpeed = maxSpeed;

    }
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getMaxGuantity() {
        return maxGuantity;
    }

    public void setMaxGuantity(int maxGuantity) {
        this.maxGuantity = maxGuantity;
    }


    public double getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(double animalWeight) {
        this.animalWeight = animalWeight;
    }

    public double getAnimalAppetit() {
        return animalAppetit;
    }

    public void setAnimalAppetit(double animalAppetit) {
        this.animalAppetit = animalAppetit;
    }

    public double getMaxSpeed() {
        return  maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }



    public void eat(){
              return ;
   }

    void reproduction(Animals animals) //размножение
    {}
    public void deadHungry() {}  // умерает от голода

     public void MoveMent ( ) {} // передвигается


        @Override
        public String toString() {
            return "Animals{" +
                    "name='" + name + '\'' +
                    ", animalWeight=" + animalWeight +
                    ", maxGuantity=" + maxGuantity +
                    ", maxSpeed=" + maxSpeed +
                    ", animalAppetit=" + animalAppetit +
                    '}';
        }
    }