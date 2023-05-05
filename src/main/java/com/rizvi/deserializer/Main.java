package com.rizvi.deserializer;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //                  steps to Deserialize
        //                  ------------------------------------------------------------------------
        //                  1. Declare your object (don't instantiate)
        //                  2. Your class should implement Serializable interface
        //                  3. add import java.io.Serializable;
        //                  4. FileInputStream fileIn = new FileInputStream(file path);
        //                  5. ObjectInputStream in = new ObjectInputStream(fileIn);
        //                  6. objectNam = (Class) in.readObject();
        //                  7. in.close();  fileIn.close();
        //                  ------------------------------------------------------------------------

       // Special Notes:

        //                 1. children classes of a parent class that implements Serializable will be do so as well
        //                 2. static fields are not serialized (they belong to the class, not an individual object)
        //                 3. the class's  definition ("class file") itself is not recorded, cast it as the object type
        //                 4. Field declared as "transient" aren't serialized, they are not serialized, the are ignored
        //                 5. serialVersionUID is a unique identifier version ID


        User user = new User();
        user = null;

        FileInputStream fileIn = new FileInputStream("C:\\Users\\Syedr\\Desktop\\javapractice\\basic_java\\UserInfo.ser");

        ObjectInputStream in = new ObjectInputStream(fileIn);


            user = (User) in.readObject();
            in.close();
            fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);



    }


}
