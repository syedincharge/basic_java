package com.rizvi.abstrac;

import java.sql.SQLOutput;

public class Car extends Vehicle{


    @Override
    void go(){
        System.out.println("The owner is driving the car");
    }
}
