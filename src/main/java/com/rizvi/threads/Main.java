package com.rizvi.threads;

import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;

import static com.mysql.cj.jdbc.AbandonedConnectionCleanupThread.isAlive;

public class Main {


    public static void main(String[] args) throws InterruptedException {


        // Threads     =     A thread of execution in a program (kind of like a virtual CPU)  The JVM allows an
        //                    application to have multiple threads running concurrently and
        //                    Each thread can execute parts of you code in parallel with the main thread+
        //                    Each thread has a separate priority.
        //                    Threads with higher priority are executed in preference compared to threads with a lower priority

        //                    The Java Virtual Machine continues to execute threads until either of the following threads occurs
        //                    1. The exit method of class Runtime has been called
        //                    2. All user threads have died

        //                    When a JVM starts up, there is a thread which calls the main method of
        //                    This thread is called "main"

        //                    Daemon thread is a low priority thread that runs in background
        //                    to perform tasks such as garbage collection
        //                    JVM terminates itself when all user threads (non-daemon threads) finishes their execution



                           // Thread.currentThread().setName(" Main Thread ");
                           //System.out.println(Thread.activeCount());
                           //System.out.println(Thread.currentThread().getName());
                           //Thread.currentThread().setPriority(10);
                           //System.out.println(Thread.currentThread().getPriority());
                           // System.out.println(Thread.currentThread().isAlive());
/*
                        for(int i = 3; i > 0; i--){
                            System.out.println(i);
                            Thread.sleep(1000);
                        }
                 System.out.println("You are Done");*/

                 MyThread thread2 = new MyThread();
                 thread2.setDaemon(true);
                 System.out.println(thread2.isDaemon());
                 thread2.start();
                // System.out.println(thread2.isAlive());
                // thread2.setName(" 2nd Thread ");
                // System.out.println(thread2.getName());

                //System.out.println(thread2.getPriority());
                  System.out.println(Thread.activeCount());

    }
}
