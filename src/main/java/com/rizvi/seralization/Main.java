package com.rizvi.seralization;


import java.io.*;

import static java.io.FileDescriptor.*;

public class Main {


    public static void main(String[] args) throws IOException {
        //                  steps to serialize
        //                  ------------------------------------------------------------------------
        //                  1. Your object class should implement Serializable interface
        //                  2. add import java.io.Serializable;
        //                  3. FileOutputStream fileOut = new FileOutputStream(file path);
        //                  4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
        //                  5. out.writeObject(objectName)
        //                  6. out.close();  fileOut.close();
        //                  ------------------------------------------------------------------------

        // serialization  =  The process of converting an object into byte stream.
        //                   Persists (saves the State) the object after program exists
        //                   This byte stream can be saved as a file or sent over a network
        //                   Can be sent to a different machine
        //                   Byte stream can be saved as a file  (.ser) which is platform independent
        //                   (Think of this as if you're saving a file with the object's information)

        // Deserialization = The reverse process of converting a byte stream into an object
        //                   (Think of this as if you're loading aa saved file)


        User user = new User();
        user.name = "Syed Rizvi";
        user.password = "I<3Pizza";

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(user);
            out.close();
            fileOut.close();

        System.out.println("object info saved! :)");

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);

    }
}
