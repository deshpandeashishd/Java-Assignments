package Assignments_RKP;

import java.util.Scanner;

public class Find_Largest_Number_4 {

    //Find the largest among 2 numbers (Using ternary operator, if-else)
    //Logic:
    //Get 2 numbers from user and store it in int variables
    //if a > b, print a is largest number
    //else b is largest number

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int a = scan.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = scan.nextInt();

        if (a>b)
        {
            System.out.println(a+" is greater than "+b);
        }
        else
        {
            System.out.println(b+" is greater than "+a);
        }

    }

}
