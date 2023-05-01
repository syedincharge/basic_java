package com.rizvi.fileSearch;

import javax.crypto.spec.PSource;
import java.io.File;

public class Main {

    public static void main(String[] args) {

        // file = m An abstract representation of the file and directory

        File file = new File("secret_message.txt");

        if(file.exists()) {
            System.out.println(" That file exist  :O!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            System.out.println(file.isDirectory());
            System.out.println(file.canWrite());
        }
        else {
            System.out.println(" That file does not exist :(");
        }

    }
}
