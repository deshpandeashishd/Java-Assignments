package Assignments_RKP;

import java.util.Scanner;

public class Find_Smallest3_Number_7 {

    //Find the smallest among 3 numbers
    //Logic: ******Need to fix logic, not working******
    //Get 3 numbers from user and store it in int variables
    //if a<b and b<c, print a as smallest number
    //else if b<a and b<c, print b as smallest number
    //else if c<a and c<b, print c as smallest number
    //else  (a<b and b>c), print b is largest number

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

            System.out.println("Enter 1st Number: ");
            int a = scan.nextInt();
            System.out.println("Enter 2nd Number: ");
            int b = scan.nextInt();
            System.out.println("Enter 3rd Number: ");
            int c = scan.nextInt();

        if(a<b && b<c)
        {
            System.out.println(a+" is smaller than "+b+" and "+c);
        }
        else if(b<a && a<c)
        {
            System.out.println(b+" is smaller than "+a+" and "+c);
        }
        else if(c<b && b<a)
        {
        System.out.println(c+" is smaller than "+a+" and "+b);
        }
        else
        {
            System.out.println(b+" is smaller than "+a+" and "+c);
        }


    }
}


