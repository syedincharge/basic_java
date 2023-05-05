package com.rizvi.generics;

public class Main {

    public static void main(String[] args) {


        // generics  =  enables types (CLASSES and interfaces) to be parameters when defining:
        //              CLASSES,interfaces and methods
        //              a benefit is to eliminate the need to create multiple versions
        //              of methods or classes for versions data types.
        //              Use 1 version for all reference dat types



        Integer [] intArray = {1, 2, 3, 4, 5};
        Double [] doubleArray = {1.1, 2.5, 3.9, 4.8, 5.1};
        Character [] charArray = {'H', 'E', 'L', 'L', 'O'};
        String [] stringArray = {"b", "Y", "E"};

//        displayArray(intArray);
//        displayArray(doubleArray);
//        displayArray(charArray);
//        displayArray(stringArray);


        System.out.println(getFirstElement(intArray));
        System.out.println(getFirstElement(doubleArray));
        System.out.println(getFirstElement(charArray));
        System.out.println(getFirstElement(stringArray));
    }


    public static void displayArray(Integer[] array){
        for (Integer x : array ) {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    public static <Thing> void displayArray(Thing[] array){
        for (Thing x : array ) {
            System.out.print(x + " ");
        }

        System.out.println();
    }


    public static <T> T getFirstElement(T[] array){
        return array[0];
    }

}
