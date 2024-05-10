package Assignments_RKP;

import java.util.Scanner;

public class Find_Smallest2_Number_6 {

    //Find the smallest among 2 numbers
    //Logic:
    //Get 2 numbers from user and store it in int variables
    //if a < b, print a is smaller number
    //else b is smaller number

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int a = scan.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = scan.nextInt();

        if (a<b)
        {
            System.out.println(a+" is smaller than "+b);
        }
        else
        {
            System.out.println(b+" is smaller than "+a);
        }

    }

}
