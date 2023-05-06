package com.rizvi.runnableInterface;

public class MyThread extends Thread {

    @Override
    public void run(){


        //  Create a subclass of Thread
        MyThread thread1 = new MyThread();

        for(int i =0; i<10; i++){
            System.out.println("Thread # 1  "  + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(" Thread  #1 is Finished :) " );


    }

}
