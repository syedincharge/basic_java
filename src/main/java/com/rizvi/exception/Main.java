package com.rizvi.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // exception = an event that occurs during the execution of the program,
        //              that disrupts the normal flow of the program and instructions
        //                finally is executed no matter what.

            Scanner scanner = new Scanner(System.in);
        try {


            System.out.println("Enter a whole number to divide:  ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by:  ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println(" Result :  " + z);
        } catch (ArithmeticException e) {
          //  e.printStackTrace();
            System.out.println("You can't divide by zero");
        }catch (InputMismatchException e){
            System.out.println("Please enter a whole number");
        }catch (Exception e){
            System.out.println("Something wrong seriously");
        }
        finally {
            scanner.close();
        }
    }

}
