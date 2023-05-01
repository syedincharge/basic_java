package com.rizvi.arraysAndObjects;

public class Main {

    public static void main(String[] args) {

/*        int[] numbers = new int[3];
        char[] characters = new char[4];
        String[] strings = new String[5]; */

  //    Food[] refrigirator = new Food[3];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Chicken");
        Food food3 = new Food("Lamb");

       Food[] refrigirator = {food1, food2, food3};

//        refrigirator[0] = food1;
//        refrigirator[1] = food2;
//        refrigirator[2] = food3;


        System.out.println(refrigirator[0].name);
        System.out.println(refrigirator[1].name);
        System.out.println(refrigirator[2].name);

    }
}
