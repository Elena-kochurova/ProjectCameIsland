package com.company;

public class Came {

   private int rows;
   private int columns;
   private int numerOfPredators; // кол-во хищников
   private int numberOfHerbivores;// кол-во травоядных
   private int numberPlant; // кол-во растений
   private int moves; // движение
    private int animalDied; // хранит умершее животное
    private Field field;


    public Came(int rows, int columns , int numberPlant , int numberOfHerbivores ,
                int numerOfPredators, int moves ) {
        this.rows = rows;                                    this.numberPlant = numberPlant;
        this.columns = columns;                              this.moves = moves;
        this.numerOfPredators = numerOfPredators;            //this.animalDied = animalDied;
        this.numberOfHerbivores = numberOfHerbivores;
        field = new Field(rows , columns);

        }
    }

