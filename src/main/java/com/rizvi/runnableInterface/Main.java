package com.rizvi.runnableInterface;

public class Main {


    public static void main(String[] args) throws InterruptedException {

          MyThread thread1 = new MyThread();

    //     implements Runnable interface and pass instance as an argument to thr Thread
            MyRunnable runnable1 = new MyRunnable();

            Thread thread2 = new Thread(runnable1);

            thread1.setDaemon(true);
            thread2.setDaemon(true);

            thread1.start();
     //     thread1.join(); // calling thread(ex: main) wait until the specified thread dies or for X milliseconds
            thread2.start();

        System.out.println(1/0);

            System.out.println("Thread #2 is Running : "+thread2.getName());

     //  multithreading  =    Process of executing multiple threads simultaneously
     //                       Helps maximum utilization of CPU
     //                       Threads are independent, they don't affect the execution of other threads
     //                       An exception in one thread will not interrupt other threads
     //                       useful for serving multiple clients, multiplayer games, or other mutually independent tasks







    }
}
