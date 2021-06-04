package E_15;

import java.util.Scanner;
 /*  UCF COP3330 Summer 2021 Assignment 1 Solutions
         *  Copyright 2021 Kevin Kant
         */
public class App 
{
    public static void main( String[] args )
    {
        final String userpass = "DifoIsDad";
        Scanner reader = new Scanner(System.in);
        System.out.print( "Please Input Your Password: " );
        String userInput = reader.next();

        if(userInput.compareTo(userpass) == 0){
            System.out.println("Welcome !");
        }else{
            System.out.println("I do not Know you BEGONE");
        }
    }
}
