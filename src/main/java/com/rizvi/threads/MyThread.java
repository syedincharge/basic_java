package com.rizvi.threads;

public class MyThread extends Thread {

    @Override
    public void run(){

        if(this.isDaemon()){
            System.out.println("This is a Daemon Thread that is is Running");

        }
         else{
            System.out.println("This is a User Thread this is running now");
        }
    }


}
