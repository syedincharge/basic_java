package com.rizvi.generics;

public class Main2 {


    public static void main(String[] args) {


        //  bounded types = you can create the objects of a generic class to have data
        //                  of a sprcific derived types ex: NUMBER


        MyGenericClass<Integer, Integer> myInt  = new MyGenericClass<>(1, 9);
        MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(3.14,1.01);


        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());

    }
}
