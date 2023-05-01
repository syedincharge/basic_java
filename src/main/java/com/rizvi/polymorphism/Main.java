package com.rizvi.polymorphism;

public class Main {

    public static void main(String[] args) {

        // polymorphism =  greek work for poly - " many " , morph - " form "
        //                 The ability of an object to identify as more than one type.

        Car car = new Car();
        Bicycle bike = new Bicycle();
        Boat boat = new Boat();

        Vehicle [] racers = {car, bike, boat};

//        car.go();
//        bike.go();
//        boat.go();

        for (Vehicle x : racers) {
            x.go();

        }


    }
}
