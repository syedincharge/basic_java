package com.rizvi.abstrac;

public class Main {

    public static void main(String[] args) {

        //  abstract keyword =  abstract classes cannot be instantiated, but the can have a subclass
        //                    abstract methods are declared without an implementation

       // Vehicle vehicle  = new Vehicle();
            Car car = new Car();
            car.go();

    }
}
