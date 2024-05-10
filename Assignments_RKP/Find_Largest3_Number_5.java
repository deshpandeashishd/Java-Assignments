package Assignments_RKP;

import java.util.Scanner;

public class Find_Largest3_Number_5 {

    //Find the largest among 3 numbers
    //Logic: ******Need to fix logic, not working******
    //Get 3 numbers from user and store it in int variables
    //if a > b and a>c, print a as largest number
    //else if a>b and a<c, print c as largest number
    //else if a<b and b<c, print c as largest number
    //else  (a<b and b>c), print b is largest number

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        int a = scan.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = scan.nextInt();
        System.out.println("Enter 3rd Number: ");
        int c = scan.nextInt();

        if (a > b && b > c) {
            System.out.println(a + " is greater than " + b + " and " + c);
        } else if (b > a && a > c) {
            System.out.println(b + " is greater than " + a + " and " + c);
        } else if (c > b && b > a) {
            System.out.println(c + " is greater than " + a + " and " + b);
        } else if (a>b && c>a)
        {
            System.out.println(c + " is greater than " + a + " and " + b);
        }
        else if (b>a && b>a)
        System.out.println(c + " is greater than " + a + " and " + b);
    }
}



