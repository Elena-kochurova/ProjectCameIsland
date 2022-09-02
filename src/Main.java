import com.company.*;

import java.util.ArrayList;


public class Main {

        public static void main(String[] args) {

                ArrayList <Wolf> wolflist = new ArrayList<>();
                for (int i = 0 ; i < 30 ; i ++){
                        wolflist.add(new Wolf( "WOLF",50,30,20,8));
                }
                ArrayList <Snake> snakes = new ArrayList<>();
                for (int i = 0 ; i < 30 ; i ++){
                        snakes.add(new Snake( "SNAKE",15,30,1,3));
                }
                ArrayList <Fox> foxs = new ArrayList<>();
                for (int i = 0 ; i < 30 ; i ++){
                        foxs.add(new Fox( "FOX",8,30,2,2));
                }
                ArrayList <Bear> bears = new ArrayList<>();
                for (int i = 0 ; i < 5 ; i ++){
                        bears.add(new Bear( "BEER", 500,5,2,80));
                }
                ArrayList <Eagle> eagles = new ArrayList<>();
                for (int i = 0 ; i < 20 ; i ++){
                        eagles.add(new Eagle( "EAGLE", 6,20,3,1));
                }
                ArrayList <Horse> horses = new ArrayList<>();
                for (int i = 0 ; i < 20 ; i ++){
                        horses.add(new Horse( "HORSE", 400, 20,4,60));
                }
                ArrayList <Deer> deer = new ArrayList<>();  // ОЛЕНИ
                for (int i = 0 ; i < 20 ; i ++){
                        deer.add(new Deer( "DEER", 300, 20,4,50));
                }
                ArrayList <Hare> hares = new ArrayList<>(); // ЗАЙЦЫ
                for (int i = 0 ; i < 20 ; i ++){
                        hares.add(new Hare( "DEER", 2, 150,2,0.45));
                }
                ArrayList <Mouse> mouses = new ArrayList<>(); // MЫШКИ
                for (int i = 0 ; i < 500 ; i ++) {
                        mouses.add(new Mouse("MOUSE", 0.045, 500, 1, 0.01));
                }
                ArrayList <Goat> goats = new ArrayList<>(); // КОЗЫ
                for (int i = 0 ; i < 140 ; i ++) {
                        goats.add(new Goat("GOAT", 60, 140, 3, 10));
                }
                ArrayList <Sheep> sheeps = new ArrayList<>(); // ОВЦЫ
                for (int i = 0 ; i < 140 ; i ++) {
                        sheeps.add(new Sheep("SHEEP", 70, 140, 3, 15));
                }
                ArrayList <Hog> hogs = new ArrayList<>(); // КАБАНЫ
                for (int i = 0 ; i < 50 ; i ++) {
                        hogs.add(new Hog("HOG", 400, 50, 2, 50));
                }
                ArrayList <Buffalo> buffalo = new ArrayList<>(); // БУЙВОЛЫ
                for (int i = 0 ; i < 10 ; i ++) {
                        buffalo.add(new Buffalo("BUFFALO", 700, 10, 3, 100));
                }
                ArrayList <Duck> ducks = new ArrayList<>(); // УТКА
                for (int i = 0 ; i < 200 ; i ++) {
                        ducks.add(new Duck("DUCK", 1, 200, 4, 0,15 ));
                }
                ArrayList <Caterpillar> caterpillars = new ArrayList<>();
                for (int i = 0 ; i < 1000 ; i ++) {
                        caterpillars.add(new Caterpillar("CATERPILLARS", 0.01, 1000, 0, 0));
                }
                ArrayList <Plant> plants = new ArrayList<>(); // РАСТЕНИЯ
                for (int i = 1 ; i < 200 ; i ++) {
                        plants.add(new Plant ("PLANT" , 1, 200));
                }
                System.out.println( );


                ArrayList <Fieldable> allObjects = new ArrayList<>();  // заполняем лист объектами чтоб поместить их в поле
                allObjects.add((Fieldable) wolflist);                 allObjects.add((Fieldable) mouses);
                allObjects.add((Fieldable) snakes);                   allObjects.add((Fieldable) goats);
                allObjects.add((Fieldable) foxs);                     allObjects.add((Fieldable) sheeps);
                allObjects.add((Fieldable) bears);                    allObjects.add((Fieldable) hogs);
                allObjects.add((Fieldable) eagles);                   allObjects.add((Fieldable) buffalo);
                allObjects.add((Fieldable) horses);                   allObjects.add((Fieldable) ducks);
                allObjects.add((Fieldable) deer);                     allObjects.add((Fieldable) plants);


               Field [][] fild = new Field [100][200]; // СОЗДАЛИ ПОЛЕ

        }
}
