package com.company;

// ПОЛЕ
public class Field {


    private int rows; // строки
    private int columns; // столбцы

    private Fieldable[][] fild;

    public Field(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;

        fild = new Fieldable[rows][columns];  // СОЗДАНИЕ ПОЛЯ
    }

    public int getColumns() {  // ЗНАТЬ КООРДИНАТЫ
        return columns;
    }

    public int getRows() {
        return rows;
    }

    public void setFildable(int x, int y, Fieldable object) {  // СОХРАНЯТЬ ОБЪЕКТЫ В ПОЛЕ
        fild[x][y] = object;
    }

    public Fieldable getFildable(int x, int y) { // ИЗВЛЕЧ
        return fild[x][y];
    }

    public void sowField() {  // МЕТОД ВЫВОДИТ ТО ЧТО СОДЕРЖИТЬСЯ В ПОЛЕ
             System.out.println();
        for (int i = 0; i < rows; i++) {
            System.out.println();
         for (int j =0 ; j < columns ; j++) {
            System.out.println(fild [rows][columns].getSymbol());
        }}

    }
}
