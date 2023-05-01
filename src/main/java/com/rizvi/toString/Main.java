package com.rizvi.toString;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {


        // toString() =  special method that all objects inherit,
        //                that return a string that "textually representation" of an object.
        //                can be used both implicitly and explicitly

        Car car = new Car();

        System.out.println(car);
        System.out.println("#################");
        System.out.println(car.toString());

     }

}
