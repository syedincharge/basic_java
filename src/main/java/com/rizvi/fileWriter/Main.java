package com.rizvi.fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args)  {

        try {

            FileWriter writer = new FileWriter("poem.txt");
             writer.write("Roses are Red \nViolets are blue \n bootty bootyy booty \n rocking every where");
             writer.append("\n(A poem by BRO)");
            writer.close();

        }catch (IOException e) {

            e.printStackTrace();
        }
    }
}
