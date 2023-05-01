package com.rizvi.staticMetohd;

public class Main {

    public static void main(String[] args) {

        // static  = modifier. A single copy of the variable/method is created and shared.
        //           Then class "Owns" the static member

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Spiderman");
        Friend friend3 = new Friend("Superman");
        Friend friend4 = new Friend("Heman");

        Friend.displayFriends();

        System.out.println("Total Number of Friends is "+Friend.numberOfFriends);

    }
}
