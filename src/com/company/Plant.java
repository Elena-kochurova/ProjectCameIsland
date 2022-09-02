package com.company;
// РАСТЕНИЯ

   public class Plant implements Fieldable{

      private String name;
      private double animalWeight; // вес
      private int maxGuantity ; // макс количество в одной клетке

      public Plant(String name, double animalWeight , int maxGuantity ) {
         this.name = name;
         this.animalWeight = animalWeight;
         this.maxGuantity = maxGuantity;
      }

      @Override
      public String toString() {
         return "Plant{" +
                 "name='" + name + '\'' +
                 ", animalWeight=" + animalWeight +
                 ", maxGuantity=" + maxGuantity +
                 '}';
      }

      @Override
      public String getSymbol() {
         return null;
      }


   }
