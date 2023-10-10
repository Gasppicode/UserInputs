package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String firstname = null;
        String lastname = null;

        int year = -1;
        int month = -1;
        int day = -1;

        Scanner userinput = new Scanner (System.in);




        System.out.println("Please enter your first name");
        firstname = userinput.next();

        System.out.println("Please enter your last name");
        lastname = userinput.next();

        System.out.println("First Name: " + firstname);
        System.out.println("Last Name: " + lastname);


    }
}
