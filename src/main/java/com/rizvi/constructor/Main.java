package com.rizvi.constructor;

import javax.crypto.spec.PSource;

public class Main {

    public static void main(String[] args) {
        // constructors
      Human human1 = new Human("Rizvi", 65, 70.5 );
      Human human2 = new Human("Syed", 35, 55.5 );


        System.out.println("First Human Name is "+human1.name+" and he is "+human1.age + " years old with a weight of " +human1.weight +"  lbs");
        System.out.println("Second Human Name is "+human2.name+" and he is "+human2.age + " years old with a weight of " +human2.weight +"  lbs");


    }

}
