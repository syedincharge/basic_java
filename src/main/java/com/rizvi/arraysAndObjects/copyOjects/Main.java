package com.rizvi.arraysAndObjects.copyOjects;

public class Main {

    public static void main(String[] args) {


        Car car1 = new Car("Chevy", "Camaro", 2022);
        //Car car2 = new Car("Ford", "Mustang", 2023);

        //car2.copy(car1);


        Car car2 = new Car(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getMake());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getMake());
        System.out.println(car2.getYear());


    }
}
