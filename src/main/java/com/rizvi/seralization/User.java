package com.rizvi.seralization;

import java.io.Serializable;

public class User implements Serializable {


    private static final long serialVersionUID = 1L;

    String name;
    String password;


    public void sayHello(){

        System.out.println("Welcome new User  "+name);
    }

}
