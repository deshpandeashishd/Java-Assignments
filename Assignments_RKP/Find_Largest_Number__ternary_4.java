package Assignments_RKP;

import java.util.Scanner;

public class Find_Largest_Number__ternary_4 {

    //Find the largest among 2 numbers (Using ternary operator, if-else)
    //Logic:
    //Get 2 numbers from user and store it in int variables
    //(a > b)?print a is greater number: b is greater number

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int a = scan.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = scan.nextInt();

        System.out.println((a>b)?a+" is greater than "+b:b+" is greater than "+a);

    }

}
